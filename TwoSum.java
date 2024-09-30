
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        System.out.println("Two sum solution: " + solution.twoSum(new int[] {2,7,11,15, 2}, 9));

    }

    public List<Integer[]> twoSum(int[] arr, int target) {
        List<Integer[]> allValues = new ArrayList<>();
        Integer[] retVal = new Integer[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i< arr.length; i++) {
            int first = arr[i];
            if (!map.containsKey(i)) {
                map.put(first, i);
            }
            int second = target - first;
            if (map.containsKey(second)) {
                retVal[0] = i;
                retVal[1] = map.get(second);
                System.out.println(Arrays.toString(retVal));
                allValues.add(retVal);
            }
        }
        return allValues;
    }

}