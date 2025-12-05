package physics;

public class PhysicsObject {
    private Vector2D position = new Vector2D(0, 0);
    private Vector2D velocity = new Vector2D(0, 0);
    private Vector2D acceleration = new Vector2D(0, 0);

    public PhysicsObject(Vector2D position, Vector2D velocity, Vector2D acceleration) {
        this.position = position;
        this.velocity = velocity;
        this.acceleration = acceleration;
    }

    public void updatePosition(double dt) {
        this.position = this.position.add(new Vector2D(1, 0));
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
}
