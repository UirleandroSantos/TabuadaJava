import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
        public void seeMenu(){
            System.out.println("----------------------");
            System.out.println("-------TABUADA-------");
            System.out.println("----------------------");
            System.out.println();
            System.out.print("Insira um número para ver a tabuada: ");
            int numberChoose = scan.nextInt();

            System.out.println("Tabuada de soma");
            for (int i = 1; i <= 10; i++){
                int result = numberChoose + i;
                System.out.println(i + " + " + numberChoose + " = " + result);
            }

            System.out.println();

            System.out.println("Tabuada de multiplicação");
            for (int i = 1; i <= 10; i++){
                int result = numberChoose * i;
                System.out.println(i + " X " + numberChoose + " = " + result);
            }

            System.out.println();

            System.out.println("Tabuada de subtração");
            for (int i = 1; i <= 10; i++){
                int result = numberChoose - i;
                System.out.println(i + " - " + numberChoose + " = " + result);
            }

            System.out.println();

            System.out.println("Tabuada de divisão");
            for (int i = 1; i <= 10; i++){
                int result = numberChoose / i;
                System.out.println(i + " / " + numberChoose + " = " + result);
            }
        }
}
