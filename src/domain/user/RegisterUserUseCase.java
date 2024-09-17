package domain.user;

import domain.assistant.IAssistantMemory;

import domain.user.factory.ClientFactory;

public class RegisterUserUseCase {

    private final IAssistantMemory assistantMemory;

    public RegisterUserUseCase(IAssistantMemory memory){
        this.assistantMemory = memory;
    }

    public void execute(String username, String email, int age) {
        Client newClient = ClientFactory.withUserNameAndEmail(username,email,age);
        this.assistantMemory.register(newClient);

    }

}
