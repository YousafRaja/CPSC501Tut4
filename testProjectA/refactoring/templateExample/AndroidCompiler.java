package templateExample;

public class AndroidCompiler extends CrossCompiler {
	protected void collectSource() {
		System.out.println("Android source ready");
	}
	
	protected void compileToTarget() {
		System.out.println("Android compiled");
	}
}
