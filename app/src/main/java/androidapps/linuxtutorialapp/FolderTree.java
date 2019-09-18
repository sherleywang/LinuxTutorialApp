package androidapps.linuxtutorialapp;

import java.util.HashMap;

// folder directory class
public class FolderTree {

    private Node<String> root;
    private Node<String> flag;
    private String response;

    public FolderTree(Node<String> root) {
        this.root = root;
        flag = this.root;
        response = "";
    }

    public boolean add(Node<String> parent, Node<String> child) {
        if (parent != null) {
            parent.addChild(child);
            return true;
        }
        return false;
    }

    public boolean remove(Node<String> parent, int child) {
        if (parent != null) {
            parent.deleteChild(child);
            return true;
        }
        return false;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public void setFlag(Node<String> current) {
        flag = current;
    }

    public Node<String> getFlag() {
        return flag;
    }

    public void printTree() {
        printTreeHelper(root, 0);
    }

    private void printTreeHelper(Node<String> current, int tabs) {
        if (current != null) {
            StringBuilder structure = new StringBuilder();
            for (int tab = 0; tab < tabs; tab++)
                structure.append("\t");
            structure.append(current.getInfo());
            structure.append("\n");
            System.out.println(structure.toString());
            HashMap<String, Node<String>> children = current.getChildren();
            for (String child : children.keySet()) {
                Node<String> kid = children.get(child);
                printTreeHelper(kid, tabs + 1);
            }
        }
    }

    // tree node class to support the folder directory implementation
    private static class Node<E> {

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

}
