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


public class MyRevenueGUI {

	private JFrame frame;
	private JTextField textField;
   
	int count_1 = 0;//记录生活费（下面的参数与费用对应）
	int count_2 = 0;
	int count_3 = 0;
	int count_4 = 0;
	int count_5 = 0;

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
					MyRevenueGUI window = new MyRevenueGUI();
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
	public MyRevenueGUI() {
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
		
		JLabel lblNewLabel = new JLabel("\u8BF7\u5F55\u5165\u8BE5\u7B14\u6536\u5165\u7684\u4FE1\u606F\uFF1A");
		lblNewLabel.setBounds(22, 10, 147, 29);
		layeredPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u65E5\u671F\uFF1A");
		label.setBounds(115, 49, 54, 15);
		layeredPane.add(label);
		
		
		JLabel label_1 = new JLabel("\u6536\u5165\u91D1\u989D\uFF1A");
		label_1.setBounds(115, 86, 103, 15);
		layeredPane.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(190, 83, 113, 21);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("\u6536\u5165\u6765\u6E90\uFF1A");
		label_2.setBounds(115, 121, 79, 15);
		layeredPane.add(label_2);
		
		
		JLabel lblNewLabel_2 = new JLabel("\u56FA\u5B9A\u6536\u5165\uFF1A");
		lblNewLabel_2.setBounds(115, 159, 79, 15);
		layeredPane.add(lblNewLabel_2);
		
		final JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("生活费");
		comboBox.addItem("勤工俭学");
		comboBox.addItem("奖学金");
		comboBox.addItem("生意投资");
		comboBox.addItem("其它");
		comboBox.setBounds(190, 118, 113, 21);
		layeredPane.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("是");
		comboBox_1.addItem("否");
		comboBox_1.setBounds(190, 156, 113, 21);
		layeredPane.add(comboBox_1);
		
		datechooser.setBounds(190,49,113,27);
		layeredPane.add(datechooser);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			    time  = sdf.format(datechooser.getDate().getTime());

		          thisTime = new Timestamp(System.currentTimeMillis());
		         thisTime = Timestamp.valueOf(time);
		         
				RevenueControl revenueControl = new RevenueControl();
				
				thisChoose = (String) comboBox.getSelectedItem();
			
				SimpleDateFormat sdf1= new SimpleDateFormat("HHmmss");
			    String time_1 = sdf1.format(datechooser.getDate().getTime());
				revenueControl.saveRevenue(Integer.parseInt(time_1), Integer.parseInt(textField.getText()), thisTime, thisChoose,0);
				RevenueSuccess RevenueSuccess = new RevenueSuccess();
				
				RevenueSuccess.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(308, 229, 93, 23);
		layeredPane.add(btnNewButton);

	}
	
	public Integer getcount_1() {
		if(thisChoose=="生活费"){
			
			count_1++;
		}
		// TODO Auto-generated method stub
		return count_1;
	}
	
	public Integer getcount_2() {
		if(thisChoose=="勤工俭学"){
			
			++count_2;
		}
		// TODO Auto-generated method stub
		return count_2;
	}
	public Integer getcount_3() {
		
		if(thisChoose=="奖学金"){
			
			++count_3;
		}
		// TODO Auto-generated method stub
		return count_3;
	}
	
	public Integer getcount_4() {
		
		if(thisChoose=="生意投资"){
			
			++count_4;
		}
		// TODO Auto-generated method stub
		return count_4;
	}
	
	public Integer getcount_5() {
		
		if(thisChoose=="其它"){
			
			++count_5;
		}
		// TODO Auto-generated method stub
		return count_5;
	}
	
  public Integer getcount() {
		// TODO Auto-generated method stub
		return count_1+count_2+count_3+count_4+count_5;
	}
	public Component getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}
}
