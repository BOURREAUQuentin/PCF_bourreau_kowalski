package interp;

import ast.Term;

public class IceCube implements Value {
    public String id;     // Le nom de la fonction récursive (ex: "fact")
    public Term term;     // Le corps de la définition (ex: fun x -> ...)
    public Env env;       // L'environnement capturé

    public IceCube(String id, Term term, Env env) {
        this.id = id;
        this.term = term;
        this.env = env;
    }

    @Override
    public String toString() {
        return "fix " + id;
    }
}