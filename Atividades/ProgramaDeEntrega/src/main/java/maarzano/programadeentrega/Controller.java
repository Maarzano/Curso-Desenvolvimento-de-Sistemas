package maarzano.programadeentrega;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import maarzano.programadeentrega.Models.Order;
import maarzano.programadeentrega.Models.OrderService;

public class Controller {
    @FXML
    private TextField orderIdField;

    @FXML
    private Label statusLabel;

    private OrderService orderService = new OrderService();

    @FXML
    protected void onSearchButtonClick() {
        String orderId = orderIdField.getText();
        Order order = orderService.findOrderById(orderId);
        if (order != null) {
            statusLabel.setText("Status: " + order.getStatus().getDescription());
        } else {
            statusLabel.setText("Pedido não encontrado.");
        }
    }
}