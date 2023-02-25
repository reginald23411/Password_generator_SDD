import sun.security.util.Length;

public class passwordGenerator {
    private String Password;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        if (verifyPassword(password)){
            Password = generatePassword(password);
        }else{
            System.out.println("wrong password format");
        }
    }

    public String generatePassword(String password){
        StringBuffer symbolString = new StringBuffer();
        symbolString.append("!@_$&*");
        StringBuffer sb = new StringBuffer();
        sb.append(password);
        for (int i = 0; i < sb.length(); i++) {
            int randomIndex=(int)(Math.random()*sb.length());
            if (Character.isLetter(sb.charAt(randomIndex))&&Character.isLowerCase(sb.charAt(randomIndex))){
                sb.setCharAt(randomIndex,Character.toUpperCase(sb.charAt(randomIndex)));
            }
        }
        for (int i = 0; i < 3; i++) {
            int randomSymbolIndex=(int)(Math.random()*sb.length());
            int randomSymbolListIndex=(int)(Math.random()*symbolString.length());
            sb.insert(randomSymbolIndex,symbolString.charAt(randomSymbolListIndex));
        }
        return sb.toString();
    }

    public boolean verifyPassword(String password){
        boolean passwordFlag=true;
        if (password.length()<12||!withNumericAndCharacter(password)){
            passwordFlag=false;
        }
        return passwordFlag;
    }

    public boolean withNumericAndCharacter(String password){
        int charCount=0,numberCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))){
                numberCount++;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))){
                charCount++;
            }
        }
        if (charCount!=0 && numberCount!=0){
            return true;
        }
        return false;
    }
}
