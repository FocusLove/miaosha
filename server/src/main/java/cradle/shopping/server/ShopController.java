package cradle.shopping.server;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import cradle.shopping.server.mybatis.dao.OrdersDao;
import cradle.shopping.server.mybatis.pojo.Orders;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    private OrdersDao ordersDao;

    ShopController(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String order(HttpServletRequest request) {
        try {
            JSONObject body = JSONObject.parseObject(HttpRequest.parseBody(request));
            Orders order = JSON.parseObject(body.toJSONString(), Orders.class);

            ordersDao.createOrder(order);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}