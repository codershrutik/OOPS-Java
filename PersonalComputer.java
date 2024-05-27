public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Motherboard motherboard;
    private Monior monitor;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputercase() {
        return ComputerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
