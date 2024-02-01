public class Cat {
    
    String name;
    int age;

    // Can only be called by using a Cat object
    public void meow() {
        System.out.println("Meow meow!");
    }
    
    // static means we can call the method outside of a Cat object
    public static void dingDong() {

        System.out.println("Ding dong!");

    }
}