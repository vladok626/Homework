package homework8_6;

public class Node {
    protected int value;
    protected Node next;
    protected Node head;

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node() {
    }

    protected void createHead(int[] values) { //– ввод с головы createHead();
        Node head = new Node(values[0], null);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
        this.head = head;
        System.out.println("Формирование односвязного списка от головы:");
    }

    protected void createTail(int[] values) {//– ввод с хвоста createTail();
        Node head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
        this.head = head;
        System.out.println("Формирование односвязного списка от хвоста:");
    }

    public String toString() {// вывод (возвращается строка, сформированная из элементов списка) toString();
        Node ref = head;
        System.out.println("Печать односвязного списка:");
        String toString = "";
        while (ref != null) {
            toString += " " + ref.value;
            ref = ref.next;
        }
        return toString;
    }

    protected void AddFirst(int head) {//добавление элемента в начало списка AddFirst();
        this.head = new Node(head, this.head);
        System.out.println("Добавление элемента в начало списка:");
    }

    protected void AddLast(int tail) {//добавление элемента в конец списка AddLast();
        Node newTail = new Node(tail, null);
        Node ref = this.head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
        System.out.println("Добавление элемента в конец списка:");
    }

    protected void Insert(int middle, int queue) {//– вставка элемента в список с указанным номером Insert();
        Node newNode = new Node(middle, null);
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        System.out.println("Добавление элемента за № " + queue + " списка:");
    }

    protected void RemoveFirst() {//– удаление элемента с головы списка RemoveFirst();
        this.head = this.head.next;
        System.out.println("Удаление элемента из головы списка:");
    }

    protected void RemoveLast() {// – удаление последнего элемента списка RemoveLast();
        Node ref = this.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        System.out.println("Удаление элемента из хвоста списка:");
    }

    protected void Remove(int queue) {//– удаление из списка элемента с указанным номером Remove();
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        System.out.println("Удаление элемента под № " + queue + " списка:");
    }

    //с использованием рекурсии:
    Node createHeadRec(int value) { // – ввод с головы createHeadRec();
        if (value == 0) {
            System.out.println("Формирование односвязного списка от головы с помощью рекурсии:");
            return null;
        }
        return this.head = new Node(value, createHeadRec(value-1));
    }
    int createTailRec(int value){ // – ввод с хвоста createTailRec();
        if (value ==0) {
            System.out.println("Формирование односвязного списка от хвоста с помощью рекурсии:");
            Node head = null;
            this.head = head;
            return 0;
        }
        head = new Node(createTailRec(value - 1), head);
        return value;
    }

    public String toStringRec(Node head) {// вывод (возвращается строка, сформированная из элементов списка) toString();
        if (head == null) {
            return " Печать односвязного списка c помощью рекурсии:";
        }
        return head.getValue()+" "+toStringRec(head.getNext());
    }

}
