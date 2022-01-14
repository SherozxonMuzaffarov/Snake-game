import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyFrame(){
		this.add(new MyPanel());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Snake");
		this.setResizable(false);
//		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}
	
}
