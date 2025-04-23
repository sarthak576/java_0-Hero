package revision;
public class add2numbsusingfn {
    public static void main(String[] args) {
        int a;
        int b; // here i got an error becoz
        System.out.println("First number: " + a);
        System.out.println("second number: " + b);
        
        int c = add(4, 5);
        System.out.println(c);
    }
    public static int add(int a, int b) {
        return a + b;
    }
}
// Ans ->
// error ---
// a & b is not initialized

// reason {*}
// a and b were declared but had no value.
// Trying to print an uninitialized variable causes a `compilation error` in Java.