package domain;

import domain.assistant.Assistant;
import domain.assistant.AssistantMemoryInMemory;
import domain.user.RegisterUserUseCase;
import java.util.HashMap;
import java.util.Map;

public class InjectionContainer {

    private Map<Class<?>, Object> containerMap = new HashMap<>();

    public InjectionContainer() {
        AssistantMemoryInMemory memory = new AssistantMemoryInMemory();
        RegisterUserUseCase registerUserUseCase = new RegisterUserUseCase(memory);
        Assistant assistant = new Assistant(memory, registerUserUseCase);

        containerMap.put(Assistant.class, assistant);
        containerMap.put(RegisterUserUseCase.class, registerUserUseCase);
        containerMap.put(AssistantMemoryInMemory.class, memory);
    }

    public <T> T get(Class<T> type) {
        return type.cast(containerMap.get(type));
    }
}
