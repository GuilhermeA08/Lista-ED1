package Lista_2.Q2;

public class FilaArray<T> implements InterfaceFilaArray<T> {

  private int first;
  private int last;
  private int size;
  private Object[] objects;

  public FilaArray(int size) {
    this.first = -1;
    this.last = -1;
    this.size = size;
    this.objects = new Object[size];
  }

  @Override
  public boolean add(T object) throws MyException {
    System.out.println("Adicionando...");

    int lastTemp = (this.last + 1) % this.size;

    if (lastTemp != this.first) {
      this.objects[lastTemp] = object;
      this.last = lastTemp;
      System.out.println("Adicionado a fila");
    } else {
      throw new MyException("\nERRO: fila cheia[" + object + "]!!!\n");
    }

    if (this.first == -1) {
      this.first++;
    }
    return true;
  }

  @Override
  @SuppressWarnings("unchecked")
  public T remove() throws MyException {
    System.out.println("Removendo");
    if (this.first == -1) {
      throw new MyException("\nERRO: fila Vazia!!!\n");
    }
    T object = (T) this.objects[this.first];

    if (this.first == this.last) {
      this.first = -1;
      this.last = -1;
    } else {
      this.first = (this.first + 1) % this.size;
    }
    return object;
  }

  @Override
  @SuppressWarnings("unchecked")
  public T peek() {
    if (this.first == -1) {
      throw new MyException("\nERRO: fila Vazia!!!\n");
    }
    return (T) this.objects[this.first];
  }
}
