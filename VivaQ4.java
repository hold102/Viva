import java.util.Scanner;
public class VivaQ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option1, option2, option3, option4;
        float price = 0;
        int pizza = 0;
        int drink = 0;
        int dessert = 0;
        //initialize all the variable
        while(true){
        System.out.println();
        System.out.println("Welcome to Maroni's Pizza!");
        System.out.println("1. Pizza");
        System.out.println("2. Drinks");
        System.out.println("3. Dessert");
        System.out.println("4. CHECKOUT");
        System.out.print("Pick an option (1,2,3,4): ");
        option1 = scanner.nextInt();
        //print out the main menu 
       //This one is label for option 6 to return back main menu     
       return_menu:{         
       while(true){
        switch(option1){
        //sub-menu for PIZZA    
            case 1:
                System.out.println();  
                System.out.println("PIZZA");
                System.out.println("1 Chicken Pepperoni - RM15");
                System.out.println("2 Chicken Supreme - RM18");
                System.out.println("3 Vegan Indulgence - RM12");
                System.out.println("4 Beef Delight - RM22");
                System.out.println("5 Margherita - RM9");
                System.out.println("6 BACK TO MENU");
                System.out.print("Pick an option (1,2,3,4,5,6): ");
                option2 = scanner.nextInt();
        
                if (option2==1){
                    price+=15;
                    pizza++;
                    System.out.println("Added Chicken Pepperoni");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option2==2){
                    price+=18;
                    pizza++;
                    System.out.println("Added Chicken Supreme");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option2==3){
                    price+=12;
                    pizza++;
                    System.out.println("Added Vegan Indulgence");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option2==4){
                    price+=22;
                    pizza++;
                    System.out.println("Added Beef Delight");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option2==5){
                    price+=9;
                    pizza++;
                    System.out.println("Added Margherita");
                    System.out.println("Current Total: RM"+price);
                    break;
                //to go back to the main menu with label
                }else if (option2==6){
                    break return_menu;
                //to avoid invalid input
                }else{
                    System.out.println("An error has occurred, please try again.");
                    break;
                        }
            //sub-menu for DRINKS                           
            case 2:
                System.out.println();
                System.out.println("DRINKS");
                System.out.println("1 Strawberry Smoothie - RM8");
                System.out.println("2 Banana Smoothie - RM8");
                System.out.println("3 Mocktail - RM12");
                System.out.println("4 Soft Drink - RM5");
                System.out.println("5 Mineral Water - RM3");
                System.out.println("6 BACK TO MENU");
                System.out.print("Pick an option (1,2,3,4,5,6): ");
                option3 = scanner.nextInt();
                
                if (option3==1){
                    price+=8;
                    drink++;
                    System.out.println("Added Strawberry Smoothie");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option3==2){
                    price+=8;
                    drink++;
                    System.out.println("Added Banana Smoothie");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option3==3){
                    price+=12;
                    drink++;
                    System.out.println("Added Mocktail");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option3==4){
                    price+=5;
                    drink++;
                    System.out.println("Added Soft Drink");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option3==5){
                    price+=3;
                    drink++;
                    System.out.println("Added Mineral Water");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option3==6){
                    break return_menu;
                // to avoid invalid input       
                }else{
                    System.out.println("An error has occurred, please try again.");
                    break;
                        }   
            //sub-menu for DESSERT      
            case 3:
                System.out.println();
                System.out.println("DESSERT");
                System.out.println("1 Tiramisu - RM7 ");
                System.out.println("2 Strawberry Shortcake - RM10");
                System.out.println("3 Green Jello - RM4");
                System.out.println("4 Creme1 Brulee - RM15");
                System.out.println("5 Raspberry Pie - RM20");
                System.out.println("6 BACK TO MENU");
                System.out.print("Pick an option (1,2,3,4,5,6): ");
                option4 = scanner.nextInt();
               
                if (option4==1){
                    price+=7;
                    dessert++;
                    System.out.println("Added Tiramisu");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option4==2){
                    price+=10;
                    dessert++;
                    System.out.println("Added Strawberry Shortcake");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option4==3){
                    price+=4;
                    dessert++;
                    System.out.println("Added Green Jello");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option4==4){
                    price+=15;
                    dessert++;
                    System.out.println("Added Creme1 Brulee");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option4==5){
                    price+=20;
                    dessert++;
                    System.out.println("Added Raspberry Pie");
                    System.out.println("Current Total: RM"+price);
                    break;
                }else if (option4==6){
                    break return_menu;
                // to avoid invalid input 
                }else{
                    System.out.println("An error has occurred, please try again.");
                    break;
                } 
                
            case 4:
                //CHECKOUT number 4 option in main menu
                //discounted price for one-of-each offer
                float discounted_price = price*0.8f;
                if(pizza>0 && drink>0 && dessert>0){
                System.out.printf("Total price: RM+%.2f%n",price);
                System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
                System.out.println("Your new total is RM"+ discounted_price);
                System.out.println("");
                System.out.println("");
                System.out.println("Have a nice day!");
                return;
                }else{
                System.out.println("Total price: RM"+price);
                System.out.println("Thank you for your payment.");
                System.out.println("");
                System.out.println("");
                System.out.println("Have a nice day!");
                return;
                }
            // in case of invalid input at main menu    
            default:
                System.out.println("An error has occurred, please try again.");
                break return_menu;
                
               
        }    
        }        
        }
        }

        
        
        
        
    
}

  
}
