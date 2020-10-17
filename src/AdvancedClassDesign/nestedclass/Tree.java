package AdvancedClassDesign.nestedclass;

/**
 * nested class: static nested class or inner class(non-static)
 * <p>
 * where to define nested classes? within a scope of a class. TreeSort and Tree survive together; without a Tree
 * we don't need a TreeSort, that is the reason we use inner class here. Another case to use nested class, is to take it
 * as parameter containers, so that reducing the length of method due to many arguments.
 *
 * <p>
 * inner class cannot have static methods.
 * static nested class can have static methods.
 * <p>
 * Static class member need not to create a outer class instance to access it. A nested static class is compiled as
 * separated class file.
 */
public class Tree {
    enum Color {
        RED, BLUE, BLACK
    }

    //static nested class
    public static class Node {
        public String pre;
        public String next;

        public Node(String pre, String next) {
            this.pre = pre;
            this.next = next;
        }
    }

    static class StaticNested {
        static void doStaticMethod(Color color) {
            System.out.println("painting in a static method: " + color);
        }
    }

    public void localInnerMethodClass() {
        class LocalMethodNested {
            private Color color;

            private LocalMethodNested(Color color) {
                this.color = color;
            }

            public void iCanDo() {
                System.out.println(" I can paint this color from local: " + this.color);
            }
        }

        LocalMethodNested localMethodNested = new LocalMethodNested(Color.BLUE);
        localMethodNested.iCanDo();
    }

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.localInnerMethodClass();

        Tree.StaticNested.doStaticMethod(Color.RED);
        Tree.Node node = new Tree.Node("pre", "next");
    }

}
