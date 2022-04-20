package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class Autonomous {
    
    private Drivetrain drivetrain;
    // ball delivery

    public Autonomous(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
        //ball delivery
    }

    // drive for a specified amount of seconds and speed
    public void driveByTime(double time, double speed){
        // reset and start timer 
        Timer currentTimer = new Timer();
        currentTimer.reset();
        currentTimer.start();

        // drive while timer is below specificed time
        while(currentTimer.get() < time){
            drivetrain.drive(speed);
        }

        // stop time and drivetrain
        currentTimer.stop();
        drivetrain.drive(0);
    }

    public void deliverBall() {}
 // This is comment 
}
