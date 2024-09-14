package domain.user.factory;

import domain.user.Client;
import domain.user.Email;
import domain.user.Username;

public class ClientFactory {

    public static Client withUserNameAndEmail(String username, String email, int age){
        Username name = new Username(username);
        Email _email = new Email(email);
        return new Client(name,_email,age);
    }

}
