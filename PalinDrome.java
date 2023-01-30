import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalinDrome {
    public static void main(String[] args) {
        Scanner sc = null;
        int count = 0;
        try {
            File file = new File("C:\\Users\\DELL\\Desktop\\JAVA LAB\\myfile.txt");
            sc = new Scanner(file);
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                String lineArr[] = line.split(" ");
                for (int i = 0; i < lineArr.length; i++)
                    if (checkPalli(lineArr[i]))
                        count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (sc != null)
                sc.close();
        }
        System.out.print("No of pallindrome lines: " + count);
    }

    static Boolean checkPalli(String line) {
        int left = 0, right = line.length() - 1;
        while (left < right) {
            if (line.charAt(left) != line.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}