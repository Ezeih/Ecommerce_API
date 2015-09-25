package se.sleepdev.ecommerce.jaxrs.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import se.sleepdev.ecommerce.EcommerceManager;
import se.sleepdev.ecommerce.model.User;
import se.sleepdev.ecommerce.service.ProductRepository;
import se.sleepdev.ecommerce.service.RepositryException;
import se.sleepdev.ecommerce.service.UserRepository;

@Path("user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public final class UserDemoService {
	
	UserRepository users = new UserRepository();
	ProductRepository products = new ProductRepository();
	EcommerceManager man = new EcommerceManager(products, users);

	@GET
	@Path("{userId}")
	public Response getUser(@PathParam("userId") final int userId) throws RepositryException 
	{
		final User user = man.getUser(userId);
		return Response.ok(user).build();

	}

}



