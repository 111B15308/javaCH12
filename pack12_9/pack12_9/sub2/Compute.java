package pack12_9.sub2;
import pack12_9.sub1.MyMath;

public class Compute extends MyMath {
    private int ans;

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        ans = a * b;
        return ans;
    }

    @Override
    public int div(int a, int b) {
        if (b != 0) {
            ans = a / b;
            return ans;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0; // Return a default value; you may want to handle this differently based on your requirements.
        }
    }

    public void show() {
        System.out.println("ans=" + ans);
    }
}
