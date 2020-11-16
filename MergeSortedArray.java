public class MergeSortedArray {
    public static void main(String[] args){
        int arr1[] = {};
        int arr2[] = {4,5,6};
        mergeSortedArray(arr1,arr2);
    }
    public static void mergeSortedArray(int nums1[] , int nums2[]){
        int newArr[] = new int[nums1.length+nums2.length];
        int l=0,m=0,k=0;
        for(int i=0;i<newArr.length;i++){
            if(l<nums1.length && m<nums2.length){
                if(nums1[l] > nums2[m]){
                    newArr[i] = nums2[m];
                    m++;
                }
                else{
                    newArr[i] = nums1[l];
                    l++;
                }
            }
            else{
                break;
            }
            k=i+1;
        }
        if(l<nums1.length){
            for(int i=l;i<nums1.length;i++){
                newArr[k] = nums1[i];
                k++;
            }
        }
        if(m<nums2.length){
            for(int i=m;i<nums2.length;i++){
                newArr[k] = nums2[i];
                k++;
            }
        }
    }
}
