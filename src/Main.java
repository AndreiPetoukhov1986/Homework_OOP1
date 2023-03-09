public class Main {
    public static void main(String[] args) {

        Gryffindor gryffindor1 = new Gryffindor("Гарри Поттер",1,2,1,1,1);
        Gryffindor gryffindor2 = new Gryffindor("Гермиона Грейнджер", 91, 80, 95, 82, 83);
        Gryffindor gryffindor3 = new Gryffindor("Рон Уизли", 88, 79, 78, 77, 76);
        System.out.println(gryffindor1);
        System.out.println(gryffindor2);
        System.out.println(gryffindor3);
        Gryffindor.bestStudentFaculty(gryffindor3, gryffindor2);

        Hufflepuff hufflepuff1 = new Hufflepuff("Захария Смит", 86, 89, 100, 100, 87);
        Hufflepuff hufflepuff2 = new Hufflepuff("Седрик Диггори", 85, 78, 100, 100, 75);
        Hufflepuff hufflepuff3 = new Hufflepuff("Джастин Финч-Флетчли", 87, 77, 100, 90, 74);
        System.out.println(hufflepuff1);
        System.out.println(hufflepuff2);
        System.out.println(hufflepuff3);
        Hufflepuff.bestStudentFaculty(hufflepuff1, hufflepuff2);

        Ravenclaw ravenclaw1 = new Ravenclaw("Чжоу Чанг", 83, 77, 10, 75, 74, 73);
        Ravenclaw ravenclaw2 = new Ravenclaw("Падма Патил", 82, 76, 74, 72, 70, 68);
        Ravenclaw ravenclaw3 = new Ravenclaw("Маркус Белби", 81, 75, 100, 100, 69, 67);
        System.out.println(ravenclaw1);
        System.out.println(ravenclaw2);
        System.out.println(ravenclaw3);
        Ravenclaw.bestStudentFaculty(ravenclaw1, ravenclaw2);

        Slytherin slytherin1 = new Slytherin("Драко Малфлой", 89, 94, 80, 0, 78, 77, 100);
        Slytherin slytherin2 = new Slytherin("Грэхэм Монтегю", 83, 78, 67, 100, 100, 64, 65);
        Slytherin slytherin3 = new Slytherin("Грегори Гойл", 84, 79, 68, 67, 100, 65, 64);
        System.out.println(slytherin1);
        System.out.println(slytherin2);
        System.out.println(slytherin3);
        Slytherin.bestStudentFaculty(slytherin1, slytherin2);

       slytherin1.bestStudentHogwarts(ravenclaw3);
    }
}