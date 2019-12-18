package androidapps.linuxtutorialapp;

import java.util.TreeMap;
import java.util.Date;

// tree node class to support the folder directory implementation
public class Node<String>  {

    private String name;
    private Node<String> parent;
    private TreeMap<String, Node<String>> children;

    // Node attributes
    private boolean isDirectory;
    private String permissions;
    private String userOwner;
    private String group;
    private int size;
    private Date lastModified;

    public Node(String name, Node<String> parent) {
        this.name = name;
        this.parent = parent;
        this.children = new TreeMap<>();
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public void makeDirectory() {
        isDirectory = true;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String newPermissions) {
        permissions = newPermissions;
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

    public String getOwner() {
        return userOwner;
    }

    public void setOwner(String newOwner) {
        userOwner = newOwner;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String newGroup) {
        group = newGroup;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int newSize) {
        size = newSize;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified() {
        lastModified = new Date();
    }

    public void setLastModified(Date newDate) {
        lastModified = newDate;
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