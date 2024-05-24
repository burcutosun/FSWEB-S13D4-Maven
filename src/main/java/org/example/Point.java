package org.example;

public class Point {
    //instance variables
    private int x;
    private int y;

    //constructors
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    //methods
    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }

    public double distance(Point p){
        int xDiff=p.x-this.x;
        int yDiff=p.y-this.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }

    public double distance(int a,int b){
        int xDiff=a-this.x;
        int yDiff=b-this.y;
        return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
    }
}
