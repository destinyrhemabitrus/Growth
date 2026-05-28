import java.util.Scanner;
public class Task20{

    public static void main(String[] args){
            Scanner inputCollector =  new Scanner(System.in);
            
            int smallest = 0;
            int number = 1;
            int numberEntry;
        do{
            System.out.println("Enter a number: ");
             numberEntry = inputCollector.nextInt();
              if(number == 1){
                smallest = numberEntry;
                }else if(numberEntry < smallest){
                    smallest = numberEntry;                
                }
                number++;
        }while(number <= 5);
        System.out.printf("Smallest is: %d%n",smallest);
    }
}
