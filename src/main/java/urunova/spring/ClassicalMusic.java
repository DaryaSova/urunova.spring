package urunova.spring;

public class ClassicalMusic  implements Music{
    private ClassicalMusic () {}//ограничиваем создания класса

    public static ClassicalMusic getClassicalMusic () {
        return new ClassicalMusic();
    }

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
