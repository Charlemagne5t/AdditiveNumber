public class Solution {
    public boolean isAdditiveNumber(String num) {
        int n = num.length();
        if(n < 3){
            return false;
        }
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = num.charAt(i) - '0';
        }
        int maxL = n / 2 + 1;
        for(int i = 0; i <= maxL; i++){
            long start = 0;
            int k = i;
            while(k >= 0){
                start += (long)Math.pow(10, i - k) * nums[k];
                k--;
            }
            if(start == 0){
                return backtrack(nums, 1, 0, 0, 1);
            }
            if(backtrack(nums, i + 1, start, 0, 1)){
                return true;
            }
        }

        return false;
    }

    private boolean backtrack(int[] nums, int i, long prev, long sum, int count){
        if(i == nums.length && count >= 3){
            return true;
        }
        if(i == nums.length){
            return false;
        }

        if(sum == 0){
            if(nums[i] == 0){
                return backtrack(nums, i + 1, 0, prev, count + 1);
            }else {
                for (int j = i; j < nums.length; j++) {
                    long next = 0;
                    int k = i;
                    while (k <= j){
                        next = next * 10 + nums[k++];
                    }
                    if (backtrack(nums, j + 1, next, prev + next, count + 1)) {
                        return true;
                    }
                }
            }
        }else{
            if(nums[i] == 0){
                return false;
            }
            long next = 0;
            int j = i;
            while(j < nums.length && sum > next){
                next = next * 10 + nums[j];
                j++;
            }
            if(j < nums.length - 1 && nums[j] == 0 ){
                return false;
            }
            if(next == sum){
                return backtrack(nums, j, next, next + prev, count + 1);
            }else return false;
        }

        return false;
    }
}
