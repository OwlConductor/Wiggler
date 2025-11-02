package p2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P2_main {
    public static void main(String[] args) {
        int a = 50;
        int b = 50;
        int c = 100;
        int d = 0;
        
        // E1: a = b
        if (a==b) d++;
        // E2: a >= b | a = c
        if(a==b || a==c) d++;
        // E3: a + b_startvaluse >= c
        if(a+b>=c) d++;
        // E4: a + b + c >= 100
        if(a+b+c>=100) d++;
        // cli value of d with checkup on value, only works with Integer[] not with int[] because int is not an object type
        System.out.println((d = (Arrays.asList(new Integer[]{1,2,3,4}).contains(d)) ? d : 0));
    }
}
