package frc.robot;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Drivetrain {

    private VictorSP left, right;
    public DifferentialDrive diffDrive;

    public Drivetrain(){
        left = new VictorSP(0);
        right = new VictorSP(1);

        // diffDrive = new DifferentialDrive(left, right);
    }

    public void drive(double leftSpeed, double rightSpeed){
        left.set(leftSpeed);
        right.set(rightSpeed);
    }

    public void drive(double speed) {
        left.set(speed);
        right.set(-speed);
    }

    public void arcadeDrive(double Xreading, double Yreading, double speed) {

        double LMotorVal;
        double RMotorVal;

        if (Yreading > 0)
        {
            LMotorVal = Yreading + Xreading;
            RMotorVal = -(Yreading - Xreading);
        }
        else if (Yreading < 0)
        {
            LMotorVal = Yreading - Xreading;
            RMotorVal = -(Yreading + Xreading);
        }
        else{
            LMotorVal = Xreading;
            RMotorVal = Xreading;
        }

        double left = LMotorVal*Math.pow(LMotorVal,2.0)/Math.abs(LMotorVal);
        double right = RMotorVal*Math.pow(RMotorVal,2.0)/Math.abs(RMotorVal);

        double min = -1.0;
        double max = 1.0;

        left = Math.max(min, Math.min(max, left));
        right = Math.max(min, Math.min(max, right));

        this.drive(left, right);   
        
    }


}
