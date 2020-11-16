class DuplicateZeros {
    public static void main(String[] args){
        int arr[] = {1,0,0,2,3,4,5,0};
        duplicateZeros(arr);
        for(int i: arr){
            System.out.println(i);
        } 
    }
    public static void duplicateZeros(int arr[]){
        int possibleDups = 0;
        int length_ = arr.length - 1;
        boolean checkZeroAtLast = false;
        for (int left = 0; left <= length_ - possibleDups; left++) {
            if (arr[left] == 0) {
                if (left == length_ - possibleDups) {
                    arr[length_] = 0;
                    length_ -= 1;
                    checkZeroAtLast = true;
                    break;
                }
                possibleDups++;
            }
        }
        int last = length_ - possibleDups;

        if(!checkZeroAtLast){
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }
    }      
    }
}