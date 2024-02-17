package PhoneBook;


import java.io.*;


public class Write {
    public static void reloadPhoneBook(String name, int phone) {
        try (FileWriter writer = new FileWriter("PhBook.txt", true)) {
            String text = String.format("%s %d", name, phone);
            assert text != null;
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}