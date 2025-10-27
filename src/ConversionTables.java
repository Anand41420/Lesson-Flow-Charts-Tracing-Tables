/**
 * For Loops Practice Problem
 *
 * @author Anand Sidhu
 */
public class ConversionTables extends ConsoleProgram {
    @Override
    public void run() {
        for (int km = 10; km <=100; km += 10){
            double miles = km * 0.6214;
            System.out.println(miles);
        }
    }
}
