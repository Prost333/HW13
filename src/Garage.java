public class Garage <T extends Vehicle>{
    T transport;
    public Garage(T transport){
        this.transport=transport;
    }

    public T getTransport() {
        return transport;
    }

    public void setTransport(T transport) {
        this.transport = transport;
    }
}
