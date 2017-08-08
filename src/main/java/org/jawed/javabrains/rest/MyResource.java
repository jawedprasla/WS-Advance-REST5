package org.jawed.javabrains.rest;

import java.util.Calendar;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MyResource {

	@GET
	@Produces(value = {MediaType.TEXT_PLAIN, "text/shortdate"} ) 
//	@Produces(MediaType.TEXT_PLAIN)  To use media type provided by Jersey
	 //To create new custom media type
	public Date testMethod(){
		return Calendar.getInstance().getTime();
	}
}
