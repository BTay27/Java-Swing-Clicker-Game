/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uk.co.mlt.chapeltown.btaylor.ClickerGame;
import javax.swing.*;
/**
 *
 * @author brook
 */
public class ClickerGame {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SwingUtilities.invokeLater(() -> new CounterWindow(new Counter()));
    }
}
