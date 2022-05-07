package Lista_2.Q3;

public interface InterfaceLinkedList<E> {
  public E getFirst();

  public E getLast();

  public E removeFirst();

  public E removeLast();

  public void addFirst(E e);

  public void addLast(E e);
}
