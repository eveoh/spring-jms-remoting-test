package nl.eveoh.test.springjmsremoting.server;

import nl.eveoh.test.springjmsremoting.CheckingAccountService;

public class SimpleCheckingAccountService implements CheckingAccountService {

    public void cancelAccount(Long accountId) {
        try {
            // Sleep longer than the receiveTimeout of the client, which is 1s.
            // This will make sure the destination temp-queue doesn't exist anymore.
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            // Don't care...
        }

        System.out.println("Cancelling account [" + accountId + "]");
    }

}
