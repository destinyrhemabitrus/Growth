import java.util.Scanner;
public class Task15{

    public static void main(String[] args){
            Scanner inputCollector =  new Scanner(System.in);
            
            int largest = 0;
            int number = 1;
            int numberEntry;
        do{
            System.out.println("Enter a number: ");
             numberEntry = inputCollector.nextInt();
              if(number == 1){
                largest = numberEntry;
                }else if(numberEntry > largest){
                    largest = numberEntry;                
                }
                number++;
        }while(number <= 5);
        System.out.printf("Largest is: %d%n",largest);
    }
}
