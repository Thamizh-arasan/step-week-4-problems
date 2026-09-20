import java.util.HashMap;

public class SubarraySumEqualsK {
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);

        int currentSum = 0;
        int count = 0;

        for (int num : nums) {
            currentSum += num;

            if (frequency.containsKey(currentSum - k)) {
                count += frequency.get(currentSum - k);
            }

            frequency.put(currentSum,
                    frequency.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        System.out.println(subarraySum(nums, 2));
    }
}