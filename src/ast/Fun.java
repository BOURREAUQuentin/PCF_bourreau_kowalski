package ast;

import interp.Env;
import interp.Closure;
import interp.Value;

public class Fun extends Term {
    public String arg;
    public Term body;

    public Fun(String arg, Term body) {
        this.arg = arg;
        this.body = body;
    }

    @Override
    public Value interp(Env e) {
        return new Closure(arg, body, e);
    }

    @Override
    public String toString() {
        return "fun " + arg + " -> " + body;
    }
}