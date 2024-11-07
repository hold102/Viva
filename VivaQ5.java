import java.util.Scanner;
public class VivaQ5 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name entered should be less than 200 characters,all in uppercase and must not be empty.");
        System.out.print("Enter a name :");
        String name =sc.nextLine();
        
        // getting modified song name from user and check whether is it all in upper case(!sentence.equals(sentence.toUpperCase()).)
        do{
            System.out.print("Enter the name in correct format :");
            name= sc.nextLine(); // getting user input
        } while(name!=name.toUpperCase() || name.isEmpty() || name.length()>200 ||name.matches(".*\\s{1,}.*"));
       
        // split the words when REMIX is detected 
        String modifiedname []=name.split("REMIX"); 
        String oriname ="";
        for(int i=0;i<modifiedname.length;i++){
            oriname=oriname+" "+modifiedname[i];
        }
        
        // removing any leading or ending white space
        String finaloriname=oriname.trim();
        
        System.out.println(finaloriname);

        
        
    }}
