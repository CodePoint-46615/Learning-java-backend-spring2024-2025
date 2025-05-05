import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> nums = new java.util.TreeSet<>();
        nums.add(50);
        nums.add(20);
        nums.add(30);
        nums.add(11);
        // nums.add(null);
        System.out.println(nums.size());
        System.out.println(nums);
    }
}