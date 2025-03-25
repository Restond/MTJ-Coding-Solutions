import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入在三维空间的三角形三个顶点A，B，C的坐标（x,y,z），计算并输出三角形面积。不考虑不能构成三角形的特殊情况。

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double z1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double z2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double z3 = input.nextDouble();

        double a = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)+(z2-z1)*(z2-z1));
        double b = Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)+(z3-z2)*(z3-z2));
        double c = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)+(z1-z3)*(z1-z3));

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.printf("%.2f", area);

        input.close();
    }
}
