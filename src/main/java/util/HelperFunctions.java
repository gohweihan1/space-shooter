package util;

import javax.swing.*;
import java.awt.*;

public class HelperFunctions {
    // Helper method to create a circular button
    public static JButton createCircularButton(ImageIcon icon) {
        JButton button = new JButton(icon) {
            @Override
            protected void paintComponent(Graphics g) {
                if (isOpaque()) {
                    g.setColor(getBackground());
                    g.fillOval(0, 0, getWidth(), getHeight());
                }
                super.paintComponent(g);
            }

            @Override
            public Dimension getPreferredSize() {
                return new Dimension(50, 50); // Ensures the button is circular
            }
        };

        // Remove default button decorations
        button.setBorderPainted(false);
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);

        return button;
    }
}
