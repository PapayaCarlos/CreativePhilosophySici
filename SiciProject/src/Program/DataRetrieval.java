package Program;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * @author github.com/ziekhart/, Andres A. Acevedo
 */
public class DataRetrieval {
	
	public static void main(String args[]) throws IOException {
		readFrame();
	}
	
	public static JFrame readFrame(){
		final JFrame frame = new JFrame("Ver ID");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("resources/images/reader.png"));
		JPanel panel = new JPanel(new FlowLayout());
		JButton button = new JButton("Ok");
		frame.setLayout(new FlowLayout());
		JTextArea area = new JTextArea();
		try {
			area.setText(readFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		JScrollPane scrollPane = new JScrollPane(area);
		scrollPane.setPreferredSize(new Dimension(200,250));
		area.setEditable(false);
		panel.add(button);
		frame.setResizable(false);
		frame.add(scrollPane);
		frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent event){
			frame.setVisible(false);
		}
		});		
		

		return frame;
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
