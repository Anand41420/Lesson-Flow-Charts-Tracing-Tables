/**
 * For Loops Practice Problem
 *
 * @author Anand Sidhu
 */
public class CalculatingTotals extends ConsoleProgram {
    @Override

    public void run() {

        int n = readInt("Enter a value n: ");

        int sum = 0;

    
        for (int counter = 1; counter <= n; counter++) {
            sum += counter;
            System.out.println(sum);
            
        }

        
    }
}
