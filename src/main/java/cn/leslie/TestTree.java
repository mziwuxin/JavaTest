package cn.leslie;

import java.util.Arrays;

public class TestTree {
    public static void main( String[] args ){
        int[] list={7,9,13,16,8,4,3,99};
        Arrays.sort(list);
        System.out.println(list[list.length-2]);
    }
}
