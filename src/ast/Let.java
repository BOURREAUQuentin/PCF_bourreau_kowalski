package ast;

import interp.Env;
import interp.Value;

public class Let extends Term {
    public String id;
    public Term definition;
    public Term body;

    public Let(String id, Term definition, Term body) {
        this.id = id;
        this.definition = definition;
        this.body = body;
    }

    @Override
    public Value interp(Env e) {
        Value defVal = definition.interp(e);

        Env newEnv = e.add(id, defVal);

        return body.interp(newEnv);
    }
}