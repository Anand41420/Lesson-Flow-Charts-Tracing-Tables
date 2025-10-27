/**
 * For Loops Practice Problem
 *
 * @author Your Name
 */
public class CalculatingTotals extends ConsoleProgram {
    @Override

    public void run() {

    int n = readInt("Enter a value n: ");

    
        for (int counter = 1; counter <= n; counter += 1) {
            counter += n;
            System.out.println(counter);
        }
        
    }
}
