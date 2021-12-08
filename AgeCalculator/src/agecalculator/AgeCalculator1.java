package agecalculator;
/*
 * Imtiaz Adar
 * Email : imtiaz-adar@hotmail.com
 * Project : Age Calculator
 * Language Used : Java
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class AgeCalculator1 extends JFrame implements ActionListener {
	private Container c;
	private JLabel ageLabel;
	private JLabel daysLabel;
	private JLabel monthsLabel;
	private JLabel yearsLabel;
	private JLabel daysLabel1;
	private JLabel monthsLabel1;
	private JLabel yearsLabel1;
	private JButton calcagain;
	private JButton exit;
	private ImageIcon icon;
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	private Font font1 = new Font("Comic Sans Ms", Font.BOLD, 40);
	private Font font2 = new Font("DS-DIGITAL", Font.PLAIN, 25);
	private Font font3 = new Font("Verdana", Font.PLAIN, 30);
	private Font font4 = new Font("Comic Sans Ms", Font.PLAIN, 30);
	private Font font5 = new Font("CASTELLAR", Font.BOLD, 20);
	private Font font6 = new Font("Century Gothic", Font.BOLD, 15);
	private Color color1 = Color.BLACK;
	private Color color2 = new Color(122, 25, 61);
	private Color color3 = new Color(24, 115, 91);
	private Border border1 = BorderFactory.createBevelBorder(2);
	private Border border2 = new LineBorder(color3, 2, true);
	private Border border3 = new LineBorder(color2, 2, true);
	AgeCalculator ac = new AgeCalculator();
	public AgeCalculator1() {
		containerinit();
	}
	public void containerinit() {
		c = new Container();
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		icon = new ImageIcon(getClass().getResource("iconage.png"));
		setIconImage(icon.getImage());
		
		ageLabel = new JLabel("YOUR AGE");
		ageLabel.setFont(font1);
		ageLabel.setBorder(border1);
		ageLabel.setBounds(184, 30, 400, 50);
		ageLabel.setForeground(color1);
		c.add(ageLabel);
		
		yearsLabel = new JLabel("YEAR");
		yearsLabel.setFont(font4);
		yearsLabel.setBorder(border1);
		yearsLabel.setBounds(274, 140, 160, 50);
		yearsLabel.setForeground(color1);
		c.add(yearsLabel);
		
		monthsLabel = new JLabel("MONTHS");
		monthsLabel.setFont(font4);
		monthsLabel.setBorder(border1);
		monthsLabel.setBounds(274, 210, 160, 50);
		monthsLabel.setForeground(color1);
		c.add(monthsLabel);
		
		daysLabel = new JLabel("DAYS");
		daysLabel.setFont(font4);
		daysLabel.setBorder(border1);
		daysLabel.setBounds(274, 280, 160, 50);
		daysLabel.setForeground(color1);
		c.add(daysLabel);
		
		yearsLabel1 = new JLabel(ac.getyearInformation());
		yearsLabel1.setFont(font4);
		yearsLabel1.setBorder(border1);
		yearsLabel1.setBounds(164, 140, 160, 50);
		yearsLabel1.setForeground(color1);
		c.add(yearsLabel1);
		
		monthsLabel1 = new JLabel(ac.getmonthInformation());
		monthsLabel1.setFont(font4);
		monthsLabel1.setBorder(border1);
		monthsLabel1.setBounds(164, 210, 160, 50);
		monthsLabel1.setForeground(color1);
		c.add(monthsLabel1);
		
		daysLabel1 = new JLabel(ac.getdayInformation());
		daysLabel1.setFont(font4);
		daysLabel1.setBorder(border1);
		daysLabel1.setBounds(164, 280, 160, 50);
		daysLabel1.setForeground(color1);
		c.add(daysLabel1);
		
		calcagain = new JButton("CALCULATE AGAIN");
		calcagain.setBounds(62, 380, 300, 50);
		calcagain.setBackground(color2);
		calcagain.setForeground(Color.WHITE);
		calcagain.setBorder(border3);
		calcagain.setFont(font5);
		calcagain.setCursor(cursor);
		c.add(calcagain);
		
		exit = new JButton("EXIT");
		exit.setBounds(363, 380, 160, 50);
		exit.setBackground(color3);
		exit.setForeground(Color.WHITE);
		exit.setBorder(border2);
		exit.setFont(font5);
		exit.setCursor(cursor);
		c.add(exit);
		
		calcagain.addActionListener(this);
		exit.addActionListener(this);
	}
	public static void main(String[] args) {
		AgeCalculator1 frame1 = new AgeCalculator1();
		frame1.setVisible(true);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setBounds(460, 180, 596, 500);
		frame1.setTitle("Age Calculator By Imtiaz Adar");
		frame1.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == calcagain) {
			setVisible(false);
			AgeCalculator frame = new AgeCalculator();
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setBounds(460, 180, 596, 500);
			frame.setTitle("Age Calculator By Imtiaz Adar");
			frame.setResizable(false);
			
		}
		if(e.getSource() == exit) {
			System.exit(0);
		}
	}
}
