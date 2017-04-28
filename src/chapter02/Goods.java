package chapter02;
public class Goods {
	static int cointOfGoods;
	
	private String name;
	private int price;
	private int countStock;
	private int countSold;
	
	public Goods() {
//		Goods.cointOfGoods = Goods.cointOfGoods + 1;
		cointOfGoods = cointOfGoods + 1;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		if (countSold < 0) {
			countSold = 0;
		}
		this.countSold = countSold;
	}
	
	public static int getCointOfGoods() {
		return cointOfGoods;
	}

	public static void setCointOfGoods(int cointOfGoods) {
		Goods.cointOfGoods = cointOfGoods;
	}

	public int calcDiscountPrice(int percentage) {
		int discountPrice = price - price * percentage / 100;
		return discountPrice;
	}
	
	public void printInfo(){
		System.out.println("이름 : " + name + 
		 		   ", 가격 : " + price +
		 		   ", 재고량 : " + countStock +
		 		   ", 판매량 : " + countSold);
	}
}
