public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int nums[] = {0};
        System.out.println("Most consecutive Number Of Ones Are :"+findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int countofOnes = 0;
        int maxCountOfOnes = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                countofOnes++;
                if(maxCountOfOnes<countofOnes){
                    maxCountOfOnes = countofOnes;
                }
            }
            else{
                countofOnes=0;
            }
        }
        return maxCountOfOnes;
    }
}