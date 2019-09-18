package androidapps.linuxtutorialapp;

import java.util.TreeMap;

// tree node class to support the folder directory implementation
public class Node<E> {

    private E info;
    private Node<E> parent;
    private TreeMap<E, Node<E>> children;

    public Node(E value) {
        info = value;
        children = new TreeMap<>();
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

    public TreeMap<E, Node<E>> getChildren() {
        return children;
    }

    public boolean addChild(Node<E> child) {
        E name = child.getInfo();
        return !children.containsKey(name) && children.put(name, child) == null;
    }

    public boolean deleteChild(Node<E> child) {
        E name = child.getInfo();
        return children.remove(name) == null;
    }
}
