package jun.yu.maven.test.PowerMockito;

public class Human {
    public String name;
    public int age1;
    public String telephone;
    public String address2;
    public String address3;
    public String address;
    private String address4;
    public Puppy puppy;

    public Human(String name1) {
        this.name = name1;
    }

    public void buyPuppy(String name){
        puppy = Puppy.createPuppy(name, this);
    }

    public void walkWithPuppy() {
        puppy.goOnWalk(15);
    }

    public static void main(String[] args) {
        Human john = new Human("John");
        john.buyPuppy("Gatsby");
        john.puppy.performPuppyTasks();
        john.walkWithPuppy();
    }

    public void isSoHappy() {
        System.out.println("Yay!");
    }

    public int getAge() {
        return age1;
    }

    public void setAge(int age1) {
        this.age1 = age1;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        System.out.println(address2);
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }
}
