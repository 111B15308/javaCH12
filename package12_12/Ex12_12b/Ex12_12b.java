// Ex12_12b.java
public class Ex12_12b {
    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println("Sum(5)=" + s.add(5));
    }
}

class Sum {
    private int sum = 0;

    public int add(int n) {
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
}
