/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamCollectingResult;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YNZ
 */
public class AccessibilityTest {

    public AccessibilityTest() {
    }

    @Test
    public void testRetrieve() throws Exception {
        assertThat(Accessibility.retrieve(Accessibility.ANY_TIME.text()), is(Accessibility.ANY_TIME));
    }

    @Test(expected = Exception.class)
    public void whenretrieve_emptytext_thenthrowException() throws Exception {
        Accessibility.retrieve("");
    }

    @Test(expected = Exception.class)
    public void whenretrieve_null_thenthrowException() throws Exception {
        Accessibility.retrieve(null);
    }

    @Test(expected = Exception.class)
    public void whenretrieve_othertext_thenthrowException() throws Exception {
        Accessibility.retrieve("whatever");
    }

    @Test
    public void whenretievetext_thenitreturnAccesibility() throws Exception {
        Accessibility actual = Accessibility.retrieve(Accessibility.FEW_TIME_WEEK.text());
        assertThat(actual, is(Accessibility.class));
    }

}
