package cradle.shopping.server.mybatis.mapper;

import cradle.shopping.server.mybatis.pojo.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface OrderMapper {
    @Insert("insert into shop.order(order_id, order_good_id, order_customer_id) " +
            "values(#{orderId},#{orderGoodId},#{orderCustomerId}) ")
    @Options(useGeneratedKeys = true, keyProperty = "order_id")
    boolean createOrder(Orders order);

    @Insert("select * from shop.order")
    Orders queryOrder();
}
