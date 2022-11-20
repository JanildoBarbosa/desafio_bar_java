package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}else {
			return 4.0;
		}
	}
	
	public double feeding() {
		return beer * 5 + softDrink * 3 + barbecue * 7;
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		}else {
			return 10.00;
		}
	}
	
	public double total() {
		return cover() + feeding() + ticket();
	}
	
}
