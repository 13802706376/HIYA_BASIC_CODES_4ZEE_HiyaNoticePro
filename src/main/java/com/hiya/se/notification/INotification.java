package com.hiya.se.notification;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

public interface INotification
{
    void send(String msg) throws HttpException, IOException;
}
