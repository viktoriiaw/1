package homeWork.test11;

public class Factorial {
    int f;

    Factorial(int f) {
        this.f = f;
    }

    public int factNumber() {
        int a = 1;
        for (int i = 1; i <= f; i++) {
            a = a * i;
        }
        return a;
    }
}


