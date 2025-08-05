package basicAnnotations;

public class LegacyUtilsDemo{
    public static void main(String[] args) {
        LegacyUtils.oldMethod(); // Compiler warns: oldMethod() is deprecated
        LegacyUtils.newMethod();    
    }
}
