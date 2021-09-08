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

import com.changhe.mybatis.po.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @InterfaceName PaymentDao
 * @Description TODO
 * @Author zhengchanghe
 * @Date 2021/9/7 15:27
 * @Version 1.0
 */
public interface PaymentMapper {
//  public int create(Payment payment);
  public Payment getPaymentById(@Param("id") Long id);
}
