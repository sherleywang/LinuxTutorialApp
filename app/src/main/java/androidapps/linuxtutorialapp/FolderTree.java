package androidapps.linuxtutorialapp;

import android.util.Log;

import java.util.TreeMap;

// folder directory class
public class FolderTree {

    private Node<String> root;
    private Node<String> flag;
    private String response;

    public FolderTree(Node<String> root) {
        if (root == null)
            throw new IllegalArgumentException("Root can't be null");
        this.root = root;
        flag = this.root;
        response = "";
    }

    public boolean add(Node<String> parent, String child) {
        if (parent != null) {
            parent.addChild(child);
            return true;
        }
        return false;
    }

    public boolean remove(Node<String> parent, String child) {
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
            structure.append(current.getName());
            structure.append("\n");
            Log.d("in tree", structure.toString());
            TreeMap<String, Node<String>> children = current.getChildren();
            for (String child : children.keySet()) {
                Node<String> kid = children.get(child);
                printTreeHelper(kid, tabs + 1);
            }
        }
    }

}
