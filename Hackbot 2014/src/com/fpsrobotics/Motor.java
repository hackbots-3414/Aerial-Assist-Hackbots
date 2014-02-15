package com.fpsrobotics;

/**
 *
 * @author Hackbots
 */
public interface Motor
{

    public abstract void stop();

    public abstract void forward(double speed);

    public abstract void forward(double speed, int motorStep);

    public abstract void backward(double speed);

    public abstract void backward(double speed, int motorStep);

    public abstract double getSpeed();
}
