public class CArithmetic {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(b * a);
        System.out.println(a / b);
        System.out.println(a % b);


        int x = 10;

        x = x + 5;
        x = x * 2;
        x = x - 4;
        System.out.println(x);


        // x = x - 5;   →   x -= 5;
        // x = x * 5;   →   x *= 5;
        // x = x / 5;   →   x /= 5;
        // x = x % 5;   →   x %= 5;

        int y = 10;
        y += 7;
        System.out.println(y - 99);
        int z = 10;
        z -= 10;
        System.out.println(z);


        int p = 10;
        p++;
        System.out.println(p);

        int q = 3;
        q--;
        System.out.println(q);

        int w = 7;
        w++;
        System.out.println(w++);
        System.out.println(w);

        int u = 6;
        System.out.println(u++);
        System.out.println(++u);
        System.out.println(u);
        System.out.println(--u);


        int g = 9;

        int e = g++;
        int f = ++g;

        System.out.println(g);
        System.out.println(e);
        System.out.println(f);

        int j = --g;
        int l = g--;

        System.out.println(g);
        System.out.println(j);
        System.out.println(l);


        int m = 9;

        int r = m++;
        int t = ++m;
        int d = --m;
        int s = m--;

        System.out.println(m);
        System.out.println(r);
        System.out.println(t);
        System.out.println(d);
        System.out.println(s);

    }
    
} 
