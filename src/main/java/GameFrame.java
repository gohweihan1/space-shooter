import panels.*;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    public GameFrame() {
        setTitle("Space Shooter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(800, 600);

        //Manage multiple panels
        CardLayout cardLayout = new CardLayout();
        JPanel container = new JPanel(cardLayout);

        //Initialise Panels
        MenuPanel menuPanel = new MenuPanel(container, cardLayout);
        GamePanel gamePanel = new GamePanel();
        SettingsPanel settingsPanel = new SettingsPanel();
        CustomisePanel customisePanel = new CustomisePanel();

        container.add(menuPanel, "Menu");
        container.add(gamePanel, "Game");
        container.add(settingsPanel, "Settings");
        container.add(customisePanel, "Customise");

        add(container);

        cardLayout.show(container, "Menu");

        setVisible(true);
    }
}
