import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String mName;
    private String mSize;


    public Squad(String name, String size) {
        mName = name;
        mSize = size;
}

public String getName(){
    return mName;
}
public String getSize(){
    return mSize;
}
}