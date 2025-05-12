package org.listaLSESlide06;

public class Node {
    private String element; // assumimos: os elementos são

    private Node next;

    public Node(String s, Node n) { element = s; next = n; }

// Retorna o elemento deste nodo

    public String getElement() { return element; }

// Retorna o próximo elemento deste nodo

    public Node getNext() {return next; }

    public void setElement(String newElem) { element = newElem; }

// Define o próximo elemento deste nodo

    public void setNext(Node newNext) { next = newNext; }
}
