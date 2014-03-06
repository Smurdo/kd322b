package uppgift_2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci extends JFrame {
	calcigui mycalc = new calcigui();

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci frame = new calci();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(5, 5, 280, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			mycalc.numberButtonPressed(1);
			int i = mycalc.getOperand();
			textField.setText(String.valueOf(i));
			}
		});
		btnNewButton.setBounds(5, 52, 56, 35);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("2");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(2);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			
			}
		});
		button.setBounds(71, 52, 56, 35);
		contentPane.add(button);
		
		JButton button_1 = new JButton("3");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(3);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_1.setBounds(137, 52, 56, 35);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(4);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_2.setBounds(5, 98, 56, 35);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("5");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(5);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_3.setBounds(71, 98, 56, 35);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("6");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(6);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_4.setBounds(137, 98, 56, 35);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(7);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_5.setBounds(5, 144, 56, 35);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(8);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_6.setBounds(71, 144, 56, 35);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(9);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_7.setBounds(137, 144, 56, 35);
		contentPane.add(button_7);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			mycalc.clear();
			textField.setText("");
			}
		});
		btnC.setBounds(5, 190, 56, 35);
		contentPane.add(btnC);
		
		JButton button_9 = new JButton("0");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mycalc.numberButtonPressed(0);
				int i = mycalc.getOperand();
				textField.setText(String.valueOf(i));
			}
		});
		button_9.setBounds(71, 190, 56, 35);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			mycalc.equals();
			int i = mycalc.getResult();
			textField.setText(String.valueOf(i));
			}
		});
		button_10.setBounds(137, 190, 56, 35);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("+");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			mycalc.plus();
			}
		});
		button_11.setBounds(219, 52, 56, 35);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			mycalc.minus();
			}
		});
		button_12.setBounds(219, 98, 56, 35);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("*");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			mycalc.mult();
			}
		});
		button_13.setBounds(219, 144, 56, 35);
		contentPane.add(button_13);
	}

}
