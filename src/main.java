public class main {
    public static void main(String[] args) {
        passwordGenerator generator = new passwordGenerator();
        passwordGenerator generator1 = new passwordGenerator();
        //StringBuffer stringBuffer = new StringBuffer();
        generator.setPassword("ilovepussy");
        generator1.setPassword("ilovepussy1122");
        System.out.println("Original password:ilovepussy1122");
        System.out.println(generator.getPassword());
        System.out.println(generator1.getPassword());
    }
}
