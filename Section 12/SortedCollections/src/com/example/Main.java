package com.example;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread",0.86,100);
        stockList.addStock(temp);
        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);

        temp = new StockItem("car",12.10,2);
        stockList.addStock(temp);

        temp = new StockItem("chair",62.0,200);
        stockList.addStock(temp);

        temp = new StockItem("cup",0.50,200);
        stockList.addStock(temp);
        temp = new StockItem("cup",0.45,7);
        stockList.addStock(temp);

        temp = new StockItem("door",72.95,4);
        stockList.addStock(temp);

        temp = new StockItem("juice",2.50,40);
        stockList.addStock(temp);

        temp = new StockItem("phone",96.99,30);
        stockList.addStock(temp);

        temp = new StockItem("towel",2.40,70);
        stockList.addStock(temp);

        temp = new StockItem("vase",8.76,40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.items().keySet()){
            System.out.println(s);
        }

        Basket somsBasket = new Basket("Som");
        sellItem(somsBasket,"car",1);
        System.out.println(somsBasket);

        sellItem(somsBasket,"car",1);
        System.out.println(somsBasket);

        if( sellItem(somsBasket,"car",1) != 1){
            System.out.println("There are no more cars in stock");
        }

        sellItem(somsBasket,"spanner",5);
        System.out.println(somsBasket);

        sellItem(somsBasket,"juice",4);
        sellItem(somsBasket,"cup", 12);
        sellItem(somsBasket,"bread", 1);
        System.out.println(somsBasket);

        System.out.println(stockList);

/*        temp = new StockItem("pen", 1.12);
        stockList.items().put(temp.getName(),temp);*/

        stockList.items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);

        for(Map.Entry<String, Double> price: stockList.priceList().entrySet()){
            System.out.println(price.getKey() + " costs " + price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quanity){
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null){
            System.out.println("we don't sell "+item);
            return 0;
        }
        if(stockList.sellStock(item,quanity) != 0){
            basket.addtoBasket(stockItem,quanity);
            return quanity;
        }
        return 0;
    }
}
