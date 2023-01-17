package Sprint3_T2_n3_Dependency_Injection;

public class ConvertPrice {

	// This class is "injected" with the object IRates
	// so it can use its method convert
	
	private IRates irate;

	public ConvertPrice(IRates irate) {
		this.irate = irate;
	}
	
	public void priceConverted() {
	
		Article art1 = new Article(2.5, "pizza");
		Article art2 = new Article(3.5, "cheesegurguer");
		Article art3 = new Article(2.0, "fries");
		
		System.out.println(art1.getName() + ": " + String.format("%.2f", art1.getPrice() * irate.convert()));
		System.out.println(art2.getName() + ": " + String.format("%.2f", art2.getPrice()* irate.convert()));
		System.out.println(art3.getName() + ": " + String.format("%.2f", art3.getPrice()* irate.convert()));		
		
	}
	
}
