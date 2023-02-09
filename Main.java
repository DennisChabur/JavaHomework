import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("HP", 8, "Windows10", 80000, 250000));
        set.add(new Notebook("MSI", 16, "Windows10", 85000, 500000));
        set.add(new Notebook("ASUS", 32, "linux", 85000, 1000000));
        set.add(new Notebook("Honor", 64, "linux", 90000, 500000));

        Operations operation = new Operations(set);
        operation.start();

    }
}