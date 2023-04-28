public class linerScearch {
    public static void main(String[] args) {
        int[] arr = {41,41,24,14,1,4};
        int target = 1;
        int ans = LinerScearch(arr, target);
        System.out.println(ans);
    }
    static int LinerScearch(int arr[], int target){
        if(arr.length == 0 ){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int ele = arr[index];
            if(ele == target){
                return index ;
            }    
        }
        return -1;
        
    }
}
