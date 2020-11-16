public class MergeSortedArray {
    public static void main(String[] args){
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {4,5,6};
        mergeSortedArray(arr1,3,arr2,3);
    }
    public static void mergeSortedArray(int[] nums1, int x, int[] nums2, int y) {
        int newArr[] = new int[x];
        int l=0,m=0,k=0;
        for(int i=0;i<x;i++){
            newArr[i] = nums1[i];
        }
        for(int i=0;i<nums1.length;i++){
            if(l<x && m<y){
                if(newArr[l] > nums2[m]){
                    nums1[i] = nums2[m];
                    m++;
                }
                else{
                    nums1[i] = newArr[l];
                    l++;
                }
            }
            else{
                break;
            }
            k=i+1;
        }
        if(l<newArr.length){
            for(int i=l;i<newArr.length;i++){
                nums1[k] = newArr[i];
                k++;
            }
        }
        if(m<nums2.length){
            for(int i=m;i<nums2.length;i++){
                nums1[k] = nums2[i];
                k++;
            }
        }
    }
}
