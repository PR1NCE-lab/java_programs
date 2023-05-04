import java.util.Arrays;

public class overloding {
    public static void main(String[] args) {
        temp(23);
        temp("dasfafa","asdasdas","asfafgaFG");
    }
    static void temp(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void temp(String ...y)
    {
        System.out.println(Arrays.toString(y));
    }

}
