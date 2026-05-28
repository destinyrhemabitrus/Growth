public class Task20{

//    Question 20
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        int smallest = 0;
        for(int counter = 1; counter <= 5; counter++){
            System.out.printf("Enter number %d %n", counter);
            int number = inputCollector.nextInt();
            if(counter == 1){
                smallest = number;
            }else if(number < smallest){
                smallest = number;
            }

        }       
        System.out.printf("smallest is: %d%n",smallest);
    }
}
