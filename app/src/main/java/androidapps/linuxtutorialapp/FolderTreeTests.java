package androidapps.linuxtutorialapp;

import android.util.Log;

public class FolderTreeTests {

    public FolderTreeTests() {

    }

    public void testOne() {
        Log.d("tree test", "this works");
        Node<String> root = new Node<>("root");
        FolderTree directory = new FolderTree(root);
        root.addChild(new Node<>("bin"));
        root.addChild(new Node<>("bash"));
        root.addChild(new Node<>("bashrc"));
        Node<String> docu = new Node<>("documents");
        root.addChild(docu);
        docu.addChild(new Node<>("doc1"));
        docu.addChild(new Node<>("doc2"));
        docu.addChild(new Node<>("doc3"));
        docu.addChild(new Node<>("doc4"));
        directory.printTree();
    }
}
