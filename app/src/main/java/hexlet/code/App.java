package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Cli.greet(); // Приветствие
                    break;
                case 2:
                    Even.start(); // Игра "Проверка на четность"
                    break;
                case 3:
                    Calc.start(); // Игра "Калькулятор"
                    break;
                case 0:
                    System.out.println("Goodbye!"); // Завершение программы
                    break;
                default:
                    System.out.println("Invalid choice."); // Обработка неверного выбора
                    break;
            }

        } while (choice != 0); // Цикл будет продолжаться, пока не введено "0"
    }
}
