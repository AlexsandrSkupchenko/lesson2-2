package lesson2;

public class Main2 {
    public static void main(String[] args) {
        String[][] w = {
                {"5", "36", "12", "33"},
                {"53", "33", "12", "5"},
                //{"5","45","1","5"},
                //{"5","45","1"},
                {"45", "12", "1", "23"},
                //{"45","12","1","23", "23"},
                {"45", "12", "1", "23"},
                //{"45", "12a", "1", "23"},
        };

        myArr(w);
        System.out.println("END");
    }
    static void myArr(String[][] w) throws MyArrayDataException {
        int size = w.length;
        if (size > 4) throw new MyArraySizeException("не соответсвует размер, на входе размер массива " + size);
        for (int i = 0; i < w.length; i++) {
            if (w[i].length != 4) {
                throw new MyArraySizeException(" одна из строк массива не сооветствует длине 4 элемента");
            }
        }
        int summ = 0;
        for (int i = 0; i < w.length; i++) {
            for (int j = 0; j < w[i].length; j++) {
                try {
                    int x = Integer.parseInt(w[i][j]);
                    System.out.print(x + "\t");
                    summ = summ + x;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("\nне правильный элемент " + w[i][j] + ".\n строка " + (i+1) + ".\n столбец " + (j+1));

                }
            }
            System.out.println();
        }
        System.out.println(summ);
    }
}
