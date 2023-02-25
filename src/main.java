public class main {
    public static void main(String[] args) {
        passwordGenerator generator = new passwordGenerator();
        passwordGenerator generator1 = new passwordGenerator();
        //StringBuffer stringBuffer = new StringBuffer();
        generator.setPassword("iloveangus1122");
        generator1.setPassword("iloveangus1122");
        System.out.println(generator.getPassword());
        System.out.println(generator1.getPassword());
    }
}
