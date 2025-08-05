package lang.practice;

/*
Here you have waitFor() and exitValue() method
 */

public class exec_method1 {
    public static void main(String[] args){
        Runtime r = Runtime.getRuntime();
        Process p = null;

        try{
            p = r.exec("notepad");
            p.waitFor();
        } catch (Exception e){
            System.out.println("Error executing notepad.");
        }

        int code = p.exitValue();
        if (code == 0) {
            System.out.println("Backup successful!");
        } else {
            System.out.println("Backup failed! Exit code: " + code);
        }

    }
}


