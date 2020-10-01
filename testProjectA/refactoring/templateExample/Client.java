package templateExample;

public class Client {

	public static void main(String[] args) {
		IPhoneCompiler iphone = new IPhoneCompiler();
		iphone.collectIPhoneSource();
		iphone.compileToIPhoneTarget();
		AndroidCompiler android = new AndroidCompiler();
		android.collectAndroidSource();
		android.compileToAndroidTarget();		
	}

}
