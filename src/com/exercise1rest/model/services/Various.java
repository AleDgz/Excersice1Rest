package com.exercise1rest.model.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/services")

public class Various {
	
	@GET
	@Path("/obligame")
     public String mensajito() 
     {	 
    	 return "Obligame Prrp!!";
     }
}
