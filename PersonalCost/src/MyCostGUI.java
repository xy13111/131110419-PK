import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyCostGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCostGUI window = new MyCostGUI();
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
	public MyCostGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 683, 425);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		frame.getContentPane().add(layeredPane, BorderLayout.CENTER);
		
		JButton button = new JButton("\u6211\u7684\u6536\u5165");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyRevenueGUI myRevenueGUI = new MyRevenueGUI();
				myRevenueGUI.getFrame().setVisible(true);

			}
		});
		button.setBounds(108, 44, 120, 60);
		layeredPane.add(button);
		
		JButton button_1 = new JButton("\u6211\u7684\u652F\u51FA");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyExpendGUI myExpendGUI = new MyExpendGUI();
				myExpendGUI.getFrame().setVisible(true);
			}
		});
		button_1.setBounds(108, 153, 120, 60);
		layeredPane.add(button_1);
		
		JButton btnNewButton = new JButton("\u6211\u7684\u94B1\u5305");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyWalletGUI myWalletGUI = new MyWalletGUI();
				myWalletGUI.getFrame().setVisible(true);
			}
		});
		btnNewButton.setBounds(108, 261, 120, 60);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u6536\u5165\u60C5\u51B5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RevenueGUI revenueGUI = new RevenueGUI();
				revenueGUI.getFrame().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(438, 44, 120, 60);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u652F\u51FA\u60C5\u51B5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ExpendGUI expendGUI = new ExpendGUI();
				expendGUI.getFrame().setVisible(true);
			}
		});
		btnNewButton_2.setBounds(438, 153, 120, 60);
		layeredPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u9000\u51FA");
		btnNewButton_3.setBounds(438, 261, 120, 60);
		layeredPane.add(btnNewButton_3);
	}
}
