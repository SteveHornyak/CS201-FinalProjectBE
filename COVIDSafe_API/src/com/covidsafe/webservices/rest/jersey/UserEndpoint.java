package com.covidsafe.webservices.rest.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.covidsafe.webservices.objects.*;


@Path("/users")
public class UserEndpoint {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse createUser(CreateUser cu) {
		UserResponse res = new UserResponse();
			
		return res;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse signInUser(SignInUser user) {
		
		UserResponse res = new UserResponse();
		return res;
	}

	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse updateUser(UpdateUser user) {
		
		UserResponse res = new UserResponse();
		return res;
	}
}
