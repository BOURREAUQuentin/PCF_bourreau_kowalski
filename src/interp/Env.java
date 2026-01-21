package interp;

import java.util.Optional;

public abstract class Env {
    // nouvel environnement avec la variable 'id' liée à la valeur 'v'
    public abstract Env add(String id, Value v);

    // cherche la valeur associée à 'id'
    public abstract Optional<Value> lookup(String id);
}