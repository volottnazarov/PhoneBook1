package PhoneBook;

import java.io.IOException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws IOException {
        Cont myContact = new Cont();
        System.out.println("********* Привет! *********");
        Scanner iScanne = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("===========================================");
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Создать контакт");
            System.out.println("2. Найти контакт");
            System.out.println("3. Показать телефонную книгу");
            System.out.println("4. Выйти из телефонной книги");
            System.out.println("===========================================");
            int menuNum = iScanne.nextInt();
            if (menuNum >= 1 && menuNum <= 4) {

                switch (menuNum) {
                    case 1:
                        Scanner iScanner = new Scanner(System.in);
                        System.out.println("Введите имя: ");
                        String name = iScanner.nextLine();
                        Scanner iScann = new Scanner(System.in);
                        System.out.println("Ведите номер телефона: ");
                        int phone = iScann.nextInt();
                        myContact.add(name, phone);
                        Write.reloadPhoneBook(name, phone);
                        break;
                    case 2:
                        Scanner skan = new Scanner(System.in);
                        System.out.println("Введите имя: ");
                        String name1 = skan.nextLine();
                        myContact.find(name1);
                        if (myContact.find(name1) == null) {
                            System.out.println("Контакта с именем " + name1 + " не существует");
                        } else {
                            System.out.println("Контакт: " + name1 + " ,номер телефона " + myContact.find(name1));
                        }
                        break;
                    case 3:
                        System.out.println(Cont.showPhoneBook());
                        break;
                    case 4:
                        System.out.println("******** До встречи! *********");
                        exit = true;
                        break;
                }
            } else {
                System.out.println("Ошибка! Введите число от 1 до 4!");
            }

        }
    }
}