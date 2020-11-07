package urunova.spring;

public class ClassicalMusic  implements Music{
    public void doMyInit () {
        System.out.println("Doing my initialization");
    }

    public void doDestroyInit () {
        System.out.println("Doing my destruction");
    }


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
