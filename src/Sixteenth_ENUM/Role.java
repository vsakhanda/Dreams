package Sixteenth_ENUM;

import java.util.HashMap;
import java.util.Map;

public enum Role {

    USER (1, "User"),
    ADMIN(2, "Admin"),
    MODERATOR (3, "Moderator");


    public static final Map<Integer, Role> ROLE_MAP = new HashMap<>();

    static
    {
        for (Role role : Role.values()){
            ROLE_MAP.put(role.id, role);
        }
    }


    private final int id;
    private final String value;

    Role(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public static Role getById (int id) {
        return ROLE_MAP.get(id);
    }

    public String getValue() {return value; }


}
