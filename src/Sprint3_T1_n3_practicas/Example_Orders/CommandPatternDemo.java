package Sprint3_T1_n3_practicas.Example_Orders;

public class CommandPatternDemo {

	public static void main(String[] args) {
	
		Stock stock1 = new Stock("Apple", 15);
		Stock stock2 = new Stock("Apple", 5);
		Stock stock3 = new Stock("Amazon", 100);
		Stock stock4 = new Stock("Apple", 3);
		Stock stock5 = new Stock("Apple", 200);
		Stock stock6 = new Stock("Apple", 15);
		
		BuyStocks buyStockOrder1 = new BuyStocks(stock1);
		SellStocks sellStocksOrder1 = new SellStocks(stock2);
		BuyStocks buyStockOrder2 = new BuyStocks(stock3);
		BuyStocks buyStockOrder3 = new BuyStocks(stock4);
		BuyStocks buyStockOrder4 = new BuyStocks(stock5);
		SellStocks sellStocksOrder2 = new SellStocks(stock6);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder1);
		broker.takeOrder(sellStocksOrder1);
		broker.takeOrder(buyStockOrder2);
		broker.takeOrder(buyStockOrder3);
		broker.takeOrder(buyStockOrder4);
		broker.takeOrder(sellStocksOrder2);
		
		broker.placeOrders();
	}

}
