
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response; 

@Path("/users")
public class UserEndpoint 
{	
	@POST 
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse signInUser(SignInUser u)
	{
		ResultSet rs = null;
		
		//Convert ResultSet into a User Response
		
		return new UserResponse();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserResponse createUser(User u)
	{
		
	}
	
}

