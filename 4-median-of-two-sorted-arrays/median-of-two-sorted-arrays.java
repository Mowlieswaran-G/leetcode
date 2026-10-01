class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int n = result.length;
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            result[k] = arr1[i];
            k++;
        }
        for (int i = 0; i < arr2.length; i++) {
            result[k] = arr2[i];
            k++;
        }
        Arrays.sort(result);
        int index=0;
        float temp = 0;
        if(n%2==0){
            index = n/2;
            temp = (result[index]+result[index-1]);
            temp = temp/2;
        }else {
            index = n / 2;
            temp = result[index];
        }
        return temp;
    }
}