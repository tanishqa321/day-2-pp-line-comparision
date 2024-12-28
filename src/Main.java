import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Welcome to Line Comparison Computation Program");
        System.out.println("Enter the coordinates for the first line 1 (x1, y1, x2, y2): ");
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        Line line1 = new Line(x1, y1, x2, y2);
        System.out.println("Enter the coordinates for the second line 2 (x1, y1, x2, y2): ");
        int x11 = scanner.nextInt();
        int y11 = scanner.nextInt();
        int x22 = scanner.nextInt();
        int y22 = scanner.nextInt();
        Line line2 = new Line(x11, y11, x22, y22);
        System.out.println("Length of Line 1: " + line1.calculateLength());
        System.out.println("Length of Line 2: " + line2.calculateLength());
        line1.checkEquality(line2);
        line1.Comparision(line2);
        scanner.close();
    }
}