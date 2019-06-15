/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionalInterface;

import java.util.List;

/** @author YNZ */
@FunctionalInterface
public interface Criteria<T> {

  List<T> meetCriteria(List<T> items);
}
