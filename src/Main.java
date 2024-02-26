import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        Notes notes = new Notes();

        Calculator calculator = new Calculator();
        Bank account = new Bank();
        Bank account2 = new Bank("Baiden ",5000d);

        int a, b;
        char operation;
        int atmnumber = 12345;
        int atmPin = 1800;
        while (true) {
            System.out.println("""
                             ______________________
                            |                      |
                            |        ДИСПЛЕЙ       |
                            |______________________|
                            1.    Калькулятор
                            _______________________
                            2.   Мобильный банк
                            _______________________
                            3.      Блоктнот
                            _______________________
                            4.       Выход
                            _______________________
                            """);

            switch (sc.nextInt()) {
                case  1 -> {

                    System.out.println("первое число? ");
                    a = sc.nextInt();
                    System.out.println("введите операцию (+,-,*,/)");
                    operation = sc.next().charAt(0);
                    System.out.println("второе число? ");
                    b = sc.nextInt();
                    System.out.println("   итог");
                    calculator.getCalculator(a, operation, b);

                }
                case 2 -> {
                    System.out.println("""
                            ********************
                            ____________________
                            | ДОБРО ПОЖАЛОВАТЬ |
                            |__________________|
                            
                            ********************
                            """);
                    System.out.print("""
                            ____________________
                                номер карты
                            ____________________    
                            """);

                    int atmNumber = scanner.nextInt();
                    System.out.print("""
                            _____________________
                                  пин-код
                            _____________________      
                            """);
                    int pin = scanner.nextInt();
                    if ((atmnumber == atmNumber) && (atmPin == pin)) {
                        while (true) {
                            System.out.println("""
                                    ____________________
                                    1. Проверить баланс
                                    ____________________
                                    2.   Снять сумму
                                    ____________________
                                    3.  Внести сумму
                                    ____________________
                                    4.    перевод
                                    ____________________
                                    5.     Выход
                                    ____________________
                                    """);

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
                                System.out.println("""
                                        ______________________________________
                                                Заберите свою карту
                                        ______________________________________
                                        Благодорим за использование Банкомата
                                        ______________________________________
                                        """);
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
                        NoteWile:
                        while (true){
                            System.out.println("""
                                    _____________
                                    1. Записать
                                    _____________
                                    2. показать
                                    _____________
                                    3. удалить
                                    _____________
                                    4.  Назад
                                    _____________
                                    """);
                            int num = new Scanner(System.in).nextInt();
                            switch (num){
                                case 1:
                                    notes.addNote();
                                    break;
                                case 2:
                                    notes.printNotes();
                                    break ;
                                case 3:
                                    notes.deleteNote();
                                    break ;
                                case 4: break NoteWile;
                                default:
                                    System.err.println("ОШИБКА!");

                            }
                        }
                    }
                    case 4 -> {
                    return;
                }
                    }




            }
        }
    }
