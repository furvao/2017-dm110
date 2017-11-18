package br.inatel.dm110.hello.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/inventory")
public interface InventoryService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> list();

	@POST
	@Path("/product/{name}")
	public void insert(@PathParam("name") String name);
}
