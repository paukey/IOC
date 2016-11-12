package test;

import resource.LocalFileResource;
import factory.ApplicationContext;
import factory.PathtoXmlApplicationContext;

public class test {

    public static void main(String[] args) {
    	     
    	LocalFileResource resource = new LocalFileResource("bean.xml");
        ApplicationContext ctx = 
		    new PathtoXmlApplicationContext(resource);
        
        boss boss = (boss) ctx.getBean("boss");
        System.out.println(boss.tostring());
    }
}

