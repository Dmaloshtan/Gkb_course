package org.example.lesson3;

public class MyArrayDataException extends MyException {
    private int row;
    private int column;
    private Object value;

    public MyArrayDataException() {
        super("Введены не корректные данные");
    }

    public MyArrayDataException(int row, int column, Object[][] array) {
        super("Преобразование не удалось, не верный формат значения " + array[row][column] + " в ячейке с индексами " + row + " " + column);
        this.row = row;
        this.column = column;
        this.value = value;
    }
}
