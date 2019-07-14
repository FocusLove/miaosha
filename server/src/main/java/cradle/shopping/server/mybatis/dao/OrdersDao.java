package cradle.shopping.server.mybatis.dao;

import cradle.shopping.server.mybatis.pojo.Orders;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrdersDao {

    private final SqlSession sqlSession;

    @Autowired
    public OrdersDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public void createOrder(Orders order) {

        this.sqlSession.insert("createOrder", order);
    }

}
