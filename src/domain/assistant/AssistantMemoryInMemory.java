package domain.assistant;

import domain.user.Client;

import java.util.ArrayList;

public class AssistantMemoryInMemory implements  IAssistantMemory {

    final private ArrayList<Client> _clients = new ArrayList<>();

    @Override
    public void register(Client client) {
        this._clients.add(client);
    }

    @Override
    public Client find(String email) {
        for(Client client : this._clients){
            if(client.getEmail().equals(email)){
                return client;
            }
        }
        return null;
    }

}
