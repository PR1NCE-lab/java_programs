import java.util.Arrays;

public class Leet_34 {
    //incomplete 
    public static void main(String[] args) {
         int nums [] ={5,7,7,8,8,10};
         int target = 8;

        int l = 0;
        int r = nums.length -1  ;
        int [] ans = {-1,-1};
        boolean found = false;
        while(l<=r){
            int  mid = l + ((r-l)>> 1);
            if(found){
                break;
            }
            if(nums[mid] > target ){
                
                r = mid-1;

            }
            else if(target == nums[mid]){
                found = true;
                // check for both side
                if(nums[mid + 1] == target){
                    r = mid +1 ;
                }
                else if(nums[mid - 1] == target){
                    l = mid -1 ;
                }
                
            }
            else{
                l  = mid +1 ;

            }

        }
        if(found){
            ans[0] = l;
            ans[1] = r ;

            System.out.println(Arrays.toString(ans));
        }
        else{
            System.out.println(Arrays.toString(ans));
        }
    }

    }

