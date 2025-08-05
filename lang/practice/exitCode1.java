package lang.practice;
import java.io.*;
public class exitCode1 {
        public static void main(String[] args) {
            try {
                // Choose command depending on OS
                String os = System.getProperty("os.name").toLowerCase();
                String command;
                if (os.contains("win")) {
                    command = "ping -n 3 google.com";
                } else {
                    command = "ping -c 3 google.com";
                }

                Process p = Runtime.getRuntime().exec(command);

                // Read standard output
                BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String line;
                System.out.println("Output from ping command:");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }

                // Wait for process to finish
                int exitCode = p.waitFor();
                System.out.println("Exit code: " + exitCode);

                if (exitCode == 0) {
                    System.out.println("Ping successful");
                } else {
                    System.out.println("Ping failed with exit code " + exitCode);
                }

            } catch (IOException e) {
                System.out.println("IOException occurred: " + e.getMessage());
                e.printStackTrace();
            } catch (InterruptedException e) {
                System.out.println("Process was interrupted: " + e.getMessage());
                e.printStackTrace();
            }
        }


}
