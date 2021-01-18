package moe.kira.common.utils;

public abstract class Asserts {
    public static void requiresNonnull(Object object) {
        assert object != null : "Must not be null";
    }
}