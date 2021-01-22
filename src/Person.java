public class Person {
    int rostM;
    int rostW;

    public Person(int rostM, int rostW) {
        this.rostM = rostM;
        this.rostW = rostW;
    }

    public void manPMT() {
        System.out.println("Идеальный вес для мужчины:" + (4 * rostM / 2.54 - 128) * 0.45 + " кг");

    }

    public void womanPMT() {
        System.out.println("Идеальный вес для женщины :" + (3.5 * rostW / 2.54 - 108) * 0.45 + " кг");
    }

}
