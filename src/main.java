import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int rostM = 0;
        int rostW = 0;
        Boolean man = true;
        Boolean woman = true;

        Person person = new Person(rostM, rostW);


        System.out.print("Введите рост мужчины: ");
        rostM = num.nextInt();

        if (rostM == rostM) {
            person.manPMT();
            System.out.print("\n");

        } else if (rostM == rostW) {
            System.out.print("Неверно введеная цыфра");
        }
        System.out.print("Введите рост женщины: ");
        rostW = num.nextInt();

        if (rostW == rostW) ;
        {
            person.womanPMT();
            System.out.print("\n");
        }


    }

}
