import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	
	public MainFrame() {
		Plataform plataform = new Plataform();
		add(plataform);
		setTitle("My First Game Engine");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
	}

}
