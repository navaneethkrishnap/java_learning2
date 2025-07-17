package lang.practice.systemClass;

public class environment_properties {
    public static void main(String[] args){
        System.out.println("Enviroment properties: ");
        System.out.println("java.home-> "+System.getProperty("java.home"));
        System.out.println("java.class.path-> "+System.getProperty("java.class.path"));
        System.out.println("java.class.version-> "+System.getProperty("java.class.version"));
        System.out.println("java.version-> "+System.getProperty("java.version"));
        System.out.println("java.ext.dirs-> "+System.getProperty("java.ext.dirs"));
        System.out.println("java.specification.name-> "+System.getProperty("java.specification.name"));
        System.out.println("java.specification.vendor-> "+System.getProperty("java.specification.vendor"));
        System.out.println("java.specification.version-> "+System.getProperty("java.specification.version"));
        System.out.println("java.specification.url-> "+System.getProperty("java.specification.url"));
        System.out.println("java.vm.specification.name-> "+System.getProperty("java.vm.specification.name"));
        System.out.println("java.vm.specification.vendor-> "+System.getProperty("java.vm.specification.vendor"));
        System.out.println("java.vm.specification.version-> "+System.getProperty("java.vm.specification.version"));
        System.out.println("java.vm.vendor-> "+System.getProperty("java.vm.vendor"));
        System.out.println("java.vm.version-> "+System.getProperty("java.vm.version"));
        System.out.println("line.separator-> "+System.getProperty("line.separator"));
        System.out.println("os.arch-> "+System.getProperty("os.arch"));
        System.out.println("os.name-> "+System.getProperty("os.name"));
        System.out.println("os.version-> "+System.getProperty("os.version"));
        System.out.println("file.separator-> "+System.getProperty("file.separator"));
        System.out.println("path.separator-> "+System.getProperty("path.separator"));
        System.out.println("user.dir-> "+System.getProperty("user.dir"));
        System.out.println("user.home-> "+System.getProperty("user.home"));
        System.out.println("user.name-> "+System.getProperty("user.name"));


    }
}
