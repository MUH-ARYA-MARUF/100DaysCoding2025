public class Main {
	public static void main(String[] args) {
		
        // String tipe data
        String strByte = "111";
        String strShort = "3266";
        String strInt = "123456";
        String strLong = "7766";
        String strFloat = "3.14";
        String strDouble = "2.71";
        String strBool = "true";
        String strChar = "A";

        // Tipe primitif
        byte b = Byte.parseByte(strByte);
        short s = Short.parseShort(strShort);
        int i = Integer.parseInt(strInt);
        long l = Long.parseLong(strLong);
        float f = Float.parseFloat(strFloat);
        double d = Double.parseDouble(strDouble);
        boolean bool = Boolean.parseBoolean(strBool);
        char c = strChar.charAt(0);

        // Cetak 
        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("boolean : " + bool);
        System.out.println("char    : " + c);
    
	}
}
