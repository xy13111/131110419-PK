import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class RevenueGUI {

	private JFrame frame;
	private JTable table;
	MyRevenueGUI MyRevenueGUI = new MyRevenueGUI();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RevenueGUI window = new RevenueGUI();
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
	public RevenueGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u6536\u5165\u60C5\u51B5");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u751F\u6D3B\u8D39\u6240\u5360\u6536\u5165\u6BD4\u4F8B\uFF08\u767E\u5206\u6BD4\uFF09", MyRevenueGUI.getcount_1()/MyRevenueGUI.getcount()*100},
				{"\u52E4\u5DE5\u4FED\u5B66\u6240\u5360\u6536\u5165\u6BD4\u4F8B", MyRevenueGUI.getcount_2()/MyRevenueGUI.getcount()*100},
				{"\u5956\u5B66\u91D1\u6240\u5360\u6536\u5165\u6BD4\u4F8B", MyRevenueGUI.getcount_3()/MyRevenueGUI.getcount()*100},
				{"\u751F\u610F\u6295\u8D44\u6240\u5360\u6536\u5165\u6BD4\u4F8B", MyRevenueGUI.getcount_4()/MyRevenueGUI.getcount()*100},
				{"\u5176\u4ED6\u6536\u5165\u6240\u5360\u6BD4\u4F8B", MyRevenueGUI.getcount_5()/MyRevenueGUI.getcount()*100},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(184);
		table.getColumnModel().getColumn(0).setMinWidth(35);
		table.getColumnModel().getColumn(1).setPreferredWidth(107);
		table.setBounds(92, 90, 285, 80);
		layeredPane.add(table);
		
		JButton button = new JButton("\u9000\u51FA");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button.setBounds(257, 199, 93, 23);
		layeredPane.add(button);
		
		JLabel label = new JLabel("\u6536\u5165\u5177\u4F53\u8BE6\u60C5\uFF1A");
		label.setBounds(69, 49, 93, 15);
		layeredPane.add(label);
	}
	
	public Component getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}
}
