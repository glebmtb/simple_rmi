package ru.n5g.simplermi.server;

public class RmiMessageImpl implements RmiMessage
{
    @Override
    public String getMessage()
    {
        return "Hello world";
    }
}
