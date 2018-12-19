package com.flower;

import java.util.Optional;

public class test {
    public static void main(String[] args) {

        String str = null;

        Optional<String> result = Optional.ofNullable("1111");
        if (result.isPresent()){
            System.out.println(11);
        }
        result.ifPresent(System.out::println);

    }
}
