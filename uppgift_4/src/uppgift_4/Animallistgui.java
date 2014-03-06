package uppgift_4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class Animallistgui extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> MagiskaZoo;
	private JTextArea textArea;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Animallistgui frame = new Animallistgui();
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
	public Animallistgui() {
		
		MagiskaZoo = new ArrayList<Animal>();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea = new JTextArea();
		textArea.setBounds(10, 0, 424, 262);
		contentPane.add(textArea);
		
		MagiskaZoo.add(new Cats("Nisse",2,9));
		MagiskaZoo.add(new Dogs("Hult",5,false));
		MagiskaZoo.add(new Dogs("Arne",7,true));
		MagiskaZoo.add(new Snakes("sörväs",false));
		MagiskaZoo.add(new Snakes("jonas",true));
	
	
		for(Animal i :MagiskaZoo){
			textArea.append(i.getinfo() + "\n");
			
			
		}
		
	}
}
