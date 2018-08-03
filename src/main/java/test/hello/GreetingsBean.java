package test.hello;

public class GreetingsBean {

    private final long id;
    private final String message;

    public GreetingsBean(long id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

}
