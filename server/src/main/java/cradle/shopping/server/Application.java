package cradle.shopping.server;
import cradle.shopping.server.mybatis.dao.OrdersDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    private final OrdersDao ordersDao;
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    public Application(OrdersDao ordersDao) {
        this.ordersDao = ordersDao;
    }
}
