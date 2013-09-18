package org.balote.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class ProductJsonService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public ProductModel getProductInJson() {

		ProductModel pm = new ProductModel();
		pm.setName("phone");
		pm.setQuantity(100);

		return pm;
	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductModelInJson(ProductModel pm) {

		String result = "Product created : " + pm;
		return Response.status(201).entity(result).build();
	}

}
