package cradle.shopping.server.mybatis.pojo;

import java.util.Date;

public class Orders {
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderGoodId() {
        return orderGoodId;
    }

    public void setOrderGoodId(String orderGoodId) {
        this.orderGoodId = orderGoodId;
    }

    public String getOrderCustomerId() {
        return orderCustomerId;
    }

    public void setOrderCustomerId(String orderCustomerId) {
        this.orderCustomerId = orderCustomerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    String orderId;
    String orderGoodId;
    String orderCustomerId;
    Date orderDate;

}
