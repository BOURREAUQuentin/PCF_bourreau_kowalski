package interp;

import ast.Term;

public class Closure implements Value {
    public String arg; // nom du paramètre (ex: "x")
    public Term body; // corps de la fonction
    public Env env; // environnement capturé

    public Closure(String arg, Term body, Env env) {
        this.arg = arg;
        this.body = body;
        this.env = env;
    }

    @Override
    public String toString() {
        return "(fun " + arg + " -> " + body + ")";
    }
}