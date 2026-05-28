import java.util.Scanner;
public class Task16{

    public static void main(String[] args){
            Scanner inputCollector =  new Scanner(System.in);
            
            String password = "";
        do{
            System.out.println("Enter a password: ");
             password = inputCollector.nextLine();
        }while(!password.equals("rhema123"));
    }
}
