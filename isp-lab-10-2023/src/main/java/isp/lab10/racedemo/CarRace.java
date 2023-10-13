package isp.lab10.racedemo;
import isp.lab10.SemaphorePanel;
import isp.lab10.SemaphoreThread;

import java.awt.*;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

public class CarRace {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Car Race");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2,1));

        CarPanel carPanel = new CarPanel();

        SemaphorePanel semaphorePanel = new SemaphorePanel();
        frame.getContentPane().add(semaphorePanel);

        frame.getContentPane().add(carPanel);
        frame.pack();
        frame.setSize(500,300);
        frame.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);
        semaphoreThread.start();

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        semaphoreThread.join();

        car1.start();
        car2.start();
        car3.start();
        car4.start();
    }
    
}

