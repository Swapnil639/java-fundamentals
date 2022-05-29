import java.util.Scanner;

public class StringEqualOrNot {
    public static void main(String[] args) {
                String firstName,secondName;
                Scanner scanner = new Scanner(System.in);
                firstName=scanner.next();
                secondName=scanner.next();
                if(firstName.equals(secondName))
                    System.out.println("Two strings are equal ");
                else
                    System.out.println("Two strings are not equal");
            }
        }


