package lang.practice;

public class PkgTest {
    public static void main(String[] args) {
        Package p[];

        p = Package.getPackages();

        for(int i = 0; i < p.length; i++){
            System.out.println(p[i].getName() + " "+
                    p[i].getImplementationTitle() + " " +
                    p[i].getImplementationVendor() + " " +
                    p[i].getImplementationVersion());
        }
    }
}
