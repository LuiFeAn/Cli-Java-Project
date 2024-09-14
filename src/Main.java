import domain.assistant.Assistant;
import domain.assistant.AssistantMemoryInMemory;

public class Main {
    public static void main(String[] args) {

        AssistantMemoryInMemory assistantMemoryInMemory = new AssistantMemoryInMemory();

        Assistant assistant = new Assistant(assistantMemoryInMemory);

        assistant.hello();


    }
}