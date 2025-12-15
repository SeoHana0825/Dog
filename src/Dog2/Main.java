package Dog2;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("멍멍이", "말티즈",10);
        Dog dog2 = new Dog ("초코","진돗개",5);
        Dog dog3 = new Dog("뭉치", "푸들",2);

        System.out.println("첫번째 강아지: " + dog.getName()+ ", " + dog.getBreed());
        System.out.println("두번째 강아지: " + dog2.getName()+ ", " + dog2.getBreed());
        System.out.println("세번째 강아지: " + dog3.getName()+ ", " + dog3.getBreed());

        dog.age();
        dog2.age();
        dog3.age();
    }
}
