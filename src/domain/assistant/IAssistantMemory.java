package domain.assistant;

import domain.user.Client;

public interface IAssistantMemory {
    public void register(Client client);
    public void unregister(Client client);
    public Client find(String email);
}
