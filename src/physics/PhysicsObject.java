package physics;

public class PhysicsObject {
    private Vector2D position = new Vector2D(0, 0);
    private Vector2D velocity = new Vector2D(0, 0);
    private Vector2D acceleration = new Vector2D(0, 0);
    private Vector2D force = new Vector2D(0, 0);

    private double mass = 0;
    private int diameter = 0;

    public PhysicsObject(Vector2D position, double mass, int diameter) {
        this.position = position;
        this.mass = mass;
        this.diameter = diameter;
    }

    public PhysicsObject(Vector2D position, Vector2D velocity, Vector2D acceleration, double mass, int diameter) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.mass = mass;
        this.diameter = diameter;
    }

    public void updatePosition(double dt, double speed) {
        this.acceleration = this.force.scale(1 / this.mass);
        this.velocity = this.velocity.add(this.acceleration.scale(dt));
        Vector2D moveVector = this.velocity.scale(dt);

        this.position = this.position.add(moveVector.scale(speed));
    }

    public double getMass() {
        return mass;
    }

    public int getDiameter() {
        return diameter;
    }

    public Vector2D getPosition() {
        return position;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public Vector2D getAcceleration() {
        return acceleration;
    }

    public void setForce(Vector2D force) {
        this.force = force;
    }
}
