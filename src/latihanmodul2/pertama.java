/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmodul2;

/**
 *
 * @author client
 */
public class pertama {
    private int a = 10;
    
    protected void terprotek ()
    {
        System.out.println("method ini hanya untuk anaknya");
    }
    
    public void info ()
    {
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada - "+this.getClass ().getName());
    }
    
}
