package PrototypeDesign;

public class BookShopTester 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		BookShop bs  = new BookShop();
		bs.setShopname("R Lall Book Depot");
		bs.loadData();
		
		BookShop bs1 = bs.clone();	
		bs.getBook().remove(2);
		bs1.setShopname("Khurana Books");
		
		System.out.println(bs);
		System.out.println();
		System.out.println(bs1);
	}
}
