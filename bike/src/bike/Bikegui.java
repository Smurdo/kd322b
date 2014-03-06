package bike;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Bikegui extends JFrame {
/** deklarera värdet för cyklarna*/
	BikeStore bikeStore = new BikeStore();
	
	
	private JPanel contentPane;
	private JTextField inputSize;
	private JTextField inputPrice;
	private JTextField txtPrice;
	private JTextField txtSize_1;
	private JTextField txtColor_1;
	private JTextField txtListOfBikes;
	private JTextField inputColor;
	private JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bikegui frame = new Bikegui();
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
	public Bikegui() {
		/**här är dom lägger du in alla cyklar*/
		bikeStore.addBike("Blue", 20, 1000);
		bikeStore.addBike("Blue", 20, 1000);
		bikeStore.addBike("Blue", 20, 1000);
		bikeStore.addBike("Black", 28, 2000);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		/** här används knappen och du sitter in alla text fields så du kan skriva i dom*/
		JButton btnAddBike = new JButton("Add Bike");
		btnAddBike.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/**variablar*/
				int storlek;
				int pris;
				/** den ska försöka ta funktionerna*/
				try {
					storlek = Integer.parseInt(inputSize.getText());
					pris = Integer.parseInt(inputPrice.getText());
					bikeStore.addBike(inputColor.getText(), storlek, pris);
					textArea.setText(bikeStore.getAllbikes());
				} catch(NumberFormatException e){
					
				}
			}
		});
		btnAddBike.setBounds(285, 31, 89, 23);
		contentPane.add(btnAddBike);
		
		textArea = new JTextArea();
		textArea.setText("Bike List");
		textArea.setBounds(22, 72, 200, 158);
		contentPane.add(textArea);
		textArea.setText(bikeStore.getAllbikes());
		
		
		inputSize = new JTextField();
		inputSize.setBounds(347, 135, 80, 33);
		contentPane.add(inputSize);
		inputSize.setColumns(10);
		
		inputPrice = new JTextField();
		inputPrice.setBounds(344, 197, 80, 33);
		contentPane.add(inputPrice);
		inputPrice.setColumns(10);
		
		txtPrice = new JTextField();
		txtPrice.setText("Price");
		txtPrice.setBounds(232, 198, 86, 31);
		contentPane.add(txtPrice);
		txtPrice.setColumns(10);
		
		txtSize_1 = new JTextField();
		txtSize_1.setText("Size");
		txtSize_1.setColumns(10);
		txtSize_1.setBounds(232, 135, 86, 31);
		contentPane.add(txtSize_1);
		
		txtColor_1 = new JTextField();
		txtColor_1.setText("Color");
		txtColor_1.setColumns(10);
		txtColor_1.setBounds(232, 71, 86, 31);
		contentPane.add(txtColor_1);
		
		txtListOfBikes = new JTextField();
		txtListOfBikes.setText("List of Bikes");
		txtListOfBikes.setColumns(10);
		txtListOfBikes.setBounds(22, 31, 200, 31);
		contentPane.add(txtListOfBikes);
		
		inputColor = new JTextField();
		inputColor.setColumns(10);
		inputColor.setBounds(344, 74, 80, 33);
		contentPane.add(inputColor);
	}
}
