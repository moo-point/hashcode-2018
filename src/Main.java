
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int rows=0;
        int columns=0 ;
        int vehicles=0;
        int rides=0;
        int bonus=0;
        int steps=0;

        try{
            BufferedReader br = new BufferedReader(new FileReader("problem_statement/a_example.in"));
            String line;
            int counter = 0;
            if ((line = br.readLine()) != null) {
                rows = Integer.valueOf(line.split(" ")[0]);
                columns = Integer.valueOf(line.split(" ")[1]);
                vehicles = Integer.valueOf(line.split(" ")[2]);
                rides = Integer.valueOf(line.split(" ")[3]);
                bonus = Integer.valueOf(line.split(" ")[4]);
                steps = Integer.valueOf(line.split(" ")[5]);
            }
            System.out.println("City has " + rows + " rows and " + columns + " columns" +vehicles+ " vehicles" +rides+ " rides" +bonus+ " bonus" +steps+ " steps");

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
