package domain.assistant;

import domain.user.Client;

public interface IAssistantMemory {
    void register(Client client);
    void unregister(Client client);
    Client find(String email);
}
