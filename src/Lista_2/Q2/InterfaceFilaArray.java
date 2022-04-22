package Lista_2.Q2;

public interface InterfaceFilaArray<T> {
  boolean add(T object) throws MyException;
  T remove() throws MyException;

  /**
   * Peek método
   * @return T object - Retorna o primeiro da fila sem excluir
   */
  T peek();
}
