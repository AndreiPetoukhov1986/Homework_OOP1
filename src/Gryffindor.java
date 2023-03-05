public class Gryffindor extends Hogwarts {
    private int nobility; //благородство
    private int honor; //честь
    private int courage; //храбрость

    public Gryffindor(String fullName, int powerOfMagic, int transgressionDistance, int nobility, int honor, int courage) {
        super(fullName, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public String toString() {
        return getFullName() + " - Сила магии:" + getPowerOfMagic() + " Расстояние трансгресии:" + getTransgressionDistance() + " Благородство:" + nobility + " Честь:" + honor + " Храбрость:" + courage;
    }

    public static void bestStudentFaculty(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int sumStudent1 = gryffindor1.nobility + gryffindor1.honor+gryffindor2.courage;
        int sumStudent2 = gryffindor2.nobility + gryffindor2.honor+gryffindor2.courage;
        if (sumStudent1 > sumStudent2) {
            System.out.println(gryffindor1.getFullName()+" лучший Гриффиндорец, чем "+gryffindor2.getFullName());
        }
        else {
            System.out.println(gryffindor2.getFullName()+" лучший Гриффиндорец, чем "+gryffindor1.getFullName());
        }
    }
}
