package org.ossandme.server;

import javax.xml.ws.Endpoint;

public class Server {

    public static void start() throws Exception {
        Endpoint.publish("zmq:(tcp://127.0.0.1:9000?socketOperation=bind&socketType=rep)", new GreeterImpl());
        System.out.println("SERVER STARTED!!");
    }
}
