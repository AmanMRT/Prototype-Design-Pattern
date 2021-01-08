package PrototypeDesign;

public class Book 
{
	private int bid;
	private String Bname;
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", Bname=" + Bname + "]";
	}
	
}
