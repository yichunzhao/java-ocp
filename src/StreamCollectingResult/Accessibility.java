/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StreamCollectingResult;

import java.util.stream.Stream;

/**
 * @author YNZ
 */
public enum Accessibility {
    ANY_TIME("Anytime"),
    FEW_TIME_WEEK("A few times a week"),
    ONCE_WEEK("Once a week");

    private final String text;

    Accessibility(String text) {
        this.text = text;
    }

    public static Stream<String> getCollection() {
        return Stream.of(Accessibility.values()).map(Accessibility::text);
    }

    public static Accessibility retrieve(String text) throws Exception {

        return Stream.of(Accessibility.values())
                .filter(x -> x.text().equals(text))
                .findFirst()
                .orElseThrow(() -> new Exception("Invalid Accessibility text ... "));
    }

    public String text() {
        return this.text;
    }
}
