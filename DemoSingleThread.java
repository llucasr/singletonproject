public class DemoSingleThread {
    public static void main(String[] args) {
        System.out.println("Se voce ve  o mesmo valor, este singleton foi reusado(!)" + "\n" +
                "Se vc ve dois valores diferentes, 2 sigletons foram criados" + "\n\n" +
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}