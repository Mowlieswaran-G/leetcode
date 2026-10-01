class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        HashMap<Integer , Integer > mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int curr = nums[i];
            int need = target - curr ;
            if(mp.containsKey(need)){
                ans[0] = i;
                ans[1] = mp.get(need);
                break;
            }
            mp.put(curr , i);
        }
        return ans;
    }
}