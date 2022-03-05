package frc.robot;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Delivery {
    private VictorSP motor;
    private double speed;

    public Delivery() {
        // DON'T KNOW WHERE THE MOTOR CONTROLLER WILL BE PLUGGED IN
        motor = new VictorSP(5); 
        speed = 0.3;
    }

    public void shoot() {
        motor.set(speed);
    }

    public void reverse() {
        motor.set(-speed);
    }

    public void off() {
        motor.set(0);
    }
}
