package androidapps.linuxtutorialapp;

import java.util.TreeMap;

// tree node class to support the folder directory implementation
public class Node<String>  {

    private String name;
    private Node<String> parent;
    private TreeMap<String, Node<String>> children;

    // Node attributes
    private boolean isDirectory;
    private String userOwner;
    private int lastModified;

    public Node(String name, Node<String> parent) {
        this.name = name;
        this.parent = parent;
        this.children = new TreeMap<>();
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

    public boolean isDirectory() {
        return isDirectory;
    }

    public void makeDirectory() {
        isDirectory = true;
    }

    public String getOwner() {
        return userOwner;
    }

    public void setOwner(String owner) {
        userOwner = owner;
    }

    public TreeMap<String, Node<String>> getChildren() {
        return children;
    }

    public boolean addChild(String name, Node<String> parent) {
        if (!children.containsKey(name)) {
            Node<String> child = new Node<>(name, parent);
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