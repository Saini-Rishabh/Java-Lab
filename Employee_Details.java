import java.lang.Exception;
import java.util.Scanner;

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Employee_Details {
    int Emp_id;
    String Emp_Name;
    int dep_id;

    Employee_Details() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Name Of Employee");
        Emp_Name = sc.nextLine();

        System.out.println("Enter the Id");
        Emp_id = sc.nextInt();

        System.out.println("Enter the Department Id");
        dep_id = sc.nextInt();

    }

    void Print_Data() {
        System.out.println("Name:" + Emp_Name);
        System.out.println("Employee Id:" + Emp_id);
        System.out.println("Department Id:" + dep_id);
    }

    public static void main(String k[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of Employees");
        n = sc.nextInt();
        Employee_Details e[] = new Employee_Details[n];
        for (int i = 0; i < n; i++) {
            e[i] = new Employee_Details();
            try {
                char fr = e[i].Emp_Name.charAt(0);
                if (Character.isLowerCase(fr))
                    throw new MyException("First Letter Is Not Capital");
                if (e[i].Emp_id < 2001 || e[i].Emp_id > 5001) {
                    e[i].Emp_id = 0;
                    throw new MyException("Employee Id is Out Of Range");
                }
                if (e[i].dep_id < 1 || e[i].dep_id > 5) {
                    e[i].dep_id = 0;
                    throw new MyException("Department Id Is Out Of Range");
                }
            } catch (MyException q) {
                System.out.println(q.getMessage());
                break;
            }
            e[i].Print_Data();
        }
    }
}