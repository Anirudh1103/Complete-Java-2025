public class Main {
    public static void main(String[] args) {
        GetterAndSetterMethods ani = new GetterAndSetterMethods();
        ani.setAge(1);
        ani.setName("Anirudh");
        System.out.println(ani);
        ani.setName(null);
        System.out.println(ani);
        ani.setAge(-1);
        System.out.println(ani);
    }
}
