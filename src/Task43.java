import java.util.Random;


public class Task43 {
    public static String randomEmail(){
        Random random = new Random();
        String randomEmail = "";
        for (int i = 0; i < random.nextInt(5, 10); i++) {

            int number = random.nextInt(97, 123);
            randomEmail += (char)number;
        }
        return randomEmail + "@bo.com";
    }

    /*public static String randomString(){
        String generateStr = RandomStringUtils.randomAlphabetic(5);
        return generateStr + "@bo.com";
    }*/
    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static void main(String[] args) {
        String s = randomEmail();
        System.out.println(s + " : length" + s.length());
    }
}
