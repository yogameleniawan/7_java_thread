/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_thread;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pamungkas
 */
public class Generator {

    private int low, high;

    public Generator(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public synchronized void generateRandomNumber(String name) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int result = r.nextInt(high - low) + low;
            System.out.println(name + ": " + result);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Generator.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
        }
    }
}
