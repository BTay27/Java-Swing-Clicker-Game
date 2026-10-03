/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.co.mlt.chapeltown.btaylor.ClickerGame;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
/**
 *
 * @author brook
 */
public class CounterWindow {
    private final Counter counter;
    
    private final JLabel label = new JLabel("Clicks: 0");
    private final JButton BUbutton = new JButton("Upgrade Click (10)");
    private final JButton BAbutton = new JButton("Upgrade Autoclicker (10)");
    
    
    public CounterWindow(Counter counter){
        this.counter = counter;
        
        
        Timer timer = new Timer(1000, e -> {
            counter.autoClick();
            updateDisplay();
        });
        timer.start();
        
        
        JButton INCbutton = new JButton("Click to Increment the value!");
        INCbutton.addActionListener(e -> handleclickINC());
        
        BUbutton.addActionListener(e -> handleclickBU());
        BAbutton.addActionListener(e -> handleclickBA());
       
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(label, BorderLayout.CENTER);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        mainPanel.setBackground(new Color(30, 30, 46));
        label.setForeground(Color.WHITE);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(INCbutton);
        buttonPanel.add(BUbutton);
        buttonPanel.add(BAbutton);
        buttonPanel.setOpaque(false);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(label.getFont().deriveFont(32f));
        
        
        JFrame Frame = new JFrame("Clicker Game");
        Frame.add(mainPanel);
        Frame.setSize(500,500);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setVisible(true);
    }
    
    private void handleclickINC() {
    counter.Increment();
    updateDisplay();
}

    private void handleclickBU() {
        counter.buyUpgrade();
        updateDisplay();
    }

    private void handleclickRES() {
        counter.reset();
        updateDisplay();
    }
    private void handleclickBA(){
        counter.buyAuto();
        updateDisplay();
    }
    private void updateDisplay() {
    label.setText("Clicks: " + counter.getCount());
    BUbutton.setText("Upgrade Click (" + counter.getUC() + ")");
    BAbutton.setText("Upgrade Autoclicker (" + counter.getAC() + ") ");
    }
}
