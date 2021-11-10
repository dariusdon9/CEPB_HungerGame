import static java.lang.Math.random;

public class Cell {

    public int x;
    public int y;
    public int timesFeed = 0;
    public boolean alive = true;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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

    public boolean isAlive() {
        boolean state = this.alive;
        return state;
    }

   /*public getNeighbors(int neighbors[4][4]){
        //TODO later
    }
    */

}