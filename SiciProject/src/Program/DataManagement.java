package Program;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class DataManagement extends JFrame {

	public static void main(String[] args) {
		new DataManagement(null);
	}

	private JPanel buttonPanel;
	private JButton ok;
	private JButton edit;
	private JButton delete;
	private DisplayPanel display;

	public DataManagement(Socios members) {
		
		setTitle("Member");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		display = new DisplayPanel(members);
		
		buildButtonPanel();
		
		add(display, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
		setVisible(true);
		
	}
	

	public void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		ok = new JButton("Okay");
		edit = new JButton("Edit");
		delete = new JButton("Delete");
		
		ok.addActionListener(new ButtonListener());
		edit.addActionListener(new ButtonListener());
		delete.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener
	{
		@SuppressWarnings("unused")
		public void actionPerformed(ActionEvent e, Socios members, int num)
		{	
			if(e.getSource() == ok)
			{
				System.exit(0);
			}
			else if(e.getSource() == edit)
			{	
				dataEdit(members, num);
			}
			else
				deleteSocio(members, num);
		}

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
	
	public void dataEdit(Socios members, int num) {
		JTextField editName = new JTextField(((List<Socios>) members).get(searchNum(members, num)).getName());
		JTextField editEmail = new JTextField(((List<Socios>) members).get(searchNum(members, num)).getEmail());
		JTextField editTel = new JTextField(((List<Socios>) members).get(searchNum(members, num)).getTel());
		JTextField editNumSocio = new JTextField(((List<Socios>) members).get(searchNum(members, num)).getNum());

		JPanel editPane = new JPanel();
		
		editPane.add(new JLabel("Nombre"));
		editPane.add(editName);
		editPane.add(new JLabel("E-mail"));
		editPane.add(editEmail);
		editPane.add(new JLabel("Telefono"));
		editPane.add(editTel);
		editPane.add(new JLabel("Numero de Socio"));
		editPane.add(editNumSocio);
		
		JOptionPane.showConfirmDialog(null,editPane, "DummyWindow", 0);
	}
	
	public int searchNum(Socios members, int num)
	{	
		int k = 0;
		while (Integer.parseInt(((List<Socios>) members).get(k).getNum()) != num)
			k++;
		return k;
		
	}
	
	public void deleteSocio(Socios members, int num)
	{
		((List<Socios>) members).remove(searchNum(members, num));
	}

}
