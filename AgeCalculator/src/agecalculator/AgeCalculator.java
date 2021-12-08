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
import java.time.LocalDate;
import java.time.Period;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class AgeCalculator extends JFrame implements ActionListener{
	private Container c;
	private JLabel birthdayLabel;
	private JLabel dayLabel;
	private JLabel monthLabel;
	private JLabel yearLabel;
	private JLabel introLabel;
	private JTextField dayTextField;
	private JTextField monthTextField;
	private JTextField yearTextField;
	private JButton calculateButton;
	private ImageIcon icon;
	private Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
	private Font font1 = new Font("Comic Sans Ms", Font.BOLD, 30);
	private Font font2 = new Font("DS-DIGITAL", Font.PLAIN, 25);
	private Font font3 = new Font("Verdana", Font.PLAIN, 30);
	private Font font4 = new Font("OCR A EXTENDED", Font.PLAIN, 30);
	private Font font5 = new Font("CASTELLAR", Font.BOLD, 20);
	private Font font6 = new Font("Century Gothic", Font.BOLD, 15);
	private Color color1 = Color.BLACK;
	private Color color2 = new Color(192, 192, 192);
	private Color color3 = new Color(199, 14, 14);
	private Border border1 = BorderFactory.createBevelBorder(2);
	private Border border2 = new LineBorder(color3, 2, true);
	
	public static String dayString = "", monthString = "", yearString = "", days = "", months = "", years = "";
	public boolean ok = true;
	public AgeCalculator() {
		initcontainer();
	}
	public void initcontainer() {
		c = new Container();
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		icon = new ImageIcon(getClass().getResource("iconage.png"));
		setIconImage(icon.getImage());
		introLabel = new JLabel("AGE CALCULATOR MADE BY IMTIAZ ADAR");
		introLabel.setFont(font6);
		introLabel.setBorder(border1);
		introLabel.setBounds(135, 20, 320, 30);
		introLabel.setForeground(color1);
		c.add(introLabel);
		
		birthdayLabel = new JLabel("WRITE YOUR BIRTH DATE");
		birthdayLabel.setFont(font1);
		birthdayLabel.setBorder(border1);
		birthdayLabel.setBounds(80, 90, 430, 70);
		birthdayLabel.setForeground(color1);
		c.add(birthdayLabel);
		
		dayLabel = new JLabel("DAY");
		dayLabel.setFont(font4);
		dayLabel.setBorder(border1);
		dayLabel.setBounds(90, 170, 60, 70);
		dayLabel.setForeground(color1);
		c.add(dayLabel);
		
		monthLabel = new JLabel("MONTH");
		monthLabel.setFont(font4);
		monthLabel.setBorder(border1);
		monthLabel.setBounds(280, 170, 100, 70);
		monthLabel.setForeground(color1);
		c.add(monthLabel);
		
		yearLabel = new JLabel("YEAR");
		yearLabel.setFont(font4);
		yearLabel.setBorder(border1);
		yearLabel.setBounds(90, 250, 80, 70);
		yearLabel.setForeground(color1);
		c.add(yearLabel);
		
		dayTextField = new JTextField();
		dayTextField.setBorder(border1);
		dayTextField.setBounds(160, 185, 70, 40);
		dayTextField.setBackground(color2);
		dayTextField.setForeground(Color.BLACK);
		dayTextField.setFont(font2);
		dayTextField.setHorizontalAlignment(JTextField.CENTER);
		c.add(dayTextField);
		
		monthTextField = new JTextField();
		monthTextField.setBorder(border1);
		monthTextField.setBounds(390, 185, 90, 40);
		monthTextField.setBackground(color2);
		monthTextField.setForeground(Color.BLACK);
		monthTextField.setFont(font2);
		monthTextField.setHorizontalAlignment(JTextField.CENTER);
		c.add(monthTextField);
		
		yearTextField = new JTextField();
		yearTextField.setBorder(border1);
		yearTextField.setBounds(180, 265, 300, 40);
		yearTextField.setBackground(color2);
		yearTextField.setForeground(Color.BLACK);
		yearTextField.setFont(font2);
		yearTextField.setHorizontalAlignment(JTextField.CENTER);
		c.add(yearTextField);
		
		calculateButton = new JButton("CALCULATE");
		calculateButton.setBounds(216, 370, 160, 50);
		calculateButton.setToolTipText("Click to Calculate Age");
		calculateButton.setBackground(color3);
		calculateButton.setForeground(Color.WHITE);
		calculateButton.setBorder(border2);
		calculateButton.setFont(font5);
		calculateButton.setCursor(cursor);
		c.add(calculateButton);

		calculateButton.addActionListener(this);
	}
	public String getdayInformation() {
		return days;
	}
	public String getmonthInformation() {
		return months;
	}
	public String getyearInformation() {
		return years;
	}
	public static void main(String[] args) {
		AgeCalculator frame = new AgeCalculator();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(460, 180, 596, 500);
		frame.setTitle("Age Calculator By Imtiaz Adar");
		frame.setResizable(false);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean ok1 = true;
		if(e.getSource() == calculateButton) {
			dayString = (String)dayTextField.getText();
			monthString = (String)monthTextField.getText();
			yearString = (String)yearTextField.getText();
			for(int i = 0; i < dayString.length(); i++) {
				if(!Character.isDigit(dayString.charAt(i))) {
					JOptionPane.showMessageDialog(null, "You Have To Write Digits!! Try Again!!", "DAY ERROR!!", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("error333.png")));
					dayTextField.setText("");
					ok = false; ok1 = false;
					break;
				}
				continue;
			}
			for(int i = 0; i < monthString.length(); i++) {
				if(!Character.isDigit(monthString.charAt(i))) {
					JOptionPane.showMessageDialog(null, "You Have To Write Digits!! Try Again!!", "MONTH ERROR!!", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("error333.png")));
					monthTextField.setText("");
					ok = false; ok1 = false;
					break;
				}
				continue;
			}
			for(int i = 0; i < yearString.length(); i++) {
				if(!Character.isDigit(yearString.charAt(i))) {
					JOptionPane.showMessageDialog(null, "You Have To Write Digits!! Try Again!!", "YEAR ERROR!!", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("error333.png")));
					yearTextField.setText("");
					ok = false; ok1 = false;
					break;
				}
				continue;
			}
			if(ok1) {
				if(dayString.length() > 2 || dayString.length() < 1 || Integer.parseInt(dayString) > 31) {
					JOptionPane.showMessageDialog(null, "Write The Correct Day And Try Again!!", "DAY ERROR!!", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("error333.png")));
					dayTextField.setText("");
					ok = false;
				}
				if(monthString.length() > 2 || monthString.length() < 1 || Integer.parseInt(monthString) > 12) {
					JOptionPane.showMessageDialog(null, "Write The Correct Month And Try Again!!", "MONTH ERROR!!", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("error333.png")));
					monthTextField.setText("");
					ok = false;
				}
				if(yearString.length() > 4 || yearString.length() < 4) {
					JOptionPane.showMessageDialog(null, "Write The Correct Year And Try Again!!", "YEAR ERROR!!", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("error333.png")));
					yearTextField.setText("");
					ok = false;
				}
				if((!(dayString.length() > 2 || dayString.length() < 1 || Integer.parseInt(dayString) > 31)) && (!(monthString.length() > 2 || monthString.length() < 1 || Integer.parseInt(monthString) > 12)) && 
					(!(yearString.length() > 4 || yearString.length() < 4))) {
					ok = true;
				}
			}
			if(ok) {
				int result = JOptionPane.showConfirmDialog(null, "Are You Sure About All The Information ?", "SURE OR NOT", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "SUCCESSFULLY TAKEN YOUR INFORMATIONS", "CONGRATULATIONS", JOptionPane.ERROR_MESSAGE, new ImageIcon(getClass().getResource("confirm44.png")));
					LocalDate todays_date = LocalDate.now();
					LocalDate birth_date = LocalDate.of(Integer.parseInt(yearString), Integer.parseInt(monthString), Integer.parseInt(dayString));
					Period period = Period.between(birth_date, todays_date);
					days = Integer.toString(period.getDays());
					months = Integer.toString(period.getMonths());
					years = Integer.toString(period.getYears());
					setVisible(false);
					AgeCalculator1 frame1 = new AgeCalculator1();
					frame1.setVisible(true);
					frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame1.setBounds(460, 180, 596, 500);
					frame1.setTitle("Age Calculator By Imtiaz Adar");
					frame1.setResizable(false);
				}
			}
		}
	}
}
