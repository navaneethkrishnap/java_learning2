package basicAnnotations;

import java.util.ArrayList;
import java.util.List;

public class SuppressWarningsDemo {

    @SuppressWarnings("unchecked")
    public void rawTypeExample(){
        List rawList = new ArrayList(); // raw type
        rawList.add("Hello");
        List<String> strings = rawList;
        System.out.println(strings.get(0));
    }

    @SuppressWarnings({"unchecked","rawtype"})
    public void multipleSuppresion(){
        List raw = new ArrayList();
        raw.add("world");
        List<String> list = raw;
        System.out.println(list.get(0));
    }

    @SuppressWarnings("deprecation")
    public void usingDeprecated(){
        LegacyUtils.oldMethod(); // normally emits a deprecation warning; suppressed here
    }

    public static void main(String[] args) {
        SuppressWarningsDemo x = new SuppressWarningsDemo();
        x.multipleSuppresion();
        x.rawTypeExample();
        x.usingDeprecated();
    }
}

