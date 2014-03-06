package uppgift_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HumanDogGUI extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Human human;
	public Dog dog;
	private JPanel contentPane;
	private JTextField txtJoakim;
	private JTextField txtFido;
	private JTextArea textArea_1; 
	private JTextArea textArea_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HumanDogGUI frame = new HumanDogGUI();
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
	public HumanDogGUI() {
		
		
		human = new Human(null);
		dog = new Dog(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHumansAndDogs = new JLabel("Humans And Dogs");
		lblHumansAndDogs.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblHumansAndDogs.setBounds(136, 11, 125, 32);
		contentPane.add(lblHumansAndDogs);
		
		txtJoakim = new JTextField();
		txtJoakim.setBounds(10, 44, 86, 20);
		contentPane.add(txtJoakim);
		txtJoakim.setColumns(10);
		
		txtFido = new JTextField();
		txtFido.setBounds(10, 75, 86, 20);
		contentPane.add(txtFido);
		txtFido.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String namn = txtJoakim.getText();
				if(human != null && namn.length() > 3){
					human = new Human(txtJoakim.getText());
					}else{ textArea_1.setText("fail");
							
			}}
		});
		btnNewHuman.setBounds(146, 43, 89, 23);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(human != null){
					
					dog = new Dog(txtFido.getText());
					human.buyDog(dog);
					
			}
				 	
			}
			});
		btnBuyDog.setBounds(146, 74, 89, 23);
		contentPane.add(btnBuyDog);
		
		textArea_2 = new JTextArea();
		textArea_2.setToolTipText("");
		textArea_2.setBounds(10, 144, 302, 47);
		contentPane.add(textArea_2);
		
		JButton btnPrint = new JButton("Print  info");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_2.setText(human.getInfo());
				}
			
		});
		btnPrint.setBounds(146, 108, 89, 23);
		contentPane.add(btnPrint);
		
		
		
		
		
		
		
		 textArea_1= new JTextArea();
		textArea_1.setBounds(10, 213, 307, 38);
		contentPane.add(textArea_1);
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(10, 133, 46, 14);
		contentPane.add(lblInfo);
		
		JLabel lblError = new JLabel("Error");
		lblError.setBounds(10, 202, 46, 14);
		contentPane.add(lblError);
	}
}
