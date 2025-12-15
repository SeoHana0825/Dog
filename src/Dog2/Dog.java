package Dog2;

public class Dog {

    private String name;
    private String breed;
    private int age;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    // 메서드 (자유형식)
    public void age(){
        System.out.println("이 강아지의 나이는" + age + "입니다.");
    }

    // 게터
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }
}
