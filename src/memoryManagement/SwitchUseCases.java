/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoryManagement;

/** @author YNZ */
public class SwitchUseCases {
  public static void main(String[] args) {

    int statusCode = 0;

    switch (statusCode) {
      case 0:
      case 110:
        System.out.println("others.SwitchUseCases.main()");
      case 3210:
        System.out.println("3210");
      default:
        {
          System.out.println(" default ... ");

          if (true) throw new IllegalStateException("sss");
        }
    }

    System.out.println("dddd");
  }
}
