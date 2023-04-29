import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
        try (// Stack<Character> st = new Stack<>(); 
        Scanner sc = new Scanner(System.in)) {
            // switch case
            String fruit = sc.next();
            switch(fruit){
                case "apple":
                    System.out.println("->reed fruit");
                    break;
                case "mango":
                    System.out.println("->king fruit");
                    break;

                case "banana":
                    System.out.println("-> yellow berry");
                    break;

                case "orange":
                    System.out.println("->orange fruit");
                    break;

                case "grapes":
                    System.out.println("->green berry");
                    break;


            }
        }

    }
}


