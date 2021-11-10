import java.sql.Timestamp;
import java.util.Random;

import static java.lang.Math.random;

public class Cell {

    public int x;
    public int y;
    public boolean isAlive = false;
    public String type;
    public static int count;

    static Timestamp tstarve = new Timestamp(2000);
    static Timestamp tfull = new Timestamp(5000);

    public static void setTstarve(Timestamp tstarve) {
        Cell.tstarve = tstarve;
    }

    public static void setTfull(Timestamp tfull){
        Cell.tfull = tfull;
    }

    public Cell(int x, int y){
        this.x = x;
        this.y =y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Cell(int x, int y, String type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public boolean isAlive(){
        return isAlive = true;
    }

    public boolean Dead(boolean isAlive){
        this.isAlive = isAlive;
        return false;
    }

    public int increase_food(){
        if(Dead(isAlive) == false)
            return Food.food = (int) (Food.food + (random()*((5-1)+1))+1);
        return Food.food;
    }

    public void hungry(){
        Dead(false);
        increase_food();
    }

    Random random = new Random();

    public void isFeed(){
        Food.food = Food.food - 1;
        Cell.count = Cell.count + 1;
        System.out.println(Cell.count);
        if(Cell.count == 10){
            count = 0;
            Cell cell = new Cell(random.nextInt(100),random.nextInt(100));
            System.out.println("Coordonate X" + cell.getX());
            System.out.println("Coordonate Y" + cell.getY());
        }
        emptyFood();
    }

    public boolean emptyFood(){
        if(Food.food == 0){
            System.out.println("Empty Food");
            return false;
        }
        return true;
    }
}