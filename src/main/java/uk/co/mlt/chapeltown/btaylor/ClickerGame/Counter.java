/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uk.co.mlt.chapeltown.btaylor.ClickerGame;

/**
 *
 * @author brook
 */
public class Counter {
    private int count = 0;
    private int perClick = 1;
    private int upgradeCost = 10;
    private int autopersecond = 0;
    private int autoCost = 10;
    
    public Counter(){};
    
    public void Increment(){count = count + perClick;}
       
    public int getCount(){return count;}
    
    public void reset(){count = 0;}
    
    public void buyUpgrade(){
    if (count >= upgradeCost){
        count = count - upgradeCost;
        perClick = perClick + 1;
        upgradeCost = upgradeCost * 2;
        }
    }
    public void buyAuto(){
        if (count >= autoCost){
            count = count - autoCost;
            autopersecond = autopersecond + 1;
            autoCost = autoCost * 2;
        }
    }
    public void autoClick(){
    count = count + autopersecond;
    }
    public int getAC(){return autoCost;}
    public int getUC(){return upgradeCost;}
    public int getperClick(){return perClick;}
}
