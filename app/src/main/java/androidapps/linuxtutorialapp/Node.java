package androidapps.linuxtutorialapp;

import java.util.TreeMap;

// tree node class to support the folder directory implementation
public class Node<String> {

    private String name;
    private Node<String> parent;
    private TreeMap<String, Node<String>> children;

    public Node(String name) {
        this.name = name;
        children = new TreeMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node<String> getParent() {
        return parent;
    }

    public void setParent(Node<String> parent) {
        this.parent = parent;
    }

    public TreeMap<String, Node<String>> getChildren() {
        return children;
    }

    public boolean addChild(String name) {
        if (!children.containsKey(name)) {
            Node<String> child = new Node<>(name);
            children.put(name, child);
            return true;
        }
        return false;
    }

    public boolean deleteChild(String name) {
        if (children.containsKey(name)) {
            children.remove(name);
            return true;
        }
        return false;
    }
}
