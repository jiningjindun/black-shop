/*
 * 
 * LegendShop微服务商城系统
 * 
 * ©版权所有,并保留所有权利。
 * 
 */

package cn.blackshop.service.user.basic.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;

import cn.blackshop.basic.apollo.config.DataSourceConfig;
import cn.blackshop.common.basic.constants.ApolloNamespaceConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 加载apllo数据源
 * @author zibin
 *
 */
@Configuration
@Data
@EqualsAndHashCode(callSuper=false)
@EnableApolloConfig(ApolloNamespaceConstant.DEFAULT)
public class UserDataSourceConfig extends DataSourceConfig{

	/** The url. */
	@Value("${spring.datasource.url}")
    private String url;

    /** The user name. */
    @Value("${spring.datasource.username}")
    private String userName;

    /** The pass word. */
    @Value("${spring.datasource.password}")
    private String passWord;
}
