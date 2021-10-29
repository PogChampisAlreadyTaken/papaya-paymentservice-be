package de.PogChampIsAlreadyTaken.Papaya.Webshop;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Paymentservice {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Paymentservice uwu";
    }
}