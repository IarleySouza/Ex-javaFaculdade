package org.listaLSESlide06;

public class SLinkedList {
    protected Node head; // nodo cabeça da lista

    protected Node tail; // nodo cabeça da lista

    protected long size; // número de nodos da lista


    public SLinkedList() {
        head = tail = null;
        size = 0;

    }

    public void addHead(String element) {
        Node newNode = new Node(element, head);
        head = newNode;
        if (size == 0) {
            tail = newNode; // Se a lista estava vazia, o novo nó também é a cauda
        }
        size++;
    }

    public void addTail(String element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            head = newNode; // Se a lista estava vazia, o novo nó é a cabeça
            tail = newNode; // E também é a cauda
        } else {
            tail.setNext(newNode); // Aponta o atual último nó para o novo nó
            tail = newNode; // Agora, o novo nó é a cauda
        }
        size++;
    }

    public void removeFirst() {
        if (size == 0) {
            throw new EmptySLinkedList("Lista está vazia!"); // Lança exceção se a lista estiver vazia
        }
        head = head.getNext(); // O próximo nó da cabeça se torna a nova cabeça
        size--;
        if (size == 0) {
            tail = null; // Se a lista ficar vazia, a cauda também é nula
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
