package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        int[] nums = {1, 0, -3, 2, -2, 4};

        int target = 2;

//        int[] nums = {1, 0, -1, 0, 2, -2};
//        int target = 0;

        var result = FindTriplets.findTriplets(nums, target);

        System.out.println(Arrays.toString(result));
    }
}