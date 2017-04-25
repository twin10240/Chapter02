public class GoodsApp {
	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.name = "nikkon";
		goods.price = 200000;
		goods.countSold = 10;
		goods.countStock = 20;
		
		System.out.println("이름 : " + goods.name + 
				 		   ", 가격 : " + goods.price + 
				 		   ", 판매량 : " + goods.countSold + 
				 		   ", 재고량 : " + goods.countStock);
		
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		System.out.println(goods.cointOfGoods);
		
		double i = 3 * Math.PI;

		int a = 10; // 변수
		a = 20;
		
		final int B = 20; // 상수(값 대입이 여기가 끝!)
		// B = 20;
	}

}
