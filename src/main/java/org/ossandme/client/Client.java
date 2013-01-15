package org.ossandme.client;

import org.apache.hello_world_soap_zmq.Greeter;
import org.apache.hello_world_soap_zmq.SOAPService;

public final class Client {

    public static void doOperation() throws Exception {

        // Create client
        SOAPService service = new SOAPService(Client.class.getResource("/hello_world.wsdl").toURI().toURL());
        Greeter port = service.getSoapPort();

        // Send request
        String reply = port.sayHi();

        System.out.print("REPLY RECEIVED FROM SERVER: '" + reply + "'\n");
    }

}
