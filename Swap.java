public class Swap {
    static int a=2 ,b=3 ;
    public static void main(String[] args) {
    //Swaping number

        
        
        System.out.println(a +" "+ b);
        swap(a,b);
    }
    static void swap(int a ,int b) {
        
        int temp = a;
        a = b;
        b = temp;
    }
}
