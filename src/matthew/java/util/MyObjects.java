package matthew.java.util;

// TODO complete
public final class MyObjects {
    private MyObjects() {
        // TODO throw new MyAssertionError("No java.util.Objects instances for you!");
    }
    public static boolean equals(Object a, Object b) {
        return (a == b) || (a != null && a.equals(b));
    }
    public static boolean deepEquals(Object a, Object b) {
        if (a == b) {
            return true;
        } else if (a == null || b == null) {
            return false;
        } else {
            // TODO return MyArrays.deepEquals0(a, b);
            return true;
        }
    }
    public static int hashCode(Object o) {
        return o != null ? o.hashCode() : 0;
    }
    public static int hash(Object... values) {
        // TODO return Arrays.hashCode(values);
        return 1;
    }
    public static String toString(Object o) {
        // TODO return MyString.valueOf(0);
        return "1";
    }

}
