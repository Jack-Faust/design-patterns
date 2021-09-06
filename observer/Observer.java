package observer;

/**
 * interface subject to require Book activities
 * @author Ronald Faust
 */
public interface Observer {
    public void update(Book book);
    public void display();
}
