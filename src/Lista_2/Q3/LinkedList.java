package Lista_2.Q3;

public class LinkedList<E> implements InterfaceLinkedList<E> {

  class Node {

    // Atributos de Node
    E data;
    Node next;

    // Construtor de Node
    public Node(E data) {
      this.data = data;
      this.next = null;
    }
  }

  private Node first;
  private Node last;
  public int size;

  LinkedList() {
    first = null;
    last = null;
    size = 0;
  }

  @Override
  public E getFirst() {
    if (first == null) {
      System.out.println("Lista Vazia!!!");
      return null;
    } else {
      return this.first.data;
    }
  }

  @Override
  public E getLast() {
    if (last == null) {
      System.out.println("Lista Vazia!!!");
      return null;
    } else {
      return this.last.data;
    }
  }

  @Override
  public E removeFirst() {
    Node temp = first;

    if (first == null) {
      System.out.println("Lista Vazia!!!");
      return null;
    } else {
      if (first == last) {
        System.out.println("Removendo elemento único!");
        first = null;
        last = null;
      } else {
        first = first.next;
      }
      temp.next = null;
      size--;
      return temp.data;
    }
  }

  @Override
  public E removeLast() {
    Node temp = last;

    if (last == null) {
      System.out.println("Lista vazia!!!");
      return null;
    } else {
      if (first == last) {
        first = null;
        last = null;
      } else {
        Node search = first;
        while (search.next != last) {
          search = search.next;
        }
        last = search;
        last.next = null;
      }
      size--;
      return temp.data;
    }
  }

  @Override
  public void addFirst(E e) {
    Node temp = new Node(e);

    if (first == null) {
      first = temp;
      last = temp;
    } else {
      temp.next = first;
      first = temp;
    }
    size++;
  }

  @Override
  public void addLast(E e) {
    Node temp = new Node(e);

    if (last == null) {
      first = temp;
      last = temp;
    } else {
      last.next = temp;
      last = temp;
    }
    size++;
  }
}
