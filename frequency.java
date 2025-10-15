import java.util.*;

public class frequency {
    public static List<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
        int count1 = 0, count2 =0;
        Integer candidate1= null, candidate2 = null;
        
        for (int num : arr) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int num : arr) {
            if (num == candidate1) count1++;
            else if (num == candidate2) count2++;
        }

        // Step 3: Add valid candidates to result
        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(candidate1);
        if (count2 > n / 3) result.add(candidate2);

        
        Collections.sort(result);
        return result;
    }
        public static void main(String[] args) {
        int[] arr1 = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 ,6,7,7,7,7,7} ;
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println(findMajority(arr1)); 
        System.out.println(findMajority(arr2)); 
    }
}