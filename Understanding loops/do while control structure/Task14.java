public class Task14{

    public static void main(String[] args){
            int total = 0;
            int number = 1;
        do{
            if(number%2 == 0){
                total = total + number;
            }

            number++;
        }while(number <= 50);
        System.out.println(total);
    }
}
