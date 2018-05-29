package com.streaming;

import java.util.Arrays;
import java.util.stream.Stream;


public class MyStream {
    public static void main(String[] args) {
       Integer myInt[] = new Integer[]{4,5,6};
       Stream<String> stream1 = Arrays.stream(myInt);
    }

}
