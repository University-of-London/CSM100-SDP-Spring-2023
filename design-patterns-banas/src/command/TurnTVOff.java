package command;

public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice) {

        theDevice = newDevice;

    }

    @Override
    public void execute() {

        theDevice.off();

    }

    // Used if you want to allow for undo
    // Do the opposite of execute()
    @Override
    public void undo() {

        theDevice.on();

    }

}