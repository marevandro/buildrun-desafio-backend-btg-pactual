package tech.buildrun.btgpactual.orderms.entity;

import java.math.BigDecimal;

public class OrderItem {

    private String product;
    private Integer quantity;
    private BigDecimal proce;

    public OrderItem(){

    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getProce() {
        return proce;
    }

    public void setProce(BigDecimal proce) {
        this.proce = proce;
    }
}
