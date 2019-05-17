import java.util.ArrayList;
import java.util.List;


public class Hero{
    private String mName;
    private Integer mAge;
    private String mPower;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<Hero> ();

    public Hero(String name, Integer age, String power, String weakness) {
        mName = name;
        mAge = age;
        mPower = power;
        mWeakness = weakness;
        instances.add(this);
    }
    public String getName(){
        return mName;
    }
    public Integer getAge(){
        return mAge;
    }
    public String getPower(){
        return mPower;
    }
    public String getWeakness(){
        return mWeakness;
    }
    public static List<Hero> all() {
        return instances;
    }
}
