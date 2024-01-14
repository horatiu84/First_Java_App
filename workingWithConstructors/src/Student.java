public class Student {
    private String name;

    private int age;

    private String studentNr;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Student (String name,int age, String studentNr){
        this.name = name;
        this.age = age;
        this.studentNr = studentNr;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
