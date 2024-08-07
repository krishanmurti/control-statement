import java.util.*;

public class nice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the button number:");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            case 4:
                System.out.println("radhe radhe");
                break;
            default:
                System.out.println("invalid");
        }

    }
}