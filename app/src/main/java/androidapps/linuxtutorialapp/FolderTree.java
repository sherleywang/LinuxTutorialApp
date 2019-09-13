package androidapps.linuxtutorialapp;

import java.util.ArrayList;

@SuppressWarnings("all")
public class FolderTree {

    /*
     * Print method to print entire tree
     * Print method to print specific part (ls command)
     *
     */
    private Node<String> root;
    private Node<String> currentNode;

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

    /// TODO
    public void printTree() {
    }

    // class that implements the nodes for the tree
    private static class Node<E> {

        private E info;
        private Node<E> parent;
        private ArrayList<Node<E>> children;

        public Node(E value) {
            info = value;
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

        public ArrayList<Node<E>> getChildren() {
            return children;
        }

        public void addChild(Node<E> child) {
            children.add(child);
        }

        public void deleteChild(int child) {
            if (child >= children.size() || child < 0) {
                throw new IllegalArgumentException("Index is out of bounds.");
            }
            children.remove(child);
        }
    }
}
