public class Main {
    public static void main(String[] args) {
        // 选择语句 if-else switch-case
        int a = 2;
        if (a % 2 == 0) {
            System.out.println("even");
        } else if (a % 2 == 1) {
            System.out.println("odd");
        } else {
            System.out.println("no");
        }

        switch (a) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                System.out.println("all");
                break;
            default:
                System.out.println("no");
                break;
        }

        // Java14 : switch
        char ch = switch (a) {
            case 1 -> 'a';
            case 2 -> 'b';
            case 3 -> 'c';
            case 4, 5 -> 'd';

            default -> 'e';
        };
        System.out.println(ch);

        // 循环语句 for while do-while
        for (int i = 1; i < 10; ++i) {
            System.out.print(i + " ");
        }
        System.out.println();

        while (a >= 0) {
            System.out.print(a + " ");
            --a;
        }
        System.out.println();

        a = 3;
        do {
            System.out.print(a + " ");
            --a;
        } while (a >= 0);
        System.out.println();

        // continue
        for (int i = 1; i < 10; ++i) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // break
        for (int i = 1; i < 10; ++i) {
            if (i % 3 == 0) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 代码块标签
        outer: for (int i = 1; i < 4; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (j == 2) {
                    break outer;
                }
                System.out.print("{" + i + ", " + j + "} ");
            }
        }
        System.out.println();

        // 练习
        System.out.println("----------------------");
        prac1(1000);

        System.out.println("----------------------");
        prac2();

        System.out.println("---------------------");
        prac3(7);
        prac3(11);
    }

    private static void prac1(int end) {
        for (int i = 100; i < end; ++i) {
            int sum = 0;
            int num = i;
            while (num != 0) {
                int temp = num % 10;
                sum += temp *  temp * temp;
                num /= 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void prac2() {
        for (int i = 1; i <= 9; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i + " x " + j + " = " + (i * j) + " ");
            }
            System.out.println();
        }
    }

    private static void prac3(int index) {
        int a = 1, b = 1, temp = 0;
        for (int i = 0; i < index - 2; ++i) {
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(b);
    }
}