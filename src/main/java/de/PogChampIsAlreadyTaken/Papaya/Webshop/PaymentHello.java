package de.PogChampIsAlreadyTaken.Papaya.Webshop;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class PaymentHello {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        String hello = "Hello Paymentservice, °w°";

        Jsonb jsonb = JsonbBuilder.create();

        return jsonb.toJson(hello);
    }
}