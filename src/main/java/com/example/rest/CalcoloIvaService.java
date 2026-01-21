package com.example.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
// servizio di prova JAX rs   sdfsd
@Path("/iva")
public class CalcoloIvaService {

    // Classe di input
    public static class Articolo {
        public String articolo;
        public double prezzo;
    }

    // Classe di output
    public static class Risultato {
        public String articolo;
        public double prezzoIvato;
    }

   // @Path("/iva")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response calcolaIva(Articolo input) {
        double prezzoIvato = input.prezzo * 1.25;

        Risultato result = new Risultato();
        result.articolo = input.articolo;
        result.prezzoIvato = Math.round(prezzoIvato * 100.0) / 100.0;

        return Response.ok(result).build();
    }
}