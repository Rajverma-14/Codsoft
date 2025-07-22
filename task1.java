import java.util.*;
class number_game {
    public static void main(String args[]) {
        int ra = (int) (Math.random() * 100);
        System.out.println(ra);
        Scanner sc = new Scanner(System.in);
        boolean a = true;
        System.out.println("The No. is ready, start Guessing.");
        while (a == true) {
            int b = sc.nextInt();
            if (b > 100){
                System.out.println("The No. generated is in range 0 to 100");
            System.out.println("Try Again.");
            }
            else {
                if (b == ra) {
                    System.out.println("CONRATS!!, You  have guessed right.");
                    a = false;
                } else if (((b - ra) < 10) && ((b - ra) > -10))
                    System.out.println("You are close!!");
                else if ((b - ra) > 10)
                    System.out.println("Too High!!");
                else
                    System.out.println("Too Low!!");
            }
        }
    }
}
