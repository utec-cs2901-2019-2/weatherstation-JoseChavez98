package cs2901.utec.edu.pe;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver();
    void notifyObservers();
    void measurementsChanged() throws InterruptedException;
}
