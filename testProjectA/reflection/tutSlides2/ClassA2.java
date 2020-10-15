package tutSlides2;


public final class ClassA2 implements java.io.Serializable, Runnable {

    private int val = 3;
    private double val2 = 0.2;
    private boolean val3 = true;

    public ClassA2() {
        val = 3;
    }

    public ClassA2(int i) {
        try {
            setVal(i);
        } catch (Exception e) {
        }
    }

    public void run() {
    }
    
    public void run2() { 
    }

    public int getVal() {
        return val;
    }

    public void setVal(int i) throws Exception {
        if (i < 0) {
            throw new Exception("negative value");
        }
        val = i;
    }

    public String toString() {
        return "ClassA";
    }

    private void printSomething() {
        System.out.println("Something");
    }

}
