package sample;

import javafx.beans.property.StringProperty;

/**
 * Created by rc305 on 13/11/2017.
 */
public class Model {

    static final Model instance = new Model();

    public static Model getInstance(){
        return instance;
    }

    public String id = "";
}
