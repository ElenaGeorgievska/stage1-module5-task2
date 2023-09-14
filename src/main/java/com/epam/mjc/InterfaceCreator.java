package com.epam.mjc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return arg -> arg.stream()
                .map(e -> e / divider)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        //List<Integer> result = new InterfaceCreator().divideBy(3).apply(numbers);

        int divider = 3;
        List<Integer> integers = Arrays.asList(3, 6, 9);
        InterfaceCreator ic = new InterfaceCreator();
        ic.divideBy(divider).apply(integers);
        System.out.println(ic.divideBy(divider).apply(integers));
    }
}
