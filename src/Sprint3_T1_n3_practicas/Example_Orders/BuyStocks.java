package Sprint3_T1_n3_practicas.Example_Orders;

public class BuyStocks implements Order {

	private Stock stock;

	public BuyStocks(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void execute() {
		stock.buy();
	}

}
