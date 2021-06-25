package group01.user;

import java.util.ArrayList;
import java.util.List;

public class SellerRepository {

	List<Seller> sellers;
	
	public SellerRepository() {
		
		sellers = new ArrayList<Seller>();
		
		Seller s1 = new Seller();
		s1.setId(001);
		s1.setName("Eranga");
		s1.setAge(25);
		s1.setDob("25/04/1996");
		
		Seller s2 = new Seller();
		s2.setId(002);
		s2.setName("Sampath");
		s2.setAge(25);
		s2.setDob("05/05/1996");
		
		sellers.add(s1);
		sellers.add(s2);
	}
	
	public List<Seller> getSellers(){
		
		return sellers;
		
	}
	
	public Seller getSeller(int id) {
		
		for(Seller s : sellers) {
			if(s.getId()==id)
				return s;
		}
		
		return new Seller();
	}

	public void create(Seller s1) {
		// TODO Auto-generated method stub
		sellers.add(s1);
	}
	
}
