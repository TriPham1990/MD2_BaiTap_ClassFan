public class DisplayObject {
    public static void main(String[] args) {
        ClassFan fan1 = new ClassFan();
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setSpeed(fan1.FAST);
        fan1.setOn(true);

        ClassFan fan2 = new ClassFan();
        fan2.setSpeed(fan2.MEDIUM);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
