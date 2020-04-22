import service.HandlingService;
import service.MessageService;

public class Application {
    public static void main(String[] args) {
        HandlingService handlingService = new HandlingService();
        MessageService messageService = new MessageService();
        messageService.printResult(handlingService.getResultNumber());
    }
}
