package org.ossandme;

import org.ossandme.client.Client;
import org.ossandme.server.Server;

public class Main {

    public static void main(String args[]) throws Exception {
        Server.start();
        Client.doOperation();
        System.exit(0);
    }

}
