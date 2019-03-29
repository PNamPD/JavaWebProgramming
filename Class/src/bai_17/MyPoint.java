/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_17;

/**
 *
 * @author ASUS
 */
public class MyPoint {
    int x,y;
    public MyPoint(){
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        return "point:{"+this.x+", "+this.y+")";
    }
    public double distance(int x,int y){
        int xDiff= this.x-x;
        int yDiff= this.y- y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    public double distance(MyPoint another){
        int xDiff= this.x- another.x;
        int yDiff= this.x- another.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
    
    
}
