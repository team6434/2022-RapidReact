package frc.robot;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Intake {
    private VictorSP arm, wheels;
    private double armSpeed, wheelSpeed;

    public Intake(){
        // DON'T KNOW WHERE THE MOTOR CONTROLLER WILL BE PLUGGED IN
        arm = new VictorSP(3);
        wheels = new VictorSP(4);
        armSpeed = 0.1;
        wheelSpeed = 0.4;

    }

    public void lower(){
        arm.set(armSpeed);
    }

    public void lift(){
        arm.set(-armSpeed);
    }

    public void armsOff(){
        arm.set(0);
    }

    public void getBall(){
        wheels.set(wheelSpeed);
    }

    public void reverseBall(){
        wheels.set(-wheelSpeed);
    }

    public void wheelsOff(){
        wheels.set(0);
    }

    
}
