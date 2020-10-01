package templateExample;

public class IPhoneCompiler extends CrossCompiler {
	protected void collectIPhoneSource() {
		System.out.println("IPhone source ready");
	}
	
	protected void compileToIPhoneTarget() {
		System.out.println("IPhone compiled");
	}
}
