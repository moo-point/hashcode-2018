
import models.*;

public class Main {

    public static void main(String[] args) {
       exportInFile(ArrayList<Slice> slices);
    }

    private exportInFile(ArrayList<Slice> slices){

        PrintWriter writer = new PrintWriter("exportedFile.txt", "UTF-8");
        writer.println(slices.size());

        String newLineToWrite;
        for (Slice slice : slices){
            newLineToWrite = slice.toString();
            writer.println(slices.size());
        }

        writer.close();

    }
}
