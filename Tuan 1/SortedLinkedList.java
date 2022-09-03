public class SortedLinkedList {
  private Node head;
  private int size;

  public SortedLinkedList() {
    this.head = null;
    this.size = 0;
  }

  public int getSize() {
    return this.size;
  }

  public void add(Integer item) {
    Node newNode = new Node(item);
    if (head == null) {
      head = newNode;
      return;
    }
    Node curr = head;
    Node prev = null;
    while (curr != null && curr.getValue() < item) {
      prev = curr;
      curr = curr.getNext();
    }
    if (prev == null) {
      newNode.setNext(curr);
      head = newNode;
      return;
    }
    prev.setNext(newNode);
    newNode.setNext(curr);
    size++;
  }

  public void remove(int item) {
    if (head == null) {
      return;
    }
    Node curr = head;
    Node prev = null;
    while (curr != null && curr.getValue() != item) {
      prev = curr;
      curr = curr.getNext();
    }
    if (prev == null) {
      head = curr.getNext();
      curr.setNext(null);
      return;
    }
    if (curr == null) {
      return;
    }
    prev.setNext(curr.getNext());
    curr.setNext(null);
    size--;
  }

  public void print() {
    if (head == null) {
      return;
    }
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.getValue() + " ");
      temp = temp.getNext();
    }
  }
}
