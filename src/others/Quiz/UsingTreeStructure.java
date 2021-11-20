package others.Quiz;

import java.util.ArrayList;
import java.util.List;

public class UsingTreeStructure {

  public static void main(String[] args) {
    //
    Node<String> root = new Node("root", List.of(new Node("child", null)));
    Tree myTree = new Tree(root);

    System.out.printf("myTree: %s", myTree);
  }
}

class Node<T> {
  private T root;
  private List<Node> children = new ArrayList<>();

  public Node(T value, List<Node> nodes) {
    this.root = value;
    if (nodes != null) children.addAll(nodes);
  }
}

class Tree {
  private Node root;

  public Tree(Node root) {
    this.root = root;
  }
}
