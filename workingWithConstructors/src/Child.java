public class Child extends Person{
    private int age;
    private String childId;

    public Child(String name,int age) {
      super(name);
      this.age = age;
    }

    public Child (String name,int age, String childId){
       super(name);
        this.age = age;
       this.childId = childId;
    }


    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
