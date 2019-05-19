import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String mName;
    private String mSize;
    private String mCause;


    public Squad(String name, String size, String cause) {
        mName = name;
        mSize = size;
        mCause = cause;
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
}