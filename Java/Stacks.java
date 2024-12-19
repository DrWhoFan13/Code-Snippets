import java.util.Stack;
import java.util.Scanner;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a name, then hit enter: ");
            String item = scanner.nextLine();
            stack.push(item);
            displayStack(stack);
        }

        for (int i = 0; i < 2; i++) {
            String poppedItem = stack.pop();
            if (poppedItem != null) {
                System.out.println("Popped item: " + poppedItem);
                displayStack(stack);
            } else {
                System.out.println("The stack's empty");
            }
        }
    }

    private static void displayStack(Stack<String> stack) {
        System.out.println("The remaining names are: " + stack);
    }
}
