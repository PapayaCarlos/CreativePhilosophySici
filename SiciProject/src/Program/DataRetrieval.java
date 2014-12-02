package Program;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
/**
 * @author github.com/ziekhart/, Andres A. Acevedo
 */
public class DataRetrieval {
	
	public static void main(String args[]) throws IOException {
		JOptionPane.showMessageDialog(null, readFile(), "Retrieval",0);
	}
	
	public static String readFile()throws IOException{
		String filename = "resources/test.txt";
		File file = new File(filename);
		StringBuffer contents = new StringBuffer();
		BufferedReader reader = null;

		reader = new BufferedReader(new FileReader(file));
		String text = null;


		while ((text = reader.readLine()) != null) {
			contents.append(text).append(System.getProperty("line.separator"));
		}
		reader.close();
		String outputty= contents.toString();
		return outputty;
		}
}
