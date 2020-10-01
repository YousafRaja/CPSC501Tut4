package templateExample;

public class IPhoneCompiler extends CrossCompiler {
	protected void collectSource() {
		System.out.println("IPhone source ready");
	}
	
	protected void compileToTarget() {
		System.out.println("IPhone compiled");
	}
}
