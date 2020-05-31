//11 Створіть метод, який знаходить суму цифр будь якого числа in
import java.util.Scanner;
public class ex_3 {
    public static void sumNum(int n){
        int sum = 0;
        while(n != 0){
            //Суммирование цифр числа
            sum += (n % 10);
            n/=10;
        }
        System.out.println(sum + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        sumNum(n);
    }
}
