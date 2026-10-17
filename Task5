import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);

        int[] numbers = new int[3];

        System.out.println("Give three numbers");
        for(int i = 0; i < 3; i++){
            System.out.printf("Input #%d: ",i+1);
            numbers[i] = user.nextInt();
            user.nextLine();
        }

        Arrays.sort(numbers);
            if (numbers[0] == numbers[1] && numbers[1] == numbers[2]) {
                System.out.println("All numbers are equal.");
            }else{
                System.out.printf("Largest number: %d\n", numbers[2]);
        }
    }
}
