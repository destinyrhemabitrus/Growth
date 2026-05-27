public class Task15{

//    Question 15
    public static void main(String[] args){

        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int total = 0;
        for(int counter = 1; counter <= 5; counter++){

            System.out.printf("Number %d: ", counter);
            int number = inputCollector.nextInt();
            total = total + number;
        }       
        System.out.printf("Total = %d%n",total);
    }
}
