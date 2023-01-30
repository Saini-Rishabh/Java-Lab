import java.util.ArrayList;
import java.util.*;

class ArrayListData {
    public static void removeEvenLength(ArrayList<String> array) {

        for (int i = 0; i < array.size(); i++) {
            String word = array.get(i);
            if (word.length() % 2 == 0) {
                array.remove(i);
                i--;
            }
        }

    }
}

public class RemoveList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number Of Strings");
        int n = sc.nextInt();
        ArrayList<String> arrlist = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            arrlist.add(s);
        }
        System.out.println("<====ArrayList Item====>");

        for (String str : arrlist) {
            System.out.println(str);
        }
        ArrayListData.removeEvenLength(arrlist);
        System.out.println("<====After Removing EvenLength ArrayList Item====>");
        for (String str : arrlist) {
            System.out.println(str);
        }
    }
}