package ru.n5g.simplermi.server;

import org.springframework.remoting.rmi.RmiServiceExporter;

import java.rmi.RemoteException;

public class RmiServer
{
    public static void main(String[] args) throws RemoteException
    {
        RmiMessageImpl rmiMessage = new RmiMessageImpl();

        RmiServiceExporter server = new RmiServiceExporter();
        server.setServiceName("RmiMessage");
        server.setService(rmiMessage);
        server.setServiceInterface(RmiMessage.class);
        server.setRegistryPort(1199);
        server.afterPropertiesSet();
    }
}
