
class Solution {
    // best solution https://www.youtube.com/watch?v=q6IEA26hvXc
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] results = new int[nums1.length + nums2.length];
        int curr1 = 0;
        int curr2 = 0;
        int index = 0;
         int length = results.length;
         while(curr1 < nums1.length&& curr2 < nums2.length){
            if(nums1[curr1] < nums2[curr2]){
                results[index] = nums1[curr1];
                curr1++;
            }
            else{
                results[index] = nums2[curr2];
                curr2++;
            }
             if(index > length /2 ) break;
            index ++;
        }
        
        while(curr1 < nums1.length){
            if(index > length /2 ) break;
             results[index++] =  nums1[curr1++];
            
        }
        while(curr2 < nums2.length){
            if(index > length/2 ) break;
            results[index++] =  nums2[curr2++];
        } 
        
        
     
        return length % 2 == 0 ? (results[length/2] + results[length/2 - 1])/2.0f  : results[length/2]; 
    }
}