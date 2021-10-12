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
public class Praktikum1 {

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadOne("Thread Satu"));
        t.start();
        ThreadTwo t2 = new ThreadTwo();
        t2.setName("Thread Dua");
        t2.start();
    }
}
