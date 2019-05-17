public class Hero{
    private String mName;
    private Integer mAge;
    private String mPower;

    public Hero(String name, Integer age, String power) {
        mName = name;
        mAge = age;
        mPower = power;
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
}
