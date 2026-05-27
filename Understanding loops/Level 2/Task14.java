public class Task14{

//    Question 14
    public static void main(String[] args){
        int number = 1;
        int total = 0;        
        while(number <= 50){
            if(number%2 == 0){
                total = total + number;
            }
            number = number + 1;
        }
        System.out.println(total);
    }
}
