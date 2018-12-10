package matthew.java.lang;

public class MyObject {
    private static native void registerNatives();
    static {
        registerNatives();
    }
    public final native Class<?> getMyClass();
    public native int hashCode();
    public boolean equals(Object obj) {
        return (this == obj);
    }
    // TODO protected native Object clone() throws CloneNotSupportedException;
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
