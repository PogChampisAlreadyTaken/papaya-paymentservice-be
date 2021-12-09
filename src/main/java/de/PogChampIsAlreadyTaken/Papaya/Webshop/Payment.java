package de.PogChampIsAlreadyTaken.Papaya.Webshop;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    private Long id;

    @NotNull(message = "customer id is mandatory")
    @Column(name = "payment_customer_id")
    private int customerId;
    @NotNull(message = "amount id is mandatory")
    @Column(name = "payment_amount")
    private double amount;
    @Column(name = "payment_description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
