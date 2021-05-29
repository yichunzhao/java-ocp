package Generics.Interface;

/**
 * A Generic interface
 * <p>
 * a non-generic class implements a generic interface, by replacing its generic type parameter by an actual type.
 * <p>
 * when a generic interface defines its return type as parameterised, normally it uses a non-generic class to implement
 * this generic interface.
 */
public class GenericInterface {

    public interface Answer<T> {
        T answer(String question);
    }

    public static class SpecificAnswer implements Answer<String> {

        @Override
        public String answer(String question) {
            String ans = " we cannot fly.";
            return "about the question: " + question + " answer:" + ans;
        }
    }

    public static void main(String[] args) {

        Answer<String> answer = new Answer<String>() {

            @Override
            public String answer(String question) {
                String ans = "new vaccine";
                return "about the question: " + question + " answer:" + ans;
            }
        };

        System.out.println(answer.answer("how to handle the new virus? "));

        Answer<String> anotherAnswer = question -> {
            String ans = "a lot of water";
            return ans;
        };

        System.out.println(anotherAnswer.answer("how to handle the new virus? "));

        Answer mySpecificAnswer = new SpecificAnswer();
        System.out.println(mySpecificAnswer.answer("Can we fly? "));
    }

}
