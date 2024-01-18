package listCollections;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    /*
    Create a class Bag that has a type parameter T for its member content. Create the right type of collection for a number of cases.

    Steps:

    1. Create a class named Bag with a type parameter T.

    2. Add a private member content of type List<T>.

    3. Import java.util.List and java.util.ArrayList.

    4. Initialize content with an empty ArrayList of type T.

    5. Create a method addItem to add items to the content.

    6. Create a method removeItem to remove items from the content.

    7. Create a method getItems to return the content.

    8. Create a class BagExample, in there create two bags and add some content. One Bag should take String content and the other Bag should take Integer content.
     */


    private List<T> content = new ArrayList<T>();

    public void addItem(T item) {
        content.add(item);
    }

    public void removeItem(T item) {
        content.remove(item);
    }

    public List<T> getItems() {
        return content;
    }

}
