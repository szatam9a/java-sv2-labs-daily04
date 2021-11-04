package day03;

import java.util.Arrays;
import java.util.List;

public class Stock {
    public List<Double> stockPrice;

    private Stock(List<Double> stockPrice) {
        this.stockPrice = stockPrice;
    }

    public double maxProfit(){
        double profit= 0;
        for (int i = 1; i < stockPrice.size(); i++) {
            if (stockPrice.get(i-1)<stockPrice.get(i))
            {profit += stockPrice.get(i)-stockPrice.get(i-1);}
        }
    return  profit;}

    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23,4.35,0.23,4.0,8.4));
        System.out.println(stock.maxProfit());  //8.17

        Stock stock2 = new Stock(Arrays.asList(12.0,2.0,8.0,4.0));
        System.out.println(stock2.maxProfit()); //6.0
    }
}
