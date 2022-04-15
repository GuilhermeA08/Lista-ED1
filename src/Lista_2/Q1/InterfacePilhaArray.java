package Lista_2.Q1;

public interface InterfacePilhaArray<T> {
  void push(T number) throws MyException; // empilhar
  T pop() throws MyException; // desempilhar

  T peek() throws MyException; // consultar (topo)

  boolean isEmpty();
  boolean isFull();
  int search(T object);
}
