package house;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class housegui extends JFrame {

	
	
	private JPanel contentPane;
	private house[] houses;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					housegui frame = new housegui();
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
	public housegui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 0, 424, 262);
		contentPane.add(textArea);
	
		house hus1 = new house(1920, 150);
		house hus2 = new house(1890, 80);
		house hus3 = new house(1960, 30);
	
		houses = new house[10];
		
		houses[0] = hus1; 
		houses[1] = hus2;
		houses[2] = hus3;
	
		for(int i = 0; i < 10; i++) {
		if (houses[i]!= null) {
			
			int houseSize = houses[i].getSize();
			int houseYear = houses[i].getYear();
			
		textArea.append("Ett hus är byggt " + houseYear + " som är " + houseSize + " m^2 stort" + "\n");
		} else if(houses.length < hus1.MIN_SIZE){
				
			}
		
		
		
		}
	
	textArea.append("Antal hus" + house.getNbrHouses());
	}
}
