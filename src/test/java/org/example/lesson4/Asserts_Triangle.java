package org.example.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Asserts_Triangle {
    private static Logger logger = LoggerFactory.getLogger(Asserts_Triangle.class);

    @Test
    @DisplayName("Проверка на ожидание")
    void expectations() throws My_Except {
        logger.info("Проверка на ожидание");
        Triangle_Zone exampleClass = new Triangle_Zone();
        Assertions.assertEquals(11,exampleClass.triangle_zone(6,6, 10));
    }


    @ParameterizedTest
    @DisplayName("На отрицательное значения - через CsvSource")
    @CsvSource({ "-5,5,5", "5,-5,5", "5,5,-5"})
    void testWithCsvSourceN(int a, int b, int c) throws My_Except {
        logger.info("На отрицательное значения - через CsvSource");
        Triangle_Zone exampleClass = new Triangle_Zone();
        Assertions.assertThrows(My_Except.class,()-> exampleClass.triangle_zone(a,b,c));
    }

    @Test
    @DisplayName("Проверка на отрицательные значения")
    @Tag("Triangle_area")
    void test() throws My_Except {
        logger.info("Проверка на отрицательные значения");
        Triangle_Zone exampleClass = new Triangle_Zone();
        Assertions.assertThrows(My_Except.class,()-> exampleClass.triangle_zone(-10,20,10));
        Assertions.assertThrows(My_Except.class,()-> exampleClass.triangle_zone(10,-20,10));
        Assertions.assertThrows(My_Except.class,()-> exampleClass.triangle_zone(10,20,-10));

    }

    @ParameterizedTest
    @DisplayName("Проверка на 0")
    @Tag("Triangle_area")
    @CsvSource({"5, 5, 4"})
    void test2(int a, int b, int c) throws My_Except {
        logger.info("Проверка на 0");
        Triangle_Zone exampleClass = new Triangle_Zone();
        Assertions.assertNotNull (a);
        Assertions.assertNotNull (b);
        Assertions.assertNotNull (c);;
    }

    @ParameterizedTest
    @DisplayName("Треугольник существует!")
    @Tag("Triangle_area")
    @CsvSource({"2, 2, 1"})
    void test3(int a, int b, int c) throws My_Except {
        logger.info("Треугольник существует!");
        Triangle_Zone exampleClass = new Triangle_Zone();
        Assertions.assertTrue(a + b > c);
        Assertions.assertTrue(a + c > c);
        Assertions.assertTrue(c + b > c);
    }

}
