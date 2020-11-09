class FindTotalEvenDigNums {
    public static void main (String [] args){
        int nums[] = {22,444,1231,123123124,231231};
        System.out.println("Total Count of Even digit Number :"+findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int countOfEvenDigitNumbers = 0;
        for(int i=0;i<nums.length;i++){
            if(Integer.toString(nums[i]).length()%2==0){
                countOfEvenDigitNumbers++;
            }
        }
        return countOfEvenDigitNumbers;
    }
}