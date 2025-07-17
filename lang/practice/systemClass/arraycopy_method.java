package lang.practice.systemClass;

import java.util.Arrays;

public class arraycopy_method {
    public static void main(String[] args){
        int[] src = {1,2,3,4,5};
        int[] dest = new int[5];
        int[] dest_length = new int[5];

        System.arraycopy(src,0,dest,0,5);
        System.out.print("dest : ");
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest_length,0,4);
        System.out.print("dest_length : ");
        System.out.println(Arrays.toString(dest_length));
    }
}
