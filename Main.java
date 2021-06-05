import recursive.Fibonaci;
import recursive.Name;
import recursive.Rank;
import recursive.Row;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("----- Perpangkatan 5^11 -----");
        Integer rankResult = Rank.makeRank(5, 0, 0, 11);
        System.out.println(rankResult);

        System.out.println("----- Fibonaci -----");
        ArrayList<Integer> fibonaciResults = Fibonaci.makeFibonaci(0,0, 0, 20, new ArrayList<>());
        System.out.println(fibonaciResults);

        System.out.println("----- Deret -----");
        ArrayList<Integer> rowResults = Row.makeRows(2, 1, 0, 50, new ArrayList<>());
        System.out.println(rowResults);

        System.out.println("----- Nama 100x -----");
        ArrayList<String> nameResults = Name.generateName("Salsabila Maulani", 0, 100, new ArrayList<>());
        System.out.println(nameResults);

    }
}