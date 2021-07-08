package com.github.hcsp;

import org.apache.commons.lang3.StringUtils;
import java.lang.String;//这句话可以不写，只要类是在java.lang下面的，都可以不写import

public class Main {
    public static void main(String[] args) {
        System.out.println("Empty string is empty: " + StringUtils.isEmpty(""));
    }
}
