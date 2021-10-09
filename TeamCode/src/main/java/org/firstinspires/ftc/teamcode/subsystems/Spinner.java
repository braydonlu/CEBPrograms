package org.firstinspires.ftc.teamcode.subsystems;
import com.acmerobotics.dashboard.telemetry.TelemetryPacket;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;

import org.firstinspires.ftc.teamcode.robot.Robot;
import org.firstinspires.ftc.teamcode.robot.Subsystem;

public class Spinner implements Subsystem {
    //Hardware: 1 motor, 1 encoder
    private DcMotorEx spinMotor;
    private double spinPower= 0.0;

    public Spinner(Robot robot) {
        spinMotor = robot.getMotor("liftMotor");
        spinPower=0.0;


    }

    public void setPower (double power ){
        spinPower = power;
    }

    /*public void setTargetAngle(double targetAngle) {
        armPID.reset();
        armPID.setTargetPosition(targetAngle);
    }

    private double getRawArmAngle() {
        // encoder position * (2pi / TICKS_PER_REV)
        return armMotor.getCurrentPosition() * (2 * Math.PI / TICKS_PER_REV);
    }

    public double getArmAngle() {
        return Angle.norm(getRawArmAngle());
    }

    public boolean targetReached() {
        return Math.abs(armPID.getLastError()) <= ARM_ACCEPTABLE_ERROR_MARGIN;
    }
*/
    @Override
    public void update(TelemetryPacket packet) {
        //double liftPower = armPID.update(getArmAngle());
        spinMotor.setPower(spinPower);
    }
}

