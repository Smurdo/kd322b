package uppgift_6;

//import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//import Uppgift_5.Program;



import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Gui extends JFrame {
	private Bargraph bargraph_1;
	private Document doc;
	private JPanel contentPane;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	private JComboBox comboBox;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		doc = openXmlFile("C:\\Users\\Dickson\\Desktop\\ht2013_antagning.xml");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblHejsan = new JLabel("");
		lblHejsan.setBounds(31, 61, 342, 14);
		contentPane.add(lblHejsan);
		lblHejsan.setText("Första Elementet(roten)" + doc.getDocumentElement().getNodeName());
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(31, 24, 179, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("Antal program" + loadAllPrograms().size());
		
		
		programsList = loadAllPrograms();
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				bargraph_1.UpdateValue(programsList.get(comboBox.getSelectedIndex()).getWoman(),programsList.get(comboBox.getSelectedIndex()).getMan());
			}
		});
		comboBox.setBounds(40, 107, 267, 20);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		
		 bargraph_1 = new Bargraph();
		bargraph_1.setBounds(136, 138, 74, 44);
		contentPane.add(bargraph_1);
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				int index = comboBox.getSelectedIndex();
			
			}
		});
		
		//bargraph.paint.
		//System.out.println(doc.getDocumentElement().getNodeName());
		//fillRect( int x, int y, int width, int height ){
			
			
		}
	
	
	
	
	
	
	private ArrayList<Program> loadAllPrograms() {
		ArrayList<Program> output = new ArrayList<Program>();
		// Hämta alla program
		NodeList programs = doc.getElementsByTagName("Program");
		for (int i = 0; i < programs.getLength(); i++) {
		// Gör om varje nod i listan till ett element
		Node node = programs.item(i);
		Element elm = (Element) node;
		
		
		// Hämta data från elementet
		String name = elm.getElementsByTagName("name").item(0).getTextContent();
		String code = elm.getElementsByTagName("code").item(0).getTextContent();
		int Woman = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
		int Man = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());

		// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män)
		// Skapa programmet och lägg till i listan
		Program program = new Program(name, code, Woman, Man);
		output.add(program);
		}
		return output;
		}
	
	
	
	
	
	
	/**
	* Opens the given XML file as DOM.
	*
	* @param fileName
	* The filename of the XML file (make sure to copy this to your
	* Eclipse project)
	* @return A Document instance containing the given XML file.
	*/
	private Document openXmlFile(String fileName) {
	Document doc = null;
	try {
	File fXmlFile = new File(fileName);
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	doc = dBuilder.parse(fXmlFile);
	doc.getDocumentElement().normalize();
	} catch (Exception e) {
	e.printStackTrace();
	}
	return doc;
	}
}
