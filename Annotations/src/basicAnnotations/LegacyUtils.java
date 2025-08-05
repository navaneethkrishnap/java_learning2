package basicAnnotations;

public class LegacyUtils {
    /**
     * @deprecated
     * use {newMethod()} instead.
     */
    @Deprecated(since = "2.0", forRemoval = true)
    public static void oldMethod(){
        System.out.println("Old behavior version 1.0");
    }

    public static void newMethod(){
        System.out.println("New Behaviour version 2.0");
    }

}

