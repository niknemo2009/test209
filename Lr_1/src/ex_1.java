//7 Створіть метод , який може перевернути будь яку число int . Приклад - 357 на вході, метод поверне 753
import java.util.Scanner;
class ex_1{
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[ ] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть будьласка число: ");
        int n = in.nextInt();
        System.out.println(recursion(n, 0));
        in.close();
    }
}