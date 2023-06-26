public class MoveZero {

    public static int[] moveZeros(int[] nums) {
        int[] nonZero = new int[nums.length];
        int nonZeroIndex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZero[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        
        return nonZero;

       /* OTHER WAY TO DO IT 
       for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex++] = 0;
        } 
       */
    }


    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 5, 10};
        int[] result = moveZeros(nums);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}




