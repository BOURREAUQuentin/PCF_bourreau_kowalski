package interp;

import ast.Term;

public class Closure implements Value {
    public String arg;
    public Term body;
    public Env env;

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