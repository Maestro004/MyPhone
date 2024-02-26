import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Notes notes = new Notes();

        Calculator calculator = new Calculator();
        Bank account = new Bank();
        Bank account2 = new Bank("Baiden",5000d);

        int a, b;
        char operation;
        int atmnumber = 12345;
        int atmPin = 1800;
        while (true) {
            System.out.println("  Рабочий стол " +
                    "\n1. Калькулятор"
            +"\n2. Мобильный банк "+
                    "\n3. Блоктот"+"\n4. Сохраненные заметки");

            switch (sc.nextInt()) {
                case  1 -> {

                    System.out.println("введите первое число: ");
                    a = sc.nextInt();
                    System.out.println("введите операцию (+,-,*,/)");
                    operation = sc.next().charAt(0);
                    System.out.println("введитк второе число: ");
                    b = sc.nextInt();
                    calculator.getCalculator(a, operation, b);
                }
                case 2 -> {
                    System.out.println("Добро пожаловать!");
                    System.out.print("Введите номер карточки: ");

                    int atmNumber = scanner.nextInt();
                    System.out.print("Введите пин-код: ");
                    int pin = scanner.nextInt();
                    if ((atmnumber == atmNumber) && (atmPin == pin)) {
                        while (true) {
                            System.out.println("1. Проверить баланс\n2. Cнять сумму\n3. Внести сумму \n4. перевод\n5. Выход");
                            System.out.println("Выберите");
                            int choice = scanner.nextInt();
                            if (choice == 1) {
                                account.checkBalance();


                            } else if (choice == 2) {
                                System.out.println("Снять деньги ");
                                account.withdraw(scanner.nextInt());

                            } else if (choice == 3) {
                                System.out.println("Внести сумму ");
                                account.deposit(scanner.nextInt());
                            } else if (choice == 4) {
                               double money;
                                System.out.println("Перевести ");
                               account.translation(money = scanner.nextDouble());
                               account2.deposit((int)money);
                            }

                             else if (choice == 5) {
                                System.out.println("Заберите свою карту\n Благодорим за использование Банкомата!!!");
                                System.exit(0);

                            } else {
                                System.out.println("Пожалуйста введите правильно ");
                            }

                        }

                    } else {
                        System.err.println("Неверный номер карты или пин-кода. ");
                        System.exit(0);



                }
                }
                    case 3 -> {
                        notes.notes();
                    }
                    case 4 ->{
                        System.out.println(Arrays.toString(Notes.name));
                    }




            }
        }
    }
}