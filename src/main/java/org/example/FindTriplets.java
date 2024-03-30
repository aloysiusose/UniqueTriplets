package org.example;

import java.util.*;

public class FindTriplets {

    public static int [] findTriplets(int [] nums, int target){


        Map<Integer, Integer> map = new HashMap<>();

        Set<Integer> set = new HashSet<>();
        int [] triplets = new int[3];
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int n : nums){
            set.add(n);
        }
        Arrays.sort(nums);
        if(nums.length <3 || set.size() < 3){
            return new int[1]; //base case returns [0]
        }

        for (int num : nums) {

            for (int i : nums) {

                int complement = target - num - i;
                if (set.contains(complement)) {

                    triplets = new int[]{map.get(num), map.get(i), map.get(complement)};
                }
            }
        }
        return triplets;
    }

}
