package esercizio3;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class MainProjct {

	public static void main(String[] args) throws IOException {
		scriviPresenze();
	}
	
	public static void scriviPresenze() throws IOException {
        String presenze = "";
        File file = new File("registro/test.txt");
        FileUtils.writeStringToFile(file, presenze, "UTF-8"); 
    }

    public static void leggiRegistro() throws IOException {
        File file = new File("registro/test.txt");
        String read = FileUtils.readFileToString(file, "UTF-8");
        System.out.println(read);

    }

//    public static void cancellaRegistro() throws IOException {
//        File file = new File("registro/");
//
//        FileUtils.deleteDirectory(file);
//
//    }


}