package ru.n5g.simplermi.client;

import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import ru.n5g.simplermi.server.RmiMessage;

public class RmiClient
{
    public static void main(String[] args)
    {
        RmiProxyFactoryBean factoryBean = new RmiProxyFactoryBean();
        factoryBean.setServiceUrl("rmi://localhost:1199/RmiMessage");
        factoryBean.setServiceInterface(RmiMessage.class);
        factoryBean.afterPropertiesSet();
        RmiMessage rmiMessage = (RmiMessage)factoryBean.getObject();
        System.out.println(rmiMessage.getMessage());
    }
}