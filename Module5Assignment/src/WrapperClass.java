
public class WrapperClass {

	int int1 = 1;
	String int2 = "2";
	int int3 = 3;
	String int4 = "4";
	byte int5 = 5;
	short int6 = 6;
	long int7 = 7;
	float float8 = 8;
	double double9 = 9;
	
	public void wrapperConversions() {
		
		System.out.println("Wrapper classes and conversions:\n");
		
		Integer wrapper1 = new Integer(int1);
		System.out.println("Constructor from int, wrapper1 = " + wrapper1);
		
		Integer wrapper2 = new Integer(int2);
		System.out.println("Constructor from String, wrapper2 = " + wrapper2);
		
		String wrapper3 = Integer.toString(int3);
		System.out.println("Integer.toString(); wrapper3  = " + wrapper3);
		
		Integer wrapper4 = Integer.valueOf(int4);
		System.out.println("Integer.valueOf(); wrapper4  = " + wrapper4);
		
		Byte wrapper5 = Byte.valueOf(int5);
		System.out.println("Byte.valueOf(byte); wrapper5  = " + wrapper5);
		
		Short wrapper6 = Short.valueOf(int6);
		System.out.println("Short.valueOf(short); wrapper6  = " + wrapper6);
		
		Long wrapper7 = Long.valueOf(int7);
		System.out.println("Long.valueOf(long); wrapper7  = " + wrapper7);
		
		Float wrapper8 = Float.valueOf(float8);
		System.out.println("Float.valueOf(float); wrapper8  = " + wrapper8);
		
		Double wrapper9 = Double.valueOf(double9);
		System.out.println("Double.valueOf(double); wrapper9  = " + wrapper9);
		
		System.out.println(" ");
		
	}
	
}
