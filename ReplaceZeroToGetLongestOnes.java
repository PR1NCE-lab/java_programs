
public class ReplaceZeroToGetLongestOnes {
    public int getRequiredIndex(int[] arr) {

        int prevPrevZeroIndex = -1;
        int PrevZeroIndex = -1;
        int curLength = -1;
        int MaxLength = -1;
        int RequiredIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {

                if (prevPrevZeroIndex != -1) {

                    curLength = i - prevPrevZeroIndex - 1;

                    if (curLength > MaxLength) {
                        MaxLength = curLength;
                        RequiredIndex = PrevZeroIndex;
                    }
                }
                prevPrevZeroIndex = PrevZeroIndex;
                PrevZeroIndex =i ;
                
            }
        }
        if(MaxLength ==-1)
        {
            if(prevPrevZeroIndex!=-1){
 // and the length of 1s sequence after replacing 0 at 'prevZeroIndex' would be (Array.length - prevPrevZeroIndexIndex - 1) 
                
                if(PrevZeroIndex > arr.length -prevPrevZeroIndex-1){
                    RequiredIndex=prevPrevZeroIndex;
                }
                else{
                    RequiredIndex=PrevZeroIndex;
                }
            }
            else{
                RequiredIndex=PrevZeroIndex;
            }
        }
        return RequiredIndex;
    }
    public static void main(String[] args) {
        ReplaceZeroToGetLongestOnes sol = new ReplaceZeroToGetLongestOnes();
        int [] arr = {0,1,0,0,1,1,1,0,1,1,0};
        System.out.print("For array :");
        for(int i=0;i< arr.length;i++){System.out.print(arr[i]);};
        System.out.println("");
        System.out.println("-> "+sol.getRequiredIndex(arr));
    }
}