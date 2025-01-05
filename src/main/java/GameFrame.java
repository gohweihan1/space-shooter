import javax.swing.*;

public class GameFrame extends JFrame{
    public GameFrame() {
        setTitle("Space Shooter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600);

        //add((new GamePanel());

        setVisible(true);
    }
}
