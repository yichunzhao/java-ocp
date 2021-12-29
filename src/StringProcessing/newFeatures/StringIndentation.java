package StringProcessing.newFeatures;

public class StringIndentation {

  public static void main(String[] args) {
    //
    var str = "this is a new java string feature.";
    System.out.printf("str          : %s \n", str);
    System.out.printf("str ident 4  : %s \n", str.indent(4));
    System.out.printf("str ident 0  : %s \n", str.indent(0));
    System.out.printf("str ident -1 : %s \n", str.indent(-1));
  }
}
