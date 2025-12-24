package net.phofers.cactuswood.api;

import java.lang.reflect.InvocationTargetException;

public class CactusWoodAPI {

    public static final String MOD_ID = "cactuswood";

    private static final InternalMethods __internalMethods;

    static {
        try {
            __internalMethods = (InternalMethods) Class.forName("net.phofers.cactuswood.InternalMethodsImpl").getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
