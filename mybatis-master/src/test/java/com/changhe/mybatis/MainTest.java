/*
 *    Copyright ${license.git.copyrightYears} the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.changhe.mybatis;

import com.changhe.mybatis.dao.PaymentMapper;
import com.changhe.mybatis.po.Payment;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author zhengchanghe
 * @Date 2021/9/7 15:29
 * @Version 1.0
 */
public class MainTest {

  public static void main(String[] args) {

    String config = "mybatis-config.xml";

    // 测试代码
    try (InputStream is = Resources.getResourceAsStream(config)) {
      SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
      SqlSession sqlSession = factory.openSession();
      PaymentMapper paymentMapper = sqlSession.getMapper(PaymentMapper.class);
      Payment payment = paymentMapper.getPaymentById(31L);
      System.out.println(payment);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
