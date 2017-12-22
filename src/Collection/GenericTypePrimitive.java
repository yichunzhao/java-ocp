/*
 * Can byte[] being a genric type? 
 * 
 * 
 */
package Collection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YNZ
 */
class Book {

    private String title;

    public Book(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}

public class GenericTypePrimitive {

    public GenericTypePrimitive() {
        List<byte[]> list = new ArrayList<>();
        
        //Generic variable, formal generic type; generic variable value
        List<Book> books = new ArrayList<>();
        list.add(new byte[10]);
        list.add(new byte[20]);

    }

}
