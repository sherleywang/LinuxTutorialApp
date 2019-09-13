package androidapps.linuxtutorialapp;

import java.util.ArrayList;

public class FolderTree {

    // class that implements the nodes for the tree
    private static class Node<E> {

        private E info;
        private Node<E> parent = null;
        private ArrayList<Node<E>> children = null;

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
    }
}
