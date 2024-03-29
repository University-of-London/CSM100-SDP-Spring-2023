package demo;

public class DefaultCommunicator implements Communicator {

    @Inject
    @Named("SMSComms")
    CommunicationMode smsCommsMode;
    @Inject
    @Named("EmailComms")
    CommunicationMode emailCommsMode;
    @Inject
    @Named("IMComms")
    CommunicationMode imCommsMode;
    private CommunicationMode defaultCommsMode;

    protected DefaultCommunicator(CommunicationMode defaultComms) {
        this.defaultCommsMode = defaultComms;
    }

    public DefaultCommunicator() {

    }

    public boolean sendMessage(String message) {
        boolean sent = false;
        if (defaultCommsMode != null) {
            sent = sendMessageByDefault(message);
        } else {
            sent = smsCommsMode.sendMessage(message);
        }
        return sent;
    }

    private boolean sendMessageByDefault(String message) {
        boolean sent = false;
        if (message != null && !message.trim().equals("")) {
            return defaultCommsMode.sendMessage(message);
        }
        return sent;
    }

}