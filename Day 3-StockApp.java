package ll;

public class StockApp {
	public static void main(String[] args) 
	{	
		String name;
		int price;
		
		// display the price .
		Stock a=new Stock("Infosys", 1300);
		Stock b=new Stock("HP", 1400);
		Stock c=new Stock("Apple", 1800);
		
	/*	a.setStockName("Infosys");
		a.setStockPrice(1300);
		*/
		
		name=a.getStockName();
		price=a.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=b.getStockName();
		price=b.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=c.getStockName();
		price=c.getStockPrice();
		System.out.println(name+"\t"+price);
		
		// call price change method 
		//true for increase, false for decrease
		a.changePrice(10, false);
		b.changePrice(12, true);
		c.changePrice(15, true);
		
		// display the stock details again
		name=a.getStockName();
		price=a.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=b.getStockName();
		price=b.getStockPrice();
		System.out.println(name+"\t"+price);
		
		name=c.getStockName();
		price=c.getStockPrice();
		System.out.println(name+"\t"+price);
		
	}

}

