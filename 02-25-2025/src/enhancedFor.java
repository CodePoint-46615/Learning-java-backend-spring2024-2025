public class enhancedFor {
    public static void main(String[] args){
        int[] nums = new int[]{10,20,30,40,50};

        System.out.println("Traditional For Loop: ");
        //traditional for loop
        for(int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }

        System.out.println("Enhanced For loop/Short Syntax/ foreach:");
        //enhances for
        for(int num: nums){
            System.out.println(num);
        }
    }
}
