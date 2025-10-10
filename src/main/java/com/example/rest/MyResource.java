package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello") // Il percorso base per questa risorsa
public class MyResource {
	
	@GET // Questo metodo risponde alle richieste GET
	//@Path("/aa")
	@Produces(MediaType.TEXT_PLAIN) // Questo metodo produce testo semplice
	public String getHello() {
		return "Ciao dal mio primo servizio RESTful con Jersey!";
	}

	@GET
	@Path("/json") // Un percorso secondario per questa risorsa
	@Produces(MediaType.APPLICATION_JSON)
	public String getHelloJson() {
		return "{\"message\": \"Ciao dal JSON di Jersey!\"}";
	}

}