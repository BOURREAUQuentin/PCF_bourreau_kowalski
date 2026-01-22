package ast;

import interp.Env;
import interp.Value;
import java.util.Optional;

public class Var extends Term {
    public String name;

    public Var(String name) {
        this.name = name;
    }

    @Override
    public Value interp(Env e) {
        Optional<Value> val = e.lookup(name);

        if (val.isEmpty()) {
            throw new RuntimeException("Variable non définie : " + name);
        }

        return val.get();
    }
}