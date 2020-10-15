package tutSlides2;

public class Driver {
	static char indentChar = '\t';
    public static void display(int depth, String cname, String info, String fmt) {
    	String align = "";
    	for(int i = 0; i<depth; i++)align+=indentChar;
    	System.out.format(fmt,align,cname,info);
    }

}
