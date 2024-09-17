import domain.InjectionContainer;
import domain.assistant.Assistant;
import domain.assistant.AssistantMemoryInMemory;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

       InjectionContainer injectionContainer = new InjectionContainer();

       Assistant assistant = injectionContainer.get(Assistant.class);

       assistant.hello();


    }
}