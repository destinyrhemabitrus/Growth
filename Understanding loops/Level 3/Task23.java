public class Task23{

    public static void main(String[] args){

        for(int counter = 4; counter > 0; counter--){

            for(int counterThree = 0; counterThree < 4 - counter; counterThree++){
                System.out.print("  ");
            }
            
            for(int counterTwo = 0; counterTwo < counter; counterTwo++){

                System.out.print("* ");

            }
            
            System.out.println();    
        }
    }
}
