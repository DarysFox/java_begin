package Lesson22;

public class Human {
    final String pol;

    Human(String pol) {
        this.pol = pol;
    }

    private boolean clever;

    public boolean isClever(){
        return clever;
    }



    private String name;

    public String getName() {
        return name;
    }

    public void setName(String s) {
        name = s;
    }




    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int i) {
        if (i > 0) {
            age = i;
        }
    }




    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int i) {
        if (i > 0) {
            weight = i;


        }
    }




    class HumanTest_22 {
        public static void main(String[] args) {
            Human h = new Human("male");
            h.setName("Rob");
            h.setAge(25);
            h.setWeight(89);

            System.out.println(h.getName());
            System.out.println(h.getAge());
            System.out.println(h.getWeight());
        }
    }
}