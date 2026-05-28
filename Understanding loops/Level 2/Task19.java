public class Task19{

//    Question 19
    public static void main(String[] args){
        java.util.Scanner inputCollector = new java.util.Scanner(System.in);
        int largest = 0;
        for(int counter = 1; counter <= 5; counter++){
            System.out.printf("Enter number %d %n", counter);
            int number = inputCollector.nextInt();
            if(counter == 1){
                largest = number;
            }else if(number > largest){
                largest = number;
            }

        }       
        System.out.printf("largest is: %d%n",largest);
    }
}
