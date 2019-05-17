public class Hero{
    private String mName;
    private Integer mAge;

    public Hero(String name, Integer age) {
        mName = name;
        mAge = age;
    }
    public String getName(){
        return mName;
    }
    public Integer getAge(){
        return mAge;
    }
}
