import java.util.Scanner;
import java.util.Stack;

public class StackOperation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    System.out.println("Element " + element + " pushed onto the stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        int poppedElement = stack.pop();
                        System.out.println("Element " + poppedElement + " popped from the stack.");
                    } else {
                        System.out.println("Stack is empty. No element to pop.");
                    }
                    break;
                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Stack elements:");
                        for (int i = stack.size() - 1; i >= 0; i--) {
                            System.out.println(stack.get(i));
                        }
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}