package PhoneBook;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Cont {
    static final Map<String, ArrayList<Integer>> phoneBook = new TreeMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> arr = phoneBook.get(name);
        if (arr == null) {
            arr = new ArrayList<>();
            arr.add(phoneNum);
            phoneBook.put(name, arr);
        } else {
            arr.add(phoneNum);
            phoneBook.put(name, arr);
        }
    }
    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> arr = phoneBook.get(name);
        if (arr == null) {
            arr = null;
        }else{

        }
        return arr;
    }
    public static Map<String, ArrayList<Integer>> showPhoneBook() {
        if (!phoneBook.isEmpty()) {
            return phoneBook;
        }
        return null;
    }
}
