package maarzano.programadeentrega.Models;

public enum OrderStatus {
    PENDING("Pendente"),
    PROCESSING("Em processo"),
    SHIPPED("Enviado"),
    DELIVERED("Entregue"),
    STOLLED("Roubaram em RJ"),
    TAXED("Taxado na Bahia");

    private String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}