import java.util.Arrays;

public class Leet_1658 {
    public static void main(String[] args) {
        int [] nums = {6016,5483,541,4325,8149,3515,7865,2209,9623,9763,4052,6540,2123,2074,765,7520,4941,5290,5868,6150,6006,6077,2856,7826,9119};
        int x  = 31841;
        
       System.out.println(minOperations(nums , x));
    }
    static int minOperations(int[] nums, int x) {
        var R  = 0;
        var L = 0 ; 
        var cur_sum = 0;
        var min_len = nums.length;
        // var min_len = -1; 
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        while (R < nums.length){
            x = x - nums[R];
            R++;


            while(L < R && x <= 0){
                min_len = Math.min(min_len, R-L  );

                if(x==0 && cur_sum > min_len){
                    cur_sum =  min_len;
                }
                x = x + nums[L];
                L ++;

                

            }
        }
        return min_len;

    }
}

