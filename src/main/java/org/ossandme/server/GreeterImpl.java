package org.ossandme.server;

import org.apache.hello_world_soap_zmq.Greeter;

public class GreeterImpl implements Greeter {

    public String sayHi() {
        System.out.println("SERVER EXECUTING OPERATION sayHi...");
        return "Bonjour";
    }

}
