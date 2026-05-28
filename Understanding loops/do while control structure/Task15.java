import java.util.Scanner;
public class Task15{

    public static void main(String[] args){
            Scanner inputCollector =  new Scanner(System.in);
            
            int total = 0;
            int number = 1;
            System.out.println("Enter 5 numbers of your choice");
        do{
            System.out.printf("Enter number %d: ",number);
             number = inputCollector.nextInt();
              total = total + number;
                number++;
        }while(number <= 5);
        System.out.println(total);
    }
}
