import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JButton;


public class ExpendGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpendGUI window = new ExpendGUI();
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
	public ExpendGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u652F\u51FA\u60C5\u51B5");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"\u751F\u6D3B\u652F\u51FA\u6240\u5360\u6BD4\u4F8B\uFF08\u767E\u5206\u4E4B\uFF09", null},
				{"\u5B66\u4E60\u652F\u51FA\u6240\u5360\u6BD4\u4F8B", null},
				{"\u533B\u7597\u652F\u51FA\u6240\u5360\u6BD4\u4F8B", null},
				{"\u5A31\u4E50\u652F\u51FA\u6240\u5360\u6BD4\u4F8B", null},
				{"\u5176\u5B83\u652F\u51FA\u6240\u5360\u6BD4\u4F8B", null},
			},
			new String[] {
				"New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(165);
		table.getColumnModel().getColumn(1).setPreferredWidth(110);
		table.setBounds(93, 86, 275, 80);
		layeredPane.add(table);
		
		JLabel label = new JLabel("\u652F\u51FA\u5177\u4F53\u8BE6\u60C5\uFF1A");
		label.setBounds(70, 48, 110, 15);
		layeredPane.add(label);
		
		JButton button = new JButton("\u9000\u51FA");
		button.setBounds(278, 200, 93, 23);
		layeredPane.add(button);
	}
	
	
	
	public Component getFrame() {
		// TODO Auto-generated method stub
		return frame;
	}
}
