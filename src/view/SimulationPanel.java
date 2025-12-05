package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import physics.PhysicsObject;
import physics.Vector2D;

public class SimulationPanel extends JPanel {
    private static final double DELTA_TIME = 16;
    private double speed = 1;
    private ArrayList<PhysicsObject> physicsObjects = new ArrayList<>();

    public SimulationPanel() {
        setPreferredSize(new Dimension(600, 600));
        Timer timer = new Timer((int) SimulationPanel.DELTA_TIME, e -> {
            updatePhysics();
            repaint();
        });
        timer.start();
        physicsObjects.add(new PhysicsObject(new Vector2D(50, 50), new Vector2D(0, 0), new Vector2D(0, 0)));
    }

    private void updatePhysics() {
        for (PhysicsObject physicsObject : physicsObjects) {
            physicsObject.updatePosition(DELTA_TIME);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (PhysicsObject physicsObject : physicsObjects) {
            g.fillOval((int) physicsObject.getPosition().getX(), (int) physicsObject.getPosition().getY(), 10, 10);
        }
    }
}
