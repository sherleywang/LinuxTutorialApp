package androidapps.linuxtutorialapp;

import java.util.HashMap;

// tree node class to support the folder directory implementation
public class Node<E> {

    private E info;
    private Node<E> parent;
    private HashMap<E, Node<E>> children;

    public Node(E value) {
        info = value;
        children = new HashMap<>();
    }

    public E getInfo() {
        return info;
    }

    public void setInfo(E value) {
        info = value;
    }

    public Node<E> getParent() {
        return parent;
    }

    public void setParent(Node<E> parent) {
        this.parent = parent;
    }

    public HashMap<E, Node<E>> getChildren() {
        return children;
    }

    public void addChild(Node<E> child) {
        children.put(child.info, child);
    }

    public void deleteChild(int child) {
        if (child >= children.size() || child < 0)
            throw new IllegalArgumentException("Index is out of bounds.");
        children.remove(child);
    }
}
