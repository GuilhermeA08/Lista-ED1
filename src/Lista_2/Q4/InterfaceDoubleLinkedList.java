package Lista_2.Q4;

public interface InterfaceDoubleLinkedList<T> {
  public T getFirst();

  public T getLast();

  public T removeFirst();

  public T removeLast();

  public void addFirst(T element);

  public void addLast(T element);
}
