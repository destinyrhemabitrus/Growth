import java.util.Scanner;
public class Task18{

    public static void main(String[] args){
            int number = 1;
            Scanner inputCollector =  new Scanner(System.in);
            
        do{
            System.out.printf("7 x %d = %d%n",number, 7 * number);
             number++;
        }while(number <= 12);
    }
}
