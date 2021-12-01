package com.example.gameoflife;

import static com.example.gameoflife.Food.*;
import static java.lang.Math.random;

public class Cell extends Thread{
    public int x;
    public int y;
    public int food;
    public Thread thread;
    public String type;
    public int timesFeed = 0;
    public boolean alive = true;
    public Cell(int x, int y){

        this.x = x;
        this.y = y;
    }
    public Cell(int x, int y,String type){
        this.x = x;
        this.y = y;
        this.type =type;
    }

    public String getType(){
        return type;
    }

    public void setType(){
        this.type = type;
    }
    public int getX(){
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public  void setX(int x) {
        this.x = x;
    }

    public  void setY(int y) {
        this.y = y;
    }

    public int getTimesFeed(int timesFeed) {
        timesFeed = this.timesFeed;
        return timesFeed;
    }

    public boolean feed() {
        if (Food.food > 0) {
            this.timesFeed++;
            Food.food--;
            return true;        //feeded succesfully
        } else
            return false;
    }


    public boolean isFed() {
        if (this.timesFeed >= 10)
            return true;
        else
            return false;
    }

    public void die() {
        this.alive = false;
        Food.food = (int) (Food.food + (random() * ((5 - 1) + 1)) + 1);

    }



}
