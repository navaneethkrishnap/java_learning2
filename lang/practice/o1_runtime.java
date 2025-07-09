package lang.practice;

public class o1_runtime {
    public static void main(String[] args){
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors: "+runtime.availableProcessors());
        System.out.println("Free memory: "+runtime.freeMemory());
    }
}
