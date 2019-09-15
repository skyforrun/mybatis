package bat.ke.qq.com;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 源码学院-Monkey
 * 只为培养BAT程序员而生
 * http://bat.ke.qq.com
 * 往期视频加群:516212256 暗号:6
 */
@Slf4j
public class MybatisTest {

   public static void main(String[] args) throws IOException {
     InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
     SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(inputStream);
     SqlSession session = sqlSessionFactory.openSession();
     try {
       User user = session.selectOne("bat.ke.qq.com.mybatis.mapper.UserMapper.selectUser", 1);
       log.info("user:{}",user);
     } finally {
       session.close();
     }
   }
}
