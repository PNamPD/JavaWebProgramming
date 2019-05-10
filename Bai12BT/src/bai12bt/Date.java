/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12bt;

/**
 *
 * @author ASUS
 */
public class Date {
    private int Day,Month,Year;
    public int getDay(){
        return this.Day;
    }
    public void setDay(int Day){
        this.Day=Day;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    @Override
    public String toString() {
        return "Date{" + "Day=" + Day + ", Month=" + Month + ", Year=" + Year + '}';
    }
    
    
    
}
