/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pamungkas
 */
public class ThreadTwo extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": " + i);
            try {
                sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadTwo.class.getName()).log(Level.SEVERE, null,
                        ex);
            }
        }
    }
}
