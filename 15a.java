import java.util.concurrent.TimeUnit;

public class Alpha {
    public static void main(String[] args) throws InterruptedException {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
