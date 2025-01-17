import java.util.HashSet;

public class Java{

    static boolean twoSum(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++){
            int complement = target - arr[i];

            if(set.contains(complement)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        System.out.println(twoSum(arr, target));
    }
}