public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int A [] = {-4,-1,0,3,10};
        int result[] = sortedSquares(A);
        System.out.println("Sorted Array of Squares :" );
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
    public static int[] sortedSquares(int[] A) {
        int left = 0,right = A.length-1;
        int resultArray[] = new int[A.length];;
        for(int i=A.length-1;i>=0;i--){
            if( Math.abs(A[left])>Math.abs(A[right]) ){
                resultArray[i] = A[left]*A[left];
                left++;
            }
            else{
                resultArray[i] = A[right]*A[right];
                right--;
            }
        }
        return resultArray;
    }
}
