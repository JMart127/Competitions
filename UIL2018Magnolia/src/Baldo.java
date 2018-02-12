public class Baldo {
    
    public static void main(String[] args) {
        
        for (int i = 65; i < 91; i++) {
            int little = i+32;
            char b = (char)i;
            char l = (char)little;
            System.out.println(b + " " + i + " " + l + " " + little);
        }
    }
}
