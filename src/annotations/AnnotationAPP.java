package annotations;

public class AnnotationAPP {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        new Base().prinMessage();
        new Extended().printMessage();

    }
}
class Base{
    public void prinMessage(){
        System.out.println("Print from the base class");
    }
}
class Extended extends Base{
    public void printMessage(){
        System.out.println("Print from the Extended class");
    }
}