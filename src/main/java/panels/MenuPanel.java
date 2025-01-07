package panels;

import util.HelperFunctions;

import javax.smartcardio.Card;
import javax.swing.*;
import java.awt.*;

public class MenuPanel extends JPanel{
    private ImageIcon backgroundImage;

    public MenuPanel(JPanel container, CardLayout cardLayout) {
        setLayout(null);

        backgroundImage = new ImageIcon("src/resources/images/menu_bg.gif");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 800, 600); // Adjust these values to suit your layout
        add(backgroundLabel);

        //Title Label
        JLabel title = new JLabel("Space Shooter");
        title.setFont(new Font("Arial", Font.BOLD, 36));
        title.setForeground(Color.WHITE);
        title.setBounds(250, 50, 400, 50);
        backgroundLabel.add(title);

        //Play Button
        JButton playButton = new JButton("Start");
        playButton.setFont(new Font("Arial", Font.BOLD, 24));
        playButton.setBounds(250, 200, 300, 100);
        playButton.addActionListener(e -> cardLayout.show(container, "Game"));
        backgroundLabel.add(playButton);

        //Preferences button
        JButton preferencesButton = HelperFunctions.createCircularButton(new ImageIcon("src/resources/images/brush.png"));
        preferencesButton.setBounds(650, 500, 50, 50);
        preferencesButton.addActionListener(e -> cardLayout.show(container, "Customise"));
        backgroundLabel.add(preferencesButton);

        //Settings button
        JButton settingsButton = HelperFunctions.createCircularButton(new ImageIcon("src/resources/images/setting.png"));
        settingsButton.setBounds(720, 500, 50, 50);
        settingsButton.addActionListener(e -> cardLayout.show(container, "Settings"));
        backgroundLabel.add(settingsButton);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(backgroundImage.getImage(), getWidth(), getHeight(), this);
    }
}
