package org.example.lesson4;

public class Triangle_Zone {

    public int triangle_zone ( int a, int b, int c) throws My_Except {
        if (a < 0 || b < 0 || c < 0) throw new My_Except("Число < 0");
        if (a + b <= c || a + c <= b || b + c <= a) throw new My_Except ("Треугольник не существует");
        int result = (a + b + c) / 2;
        return result;
    }
}
