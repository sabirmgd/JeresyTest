package com.sabir.testing;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import sabir.test.jms.dao.DatabaseService;
import sabir.test.jms.entity.Message;

@Produces(MediaType.APPLICATION_XML)
@Path("/message")
public class jersyTest {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String id) {
			
		
		Message msg = new Message();
		
		msg = DatabaseService.getMessage(id);
		//String output = "Jersey say : " + msg.toString();
		return Response.status(200).entity(msg).build();

	}

}