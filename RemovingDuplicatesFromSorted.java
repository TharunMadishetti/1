//Problem link ... https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/


class Solution {
    public int removeDuplicates(int[] arr) {
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
                continue;
            
            if(arr[i]==arr[j])
            {
                continue;
            }
            else
            {
                arr[++j]=arr[i];
            }
        }
        return j+1;
    }
}
