package fundamentos;

public class Wrappers {
    
    public static void main(String[] args) {
        // byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.shortValue());
        System.out.println(i.intValue());
        System.out.println(l.toString());
        
        /*    Podemos fazer operações com os wrappers 
         * assim como fazemos com os tipos primitivos*/
        
        System.out.println(b + 5);
        System.out.println(s - 300);
        System.out.println(i * 5);
        System.out.println(l * 1000);
        
        Float f = 123.10F;
        System.out.println(f);
        
        Double d = 1234.5678;
        System.out.println(d);
        
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());
        
        // char
        Character c = '#'; // char
        System.out.println(c + "...");
    }
}
