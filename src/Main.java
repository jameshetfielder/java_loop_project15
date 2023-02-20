import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int i = 0;
        int j = 1;
        int k = 0;

        for (i = 1; i <= num; i++){
            System.out.print(k + " ");
            int total = j + k;
            k = j;
            j = total;
        }

    }
}
