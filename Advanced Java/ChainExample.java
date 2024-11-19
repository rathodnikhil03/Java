// Abstract Handler
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}

// Concrete Handlers
class SupportExecutive extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equals("basic")) {
            System.out.println("Support Executive handled the request.");
        } else {
            if (nextHandler != null) nextHandler.handleRequest(request);
        }
    }
}

class Supervisor extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equals("moderate")) {
            System.out.println("Supervisor handled the request.");
        } else {
            if (nextHandler != null) nextHandler.handleRequest(request);
        }
    }
}

class Manager extends SupportHandler {
    public void handleRequest(String request) {
        if (request.equals("complex")) {
            System.out.println("Manager handled the request.");
        } else {
            System.out.println("No one could handle the request.");
        }
    }
}

// Main Class
public class ChainExample {
    public static void main(String[] args) {
        SupportHandler executive = new SupportExecutive();
        SupportHandler supervisor = new Supervisor();
        SupportHandler manager = new Manager();

        executive.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        System.out.println("Request: basic");
        executive.handleRequest("basic");

        System.out.println("Request: moderate");
        executive.handleRequest("moderate");

        System.out.println("Request: complex");
        executive.handleRequest("complex");

        System.out.println("Request: unknown");
        executive.handleRequest("unknown");
    }
}
