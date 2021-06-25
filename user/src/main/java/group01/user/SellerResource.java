package group01.user;

import java.util.Arrays;
import java.util.List;

import javax.websocket.server.PathParam;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("sellers")

public class SellerResource {
	
	SellerRepository repo = new SellerRepository();

//--------------------------------------------- Fetch All ------------------------------------------------------
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Seller> getSeller()
	{
		System.out.println("Get Seller Called");
		
		return repo.getSellers();
	}
	
	
//--------------------------------------------- Fetch By Id ------------------------------------------------------
	@GET
	@Path("seller/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Seller getSeller(@PathParam("id")int id)
	{
		
		return repo.getSeller(id);
	}	
	
//----------------------------------------------- Insert ------------------------------------------------------
	@POST
	@Path("seller")
	public Seller createSeller(Seller s1) {
		
		System.out.println(s1);
		repo.create(s1);
		
		return s1;
	}

}
