package factory;

import bean.BeanDefinition;

public interface ApplicationContext {

	Object getBean(String beanName);
	
	void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
