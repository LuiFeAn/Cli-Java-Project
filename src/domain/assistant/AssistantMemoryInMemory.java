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
    public void unregister(Client client) {
        this._clients.remove(client);
    }

    @Override
    public Client find(String email) {
       return this._clients.stream().filter( client -> client.getEmail().equals(email)).findFirst().orElse(null);
    }

}
