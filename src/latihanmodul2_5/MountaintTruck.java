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
public class MountaintTruck extends truck {
    
    public int seatHeight;

    public MountaintTruck(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    }
    public static void main (String[] aku)
    {
        System.out.println("Mulai berjalan");
        MountaintTruck MB = new MountaintTruck(0,0,0,0);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.gear);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
        MB.speedUp(2);
        System.out.println("gear="+ MB.gear);
        System.out.println("speed="+ MB.speed);
    }
   
    
}
