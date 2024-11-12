import java.util.Scanner;
public class VivaQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name entered should be less than 200 characters,all in uppercase and must not be empty.");
        System.out.print("Enter a name :");
        String name = sc.nextLine();
        
        //loop to check validity of the input
        while (name.length() > 200 || !name.matches("[A-Z]+") || name.isEmpty()) {
            System.out.print("Enter name in correct format :");
            //prompt user to re-enter
            name = sc.nextLine();   
        }
        
        //replace all "REMIX" in the name to be space and remove all of the leading white space and ending space
        String oriName = name.replaceAll("REMIX(\\s*REMIX)*", " ").trim(); /*REMIX(\\s*REMIX)* , this actually detects all subsequent  
        "REMIX" at the same time including the whitespaces and replace them together with " " ( \\s means whitespace, \\s means multiple white spaces*/
        //print the original name
        System.out.println(oriName);
    }
}
