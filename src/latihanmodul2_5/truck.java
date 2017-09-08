/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul2_5;

/**
 *
 * @author client
 */
public class truck {
    public int cadence;
    public int gear;
    public int speed;
    private int decrement;
    
    public truck (int startCadence, int startSpeed, int startGear)
    {
        gear = startGear;
        cadence = startCadence;
        speed =startSpeed;
    }
    public void setCadance(int newValue)
    {
        cadence = newValue;
    }
    public void setGear(int newValue)
    {
        gear = newValue;
    }
    public void applybrake(int increment)
    {
        speed = decrement;
    }
    
        public void speedUp(int increment)
        {
            speed = increment;
        }
          
    
}
