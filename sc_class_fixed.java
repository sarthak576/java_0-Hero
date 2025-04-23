import java.util.Scanner;
// good logic building ----
public class sc_class_fixed {

    public static void main(String[] args) {
        System.out.print("enter any number: ");
        Scanner my_obj = new Scanner(System.in);
        int number = my_obj.nextInt();
        System.err.println("number u entered: " + number);

        // clear the buffer
        my_obj.nextLine();

        System.out.print("Enter any string: ");
        String name = my_obj.nextLine();
        System.out.println("name u entered: " + name);

    }
}