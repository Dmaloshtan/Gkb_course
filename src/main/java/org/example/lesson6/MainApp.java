package org.example.lesson6;

// ДЗ по многопоточности №1

public class MainApp {

    private static final int SIZE = 10000000;
    private static final int HALF = SIZE / 2;
    private static long a;
    private static long b;


    public static void createArray1() {
        float[] array = new float[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        a = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        b = System.currentTimeMillis();

        System.out.println(b - a);
        System.out.println(array[0]);

    }


    public static void createArray2() {
        float[] array = new float[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        a = System.currentTimeMillis();
        float[] halfArray1 = new float[HALF];
        float[] halfArray2 = new float[HALF];
        System.arraycopy(array, 0, halfArray1, 0, HALF);
        System.arraycopy(array, HALF, halfArray2, 0, HALF);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
             for (int i = 0; i<halfArray1.length; i++){
                 halfArray1[i] = (float) (halfArray1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
             }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<halfArray2.length; i++){
                    halfArray2[i] = (float) (halfArray2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(halfArray1,0,array,0,HALF);
        System.arraycopy(halfArray2,0,array,HALF,HALF);

        b = System.currentTimeMillis();
        System.out.println(b - a);
        System.out.println(array[0]);

    }

    public static void main(String[] args) {
        createArray1();
        createArray2();

    }


}
