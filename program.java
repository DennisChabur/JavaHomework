import java.util.Scanner;
/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
 * n! (произведение чисел от 1 до n)
 */

// public class program{
//     public static void main(String[] args) {
//         System.out.println("Введите число: ");
//         Scanner iScanner = new Scanner(System.in);
//         String N = iScanner.nextLine();
//         int n = Integer.parseInt(N);
//         iScanner.close();
//         int resultPlus = n * (n + 1) / 2;
        
//         int resultMulty = 1;
//         for (int i = 1; i <= n; i ++){
//             resultMulty *= i;
//         }
//         System.out.println(resultPlus);
//         System.out.println(resultMulty);

//     }
// }

/*
 * Вывести все простые числа от 1 до 1000
 */
    public class program {

      public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
          if (i % 1 == 0 || i % i == 0){
            System.out.println(i);
          }
        }
      }
    }
