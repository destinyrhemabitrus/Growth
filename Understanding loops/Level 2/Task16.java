public class Task16{

//    Question 16
    public static void main(String[] args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);

        String password = "";
        while(!password.equals("rhema123")){
            System.out.println("Enter password: ");
            password = inputCollector.nextLine().strip();    
        }
    }
}
