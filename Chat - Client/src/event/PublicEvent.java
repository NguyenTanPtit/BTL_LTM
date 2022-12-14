package event;

public class PublicEvent {

    private static PublicEvent instance;

    private EventLogin eventLogin;

    public void addEventLogin(EventLogin event) {
        this.eventLogin = event;
    }

    public EventLogin getEventLogin() {
        return eventLogin;
    }

    public static PublicEvent getInstance() {
        if (instance == null) {
            instance = new PublicEvent();
        }
        return instance;
    }

    private PublicEvent() {

    }
}
