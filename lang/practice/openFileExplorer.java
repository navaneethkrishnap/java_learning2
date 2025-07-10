package lang.practice;

public class openFileExplorer {
    public static void main(String[] args) throws Exception{
        // opens C:\Users
        String folderPath = "C:\\Users";
        String command = "explorer.exe "+folderPath;
        Process p = Runtime.getRuntime().exec(command);
        p.waitFor();
        System.out.println("File Explorer opened!");
    }
}
