public class Task16{

//    Question 16
    public static void main(String[] args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        String password = "rhema123";
        while(!password.equals("password")){
            System.out.println("Enter password: ");
            password = inputCollector.nextLine();    
        }
    }
}
