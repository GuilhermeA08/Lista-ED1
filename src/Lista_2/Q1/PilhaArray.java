package Lista_2.Q1;

public class PilhaArray<T> implements InterfacePilhaArray<T> {

  private int top;
  private int size;
  private Object[] objects;

  public PilhaArray(int size) {
    this.top = -1;
    this.size = size;
    this.objects = new Object[size];
  }

  public static void main(String[] args) {}

  @Override
  public void push(T object) throws MyException {
    if (!this.isFull()) {
      this.top++;
      objects[this.top] = object;
    } else {
      throw new MyException("\nERRO: pilha cheia [valor= " + object + "]!!!\n");
    }
  }

  @Override
  public T pop() throws MyException {
    Object object;
    if (!this.isEmpty()) {
      object = objects[this.top];
      this.top--;
      return (T) object;
    } else {
      throw new MyException("\nERRO: pilha vazia!!!\n");
    }
  }

  @Override
  public T peek() throws MyException {
    if (!this.isEmpty()) {
      return (T) objects[this.top];
    } else {
      throw new MyException("\nERRO: pilha vazia!!!\n");
    }
  }

  @Override
  public boolean isEmpty() {
    return (this.top == -1) ? true : false;
  }

  @Override
  public boolean isFull() {
    return (this.top == this.size - 1) ? true : false;
  }

  @Override
  public int search(T object) {
    for (int i = 0; i < this.objects.length; i++) {
      if (object.equals(objects[i])) {
        return (this.top - i) + 1;
      }
    }
    return 0;
  }
}
