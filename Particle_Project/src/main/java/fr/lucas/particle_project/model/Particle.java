package fr.lucas.particle_project.model;

public class Particle {
    private double x, y, vx, vy;
    public static final double RADIUS = 8.0;
    private final int  r, g, b;

    public Particle(double x, double y, double vx, double vy, int r, int g, int b) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public int getR() {
        return r;
    }

    public int getG() {
        return g;
    }

    public int getB() {
        return b;
    }
}
