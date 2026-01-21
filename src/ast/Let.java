package ast;

import interp.Env;
import interp.Value;

public class Let extends Term {
    public String id;
    public Term definition; // terme à droite du =
    public Term body; // terme après le in

    public Let(String id, Term definition, Term body) {
        this.id = id;
        this.definition = definition;
        this.body = body;
    }

    @Override
    public Value interp(Env e) {
        // évalue la définition dans l'environnement actuel
        Value defVal = definition.interp(e);

        // étend l'environnement avec la nouvelle variable
        Env newEnv = e.add(id, defVal);

        // évalue le corps avec le nouvel environnement
        return body.interp(newEnv);
    }
}