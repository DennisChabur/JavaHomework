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
//   public class program {

//     public static void main(String[] args) {
//       for (int i = 2; i < 1000; i++) {
//         boolean flag = false;
//         for (int j = 2; j < i; j++) {
//         if (i % j == 0) {
//         flag = true;
//         }
//         }
//         if (flag == false) {
//         System.out.print(i+" ");
//         }
//         }
//   }
// }

/*Реализовать простой калькулятор 
(пользователь вводит 2 числа и вводит операцию (+ - / *). 
int a ; int b; String op (op!=”Stop”); (char != ’b’) */

public class program {
  public static void main(String[] args){
    
    Double number1, number2, result;


    Scanner iScanner = new Scanner(System.in);

    System.out.println("Введите операцию +-/*");
    String operator = iScanner.nextLine();

    System.out.println("Первое число");
    number1 = iScanner.nextDouble();

    System.out.println("Второе число");
    number2 = iScanner.nextDouble();

    switch (operator) {

      case "+":
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case "-":
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case "*":
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case "/":
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    iScanner.close();
  }
}