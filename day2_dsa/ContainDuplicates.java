package day2_dsa;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicates {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = new int[]{2, 4, 31, 4, 3, 6, 1};

        System.out.println(containsDuplicate(arr));

    }
}
