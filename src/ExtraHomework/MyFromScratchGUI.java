package ExtraHomework;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MyFromScratchGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtWriteSomething;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFromScratchGUI frame = new MyFromScratchGUI();
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
	public MyFromScratchGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		contentPane.setLayout(new BorderLayout(0, 0)); // set it to null if you don't want any layout. So you can change the size of the button yourself. 
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Punch Me");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnNewButton, BorderLayout.WEST);
		
		txtWriteSomething = new JTextField();
		txtWriteSomething.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// write what you want to do here.  Once it is clicked, it'll do whatever you are writing. 
				txtWriteSomething.setText("Punch you back!");
			}
		});
		txtWriteSomething.setText("write something");
		contentPane.add(txtWriteSomething, BorderLayout.NORTH);
		txtWriteSomething.setColumns(10);
	}

}
