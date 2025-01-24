import java.util.Scanner;

public class sc_class {
    public static void main(String[] args) {
        System.out.println("enter any number: ");
        Scanner my_obj = new Scanner(System.in);
        int number = my_obj.nextInt();
        System.err.println("number u entered: " + number);
        System.out.println("Enter any string: ");
        String name = my_obj.nextLine();
        System.out.println("name u enter: " + name);

    }
}

// go check sc_class_fixed.java  (right ans)
// answer -
// enter any number: 
// 23
// number u entered: 23
// Enter any string: 
// name u enter:   