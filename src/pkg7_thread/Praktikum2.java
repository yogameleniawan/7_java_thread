/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7_thread;

/**
 *
 * @author Pamungkas
 */
public class Praktikum2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass t = new ThreadClass();
        ThreadClass t2 = new ThreadClass();
        t.start();
        
        try
        {
            t.join();
        }
        catch(Exception ex)
        {
            System.out.println("Exception has " +
                                "been caught" + ex);
        }
        t2.start();
    }
}
