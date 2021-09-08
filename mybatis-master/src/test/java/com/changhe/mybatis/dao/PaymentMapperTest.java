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
package com.changhe.mybatis.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;

/**
 * @ClassName PaymentMapperTest
 * @Description TODO
 * @Author zhengchanghe
 * @Date 2021/9/7 15:57
 * @Version 1.0
 */
public class PaymentMapperTest {
  private static PaymentMapper mapper;

  @BeforeClass
  public static void setUpMybatisDatabase() {
    SqlSessionFactory builder = new SqlSessionFactoryBuilder().build(PaymentMapperTest.class.getClassLoader().getResourceAsStream("mybatisTestConfiguration/PaymentMapperTestConfiguration.xml"));
    //you can use builder.openSession(false) to not commit to database
    mapper = builder.getConfiguration().getMapper(PaymentMapper.class, builder.openSession(true));
  }

  @Test
  public void testGetPaymentById() throws FileNotFoundException {
    mapper.getPaymentById(31L);
  }
}
