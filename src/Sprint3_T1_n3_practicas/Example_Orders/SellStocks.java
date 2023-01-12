package Sprint3_T1_n3_practicas.Example_Orders;

public class SellStocks implements Order {

	private Stock stock;
	
	public SellStocks(Stock stock) {
		super();
		this.stock = stock;
	}

	@Override
	public void execute() {
		stock.sell();
		
	}

}
