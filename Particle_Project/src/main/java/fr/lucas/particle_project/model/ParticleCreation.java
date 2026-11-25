package fr.lucas.particle_project.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static fr.lucas.particle_project.model.Particle.RADIUS;

public class ParticleCreation {
    private static final int PARTICLE_NUMBER = 150;
    private static final int SPEED = 150;

    private final List<Particle> particles = new ArrayList<>(PARTICLE_NUMBER);
    private double width;
    private double height;

    private void generate(){
        final Random random = new Random();

        for (int i = 0; i < PARTICLE_NUMBER; i++) {
            double angle = random.nextDouble() * 2 * Math.PI;

            double x = RADIUS + random.nextDouble() * (width- 2 * RADIUS);
            double y = RADIUS + random.nextDouble() * (height- 2 * RADIUS);
            double vx = SPEED * Math.cos(angle);
            double vy = SPEED * Math.sin(angle);
            int r = random.nextInt(256);
            int g = random.nextInt(256);
            int b = random.nextInt(256);

            Particle p = new Particle(x, y, vx, vy, r, g, b);
            particles.add(p);
        }
    }

    public List<Particle> getListOfParticles(){
        return Collections.unmodifiableList(particles);
    }

    public ParticleCreation(double width, double height) {
        this.width = width;
        this.height = height;
        generate();
    }
}
