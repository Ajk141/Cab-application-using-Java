/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Coursework;

/**
 *
 * @author lenovo
 */
public class greencabs {
    float time;
    String ppoint;
    String dest;
    String pngr;
    double amt;
    String drvr;
    String accnt;
    String dt;
    long tphn;

    public long getTphn() {
        return tphn;
    }

    public void setTphn(long tphn) {
        this.tphn = tphn;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public String getPpoint() {
        return ppoint;
    }

    public void setPpoint(String ppoint) {
        this.ppoint = ppoint;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getPngr() {
        return pngr;
    }

    public void setPngr(String pngr) {
        this.pngr = pngr;
    }

    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getDrvr() {
        return drvr;
    }

    public void setDrvr(String drvr) {
        this.drvr = drvr;
    }

    public String getAccnt() {
        return accnt;
    }

    public void setAccnt(String accnt) {
        this.accnt = accnt;
    }
    public  void display()
    {
        System.out.println("Time "+getTime());
        System.out.println("Pickup point "+getPpoint());
        System.out.println("Destination "+getDest());
        System.out.println("Date and Time" + getDt());
        System.out.println("Amount "+getAmt());
        System.out.println("Driver "+getDrvr());
      //  System.out.println("Account "+getAccnt());
        
    }
}
