package domain.assistant;

import domain.user.Client;
import domain.user.Email;
import domain.user.Username;
import domain.user.factory.ClientFactory;

import java.util.Scanner;

public class Assistant {

    private IAssistantMemory assistantMemory;

    public Assistant(IAssistantMemory assistantMemory) {
        this.assistantMemory = assistantMemory;
    }

    public void hello(){

       try {
           System.out.println("Olá, bem-vindo(a) a loja TôEstudano. Por favor, insira seu E-mail");

           Scanner sc = new Scanner(System.in);

           String cliEmail = sc.nextLine();

           final Client client = this.assistantMemory.find(cliEmail);

           if(client == null){
               System.out.println("Opa! Vejo que você é novo por aqui. Agora, por gentileza, informe seu nome");

               String cliName = sc.nextLine();

               String confirmNameMessage = String.format("Perfeito! seu email é %s", cliEmail);

               System.out.println(confirmNameMessage);

               System.out.println("Agora informe sua idade");

               int cliAge = sc.nextInt();
               sc.nextLine();

               String lastConfirmMessage = String.format("Certo. %s de email %s e idade %d", cliEmail,cliName,cliAge);

               Client newClient = ClientFactory.withUserNameAndEmail(cliName,cliEmail,26);

               this.assistantMemory.register(newClient);


           }
       }catch(Exception e){
           System.out.println("Não foi possível registra-lo! Os parâmetros fornecidos são inválidos");
       }

    }

}
