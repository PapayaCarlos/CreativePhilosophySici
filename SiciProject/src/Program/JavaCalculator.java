
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaCalculator implements ActionListener{

	JFrame guiFrame;
	JPanel buttonPanel;
	JTextField numberCalc;
	int calcOperation = 0;
	int currentCalc;

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				new JavaCalculator();         
			}
		});
	}

	public JavaCalculator()
	{
		guiFrame = new JFrame();
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiFrame.setTitle("Simple Calculator");
		guiFrame.setSize(300,300);
		guiFrame.setLocationRelativeTo(null);
		numberCalc = new JTextField();
		numberCalc.setHorizontalAlignment(JTextField.RIGHT);
		numberCalc.setEditable(false);
		guiFrame.add(numberCalc, BorderLayout.NORTH);
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(4,4));   
		guiFrame.add(buttonPanel, BorderLayout.CENTER);

		for (int i=0;i<2;i++)
		{
			addNumberButton(buttonPanel, String.valueOf(i));
		}

		addActionButton(buttonPanel, 1, "+");
		addActionButton(buttonPanel, 2, "-");
		addActionButton(buttonPanel, 3, "*");
		addActionButton(buttonPanel, 5, "^2");

		JButton equalsButton = new JButton("=");
		equalsButton.setActionCommand("=");
		equalsButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				if (!numberCalc.getText().isEmpty())
				{
					int number = Integer.parseInt(numberCalc.getText()); 
					if (calcOperation == 1)
					{
						int calculate = currentCalc  + number;
						numberCalc.setText(Integer.toString(calculate));
					}
					else if (calcOperation == 2)
					{
						int calculate = currentCalc  - number;
						numberCalc.setText(Integer.toString(calculate));
					}
					else if (calcOperation == 3)
					{
						int calculate = currentCalc  * number;
						numberCalc.setText(Integer.toString(calculate));
					}
					else if (calcOperation == 4)
					{
						int calculate = currentCalc  / number;
						numberCalc.setText(Integer.toString(calculate));
					}
					else if (calcOperation == 5)
					{
						int calculate = currentCalc  * currentCalc;
						numberCalc.setText(Integer.toString(calculate));
					}
				}
			}
		});

		buttonPanel.add(equalsButton);
		guiFrame.setVisible(true);  
	}

	private void addNumberButton(Container parent, String name)
	{
		JButton but = new JButton(name);
		but.setActionCommand(name);
		but.addActionListener(this);
		parent.add(but);
	}

	private void addActionButton(Container parent, int action, String text)
	{
		JButton but = new JButton(text);
		but.setActionCommand(text);
		OperatorAction addAction = new OperatorAction(action);
		but.addActionListener(addAction);
		parent.add(but);
	}

	public void actionPerformed(ActionEvent event)
	{
		String action = event.getActionCommand();

		numberCalc.setText(action);       
	}

	private class OperatorAction implements ActionListener
	{
		private int operator;

		public OperatorAction(int operation)
		{
			operator = operation;
		}

		public void actionPerformed(ActionEvent event)
		{
			currentCalc = Integer.parseInt(numberCalc.getText()); 
			calcOperation = operator;
		}
	}
}
