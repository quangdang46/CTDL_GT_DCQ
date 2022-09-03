public class Test {
  public static void main(String[] args) {
    SortedLinkedList list = new SortedLinkedList();
    list.add(5);
    list.add(3);
    list.add(1);
    list.add(2);
    list.add(4);
    list.print();
    list.remove(3);
    System.out.println();
    list.print();
  }

}
