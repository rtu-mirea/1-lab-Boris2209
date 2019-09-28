package main_pack;

public class Menu {
    public void show_menu(){

        System.out.println("Введите размер массива: ");
        java.util.Scanner inp = new java.util.Scanner(System.in);
        int length = inp.nextInt();
        Array arr = new Array(length);

        String info_menu = "1. Ввести массив вручную\n2. Заполнить случайными числами\n" +
                "3. Вывести слева направо\n4. Вывести справа на лево\n" +
                "5. Определить количество элементов массива, у которых сумма цифр больше заданного значения\n" +
                "6. Сформировать новый массив из тех чисел исходного, у которых последняя цифра больше первой.\n" +
                "7. Выход из приложения\n";

        int num_menu;

        boolean job = true;
        while (job){
            System.out.print(info_menu);
            num_menu = inp.nextInt();
            switch (num_menu){
                case 1:
                    arr.m_input();
                    break;
                case 2:
                    arr.r_input();
                    break;
                case 3:
                    arr.l_out();
                    break;
                case 4:
                    arr.r_out();
                    break;
                case 5:
                    System.out.print("Введите значение: ");
                    int value = inp.nextInt();
                    System.out.println(arr.task_1(value) + " элементов массива у которых" +
                            "сумма цифр больше заданного значения\n");
                    break;
                case 6:
                    System.out.println("Сформированный массив: ");
                    System.out.print(arr.task_2()+ "\n");
                    break;
                case 7:
                    job = false;
                    break;
            }
        }
    }
}
