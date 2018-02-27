
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int rows=0;
        int columns=0 ;
        int minNumOfIngredients=0;
        int maxNumOfCellsPerSlice=0;

        System.out.println("Hello World!");
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:/Users/mvasalos/Documents/My Projects/HashCode2018/inputFiles/big.in"));
            String line;
            int counter = 0;
            if ((line = br.readLine()) != null) {
                if (counter == 0) {
                    rows = Integer.valueOf(line.split(" ")[0]);
                    columns = Integer.valueOf(line.split(" ")[1]);
                    minNumOfIngredients = Integer.valueOf(line.split(" ")[2]);
                    maxNumOfCellsPerSlice = Integer.valueOf(line.split(" ")[3]);
                }
                counter ++;
            }
            System.out.println("Pizza has " + rows + " rows and " + columns + " columns");
            System.out.println("Min number of ingredients is " + minNumOfIngredients + " and max number of cells per slice is " + maxNumOfCellsPerSlice);

            Character[][] pizza = new Character[rows][columns];



            for (int i=0; i<rows; i++){
                if ((line = br.readLine()) != null) {
                    int lineLength = line.length();
                    for (int j=0; j<columns; j++){
                        lineLength --;
                        if (lineLength >= 0) {
                            pizza[i][j] = line.charAt(lineLength);
                        }
                        System.out.print(pizza[i][j]);
                    }
                    System.out.println("");
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
