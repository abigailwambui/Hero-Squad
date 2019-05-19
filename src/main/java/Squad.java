import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String mName;
    private String mSize;
    private String mCause;
    private static List<Squad> instances = new ArrayList<Squad>();

    public Squad(String name, String size, String cause) {
        mName = name;
        mSize = size;
        mCause = cause;
        instances.add(this);
}

public String getName(){
    return mName;
}
public String getSize(){
    return mSize;
}
public String getCause(){
    return mCause;
}
public static List<Squad> all() {
        return instances;
}
public static void clear() {
        instances.clear();
    }
}