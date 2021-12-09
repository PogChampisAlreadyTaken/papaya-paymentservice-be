package de.PogChampIsAlreadyTaken.Papaya.Webshop;

import javax.inject.Inject;
import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/payments")
public class PaymentService {

    @Inject
    EntityManager em;


    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPaymentById(@PathParam("id") Long id) {

        Payment payment = em.find(Payment.class, id);
        if(payment == null) {
            return Response.status(404).build();
        }
        return Response.ok().entity(payment).build();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postPayment(Payment payment) {
        Payment cus = createPayment(payment.getCustomerId(), payment.getDescription(), payment.getAmount());
        System.out.println(cus);
        return Response.ok().entity(cus).build();
    }

    @Transactional
    public Payment createPayment(int customerId, String description, double amount) {
        Payment payment = new Payment();
        payment.setAmount(amount);
        payment.setCustomerId(customerId);
        payment.setDescription(description);
        em.persist(payment);
        return payment;
    }
}