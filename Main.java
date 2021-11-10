import java.util.Scanner;

import static java.lang.System.currentTimeMillis;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        Food.food = 1;
        out.println(Food.food);
        Cell cell = new Cell(10,10);
        cell.Dead(false);
        Cell cell1 = new Cell(11,12,"sex");
        cell.hungry();
        out.println(Food.food);
        cell.hungry();
        out.println(Food.food);
        cell.isFeed();
        out.println(Food.food);
        cell.isFeed();
        out.println(Food.food);
        cell.isFeed();
        out.println(Food.food);

    }
}