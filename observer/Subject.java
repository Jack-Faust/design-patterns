package observer;

/**
 * interface subject to require observer activities
 * @author Ronald Faust
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Book book);
}
