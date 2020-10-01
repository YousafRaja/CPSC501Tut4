package templateExample;

public class AndroidCompiler extends CrossCompiler {
	protected void collectAndroidSource() {
		System.out.println("Android source ready");
	}
	
	protected void compileToAndroidTarget() {
		System.out.println("Android compiled");
	}
}
