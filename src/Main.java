import javax.naming.NameAlreadyBoundException;
import java.io.PrintStream;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        /// Tesk1
        System.out.println("Tesk1");
        double[] weights = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        weights[0] = 1.57;
        weights[1] = 7.654;
        weights[2] = 9.986;
        System.out.println(Arrays.toString(weights));
        ///Tesk2
        System.out.println("Tesk2");
        double[] arr = {1, 2, 3};
        arr[0] = 1.57;
        arr[1] = 7.654;
        arr[2] = 9.986;
        System.out.println(Arrays.toString(arr));
        ///Teck3
        System.out.println("Tesk3");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
            if (i > 0) {
                System.out.println(", ");
            }
            System.out.println("");
        }
        /// Tesk4
        System.out.println("Tesk4");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = + 1;
            if (index == arr.length - 1) {
                System.out.println(arr[index]);
                break;
            }
            System.out.println("");
        }
    }
}