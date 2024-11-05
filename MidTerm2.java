import java.util.Scanner;
import java.util.Random;
public class MidTerm2 {

    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        Random g  = new Random();
        int N, worker = 0;
        System.out.print("Enter the number of staff [N]: ");
        N = keyboard.nextInt();

        for(int i = 1 ; i <= N ; i++){

            int random = g.nextInt(90000) + 10000;
            System.out.println("Staff ID: " + random);
//            String randomId= String.valueOf(random);
            int odd = random / 1000;
            int even = random / 10;


            if (odd % 2  != 0 && even % 2 == 0 ){
                System.out.println("Weekend on");
                worker ++;
            }
            else
                System.out.println("Weekend off");


        }
        System.out.println("The number of staff work during weekend is " + worker);

   }







}
