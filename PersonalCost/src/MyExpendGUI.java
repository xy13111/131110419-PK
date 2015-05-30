import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;













import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.swing.JComboBox;


public class MyExpendGUI {

	private JFrame frame;
	private JTextField textField;
	int i;
	String thisChoose;
	String time;
	Timestamp thisTime;
	DateChooser datechooser =new DateChooser();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyExpendGUI window = new MyExpendGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyExpendGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u6211\u7684\u6536\u5165");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u5F55\u5165\u8BE5\u7B14\u652F\u51FA\u7684\u4FE1\u606F\uFF1A");
		lblNewLabel.setBounds(22, 10, 147, 29);
		layeredPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u65E5\u671F\uFF1A");
		label.setBounds(115, 49, 54, 15);
		layeredPane.add(label);
		
		
		JLabel label_1 = new JLabel("\u652F\u51FA\u91D1\u989D\uFF1A");
		label_1.setBounds(115, 86, 103, 15);
		layeredPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(190, 83, 103, 21);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u652F\u51FA\u7528\u9014\uFF1A");
		label_2.setBounds(115, 124, 79, 15);
		layeredPane.add(label_2);
		
		JLabel lblNewLabel_2 = new JLabel("\u8BA1\u5212\u652F\u51FA\uFF1A");
		lblNewLabel_2.setBounds(115, 168, 79, 15);
		layeredPane.add(lblNewLabel_2);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(190, 121, 107, 21);
		comboBox.addItem("生活费");
		comboBox.addItem("勤工俭学");
		comboBox.addItem("奖学金");
		comboBox.addItem("生意投资");
		comboBox.addItem("其它");
		thisChoose = (String) comboBox.getSelectedItem();
		layeredPane.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setBounds(190, 165, 103, 21);
		comboBox_1.addItem("是");
		comboBox_1.addItem("否");
		layeredPane.add(comboBox_1);
	
		datechooser.setBounds(190,49,103,27);
		layeredPane.add(datechooser);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			    time  = sdf.format(datechooser.getDate().getTime());

		          thisTime = new Timestamp(System.currentTimeMillis());
		         thisTime = Timestamp.valueOf(time);
		         
				ExpendControl expendControl = new ExpendControl();
				expendControl.saveExpend(i, Integer.parseInt(textField.getText()), thisTime, thisChoose,0);
				
				RevenueSuccess RevenueSuccess = new RevenueSuccess();
				RevenueSuccess.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(308, 229, 93, 23);
		layeredPane.add(btnNewButton);

	}

	public Component getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}
}
