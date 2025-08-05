package lang.practice;

import java.io.IOException;

public class exitCode {
    public static void main(String[] args){

        try{
            Process p = Runtime.getRuntime().exec("ping -n 3 google.com");

            int exitCode = p.waitFor();

            if(exitCode == 0) System.out.println("Ping successful");
            else System.out.println("Ping failed with exit code "+ exitCode);

        } catch(IOException e ) {
            System.out.println("IOException occurred "+ e.getMessage());
            e.printStackTrace();
        } catch(InterruptedException e){
            System.out.println("process was interrupted "+e.getMessage());
            e.printStackTrace();
        }
    }
}
