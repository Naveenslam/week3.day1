package handsOnAbstraction;

public class Automation extends MultipleLanguage {

    @Override
    public void java() {
        System.out.println("java oops based language");
    }

    @Override
    public void selenium() {
        System.out.println("selenium used for web-based testing ");
    }


    @Override
    public void python() {
        System.out.println("python is a programing language");

    }

    @Override
    public void ruby() {
    }


    public static void main(String[] args) {
        Automation implementMethods=new Automation();
        implementMethods.ruby();
        implementMethods.python();

    }
}
