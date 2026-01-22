package ast;

import interp.Env;
import interp.IceCube;
import interp.Value;
import java.util.Optional;

public class Var extends Term {
    public String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public Value interp(Env e) {
        // 1. Recherche standard
        Optional<Value> valOpt = e.lookup(name);

        if (valOpt.isEmpty()) {
            throw new RuntimeException("Variable non définie : " + name);
        }

        Value val = valOpt.get();

        // 2. Gestion Spéciale PCF Noir (IceCube)
        if (val instanceof IceCube) {
            IceCube cube = (IceCube) val;
            // On doit "dérouler" la récursion d'un niveau.
            // On interprète le corps du fix (cube.term)
            // Dans l'environnement capturé (cube.env) étendu avec le glaçon lui-même (cube.id -> cube)
            Env recursiveEnv = cube.env.add(cube.id, cube);
            return cube.term.interp(recursiveEnv);
        }

        return val;
    }

    @Override
    public String toString() {
        return name;
    }
}