public class VivaQ2 { 
  public static void main(String[] args){
  Scanner keyboard = new Scanner(System.in);
        int n, a, b,steps = 0; 
                     // n is number that we need to do sequences of step to minimize it until 1
                     // a is the number that we are going to subtracts
                     // b is the number that we are going to divide if it is divisible
        
        System.out.println("Input: ");
        
        n = keyboard.nextInt(); 
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        // This is not going to be inside a loop structure
        
        do {if (!(n >= 1 && n <= 1000000000 )){
            System.out.print("Please enter n again: ");
             n = keyboard.nextInt(); 
        }
        }while (!(n >= 1 && n <= 1000000000 ));
        
        do {if (!(a >= 1 && a <= n )){
            System.out.print("Please enter a again: ");
             a = keyboard.nextInt(); 
        }
        }while (!(a >= 1 && a <= n ));
        
        do {if (!(b >= 2 && b <= 100000 )){
            System.out.print("Please enter n again: ");
             b = keyboard.nextInt(); 
        }
        }while (!(b >= 2 && b <= 1000000000 )); // Above are all for the constraints
        
        
       
        while (n != 1){ //here is the problem.
            if (n%b == 0 ){
                n = n/b;
                steps++;
            }
            else if (n-a < 1){
                steps = -1;
                break;//some code errors at here.
            }
            else{ 
                n= n-a;
                steps++;}
            
            
        }
        System.out.println("Output: ");
        System.out.print(steps);
        
}}
