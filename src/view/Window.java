package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import java.awt.BorderLayout;
import java.awt.Font;

public class Window extends JFrame {
    public final static int HEIGHT = 600;
    public final static int WIDTH = 1000;

    private JPanel mainPanel;

    private JLabel header;

    public Window() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(Window.WIDTH, Window.HEIGHT);

        // main panel
        this.mainPanel = new JPanel(new BorderLayout(10, 10));
        this.setContentPane(mainPanel);

        // title header
        this.header = new JLabel("Physics Simulation");
        this.header.setFont(new FontUIResource("Arial", Font.BOLD, 14));
        this.mainPanel.add(this.header, BorderLayout.NORTH);

        // simulation panel
        SimulationPanel simulationPanel = new SimulationPanel();
        this.mainPanel.add(simulationPanel, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }
}
