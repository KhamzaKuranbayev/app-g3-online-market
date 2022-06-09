package model;

import java.util.UUID;

public abstract class AbsUUID {
    protected final UUID ID = UUID.randomUUID();

    public UUID getID() {
        return ID;
    }
}
