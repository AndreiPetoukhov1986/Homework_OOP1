public class Ravenclaw extends Hogwarts{
    private int mind; //ум
    private int wisdom; //мудрость
    private int wit; //остроумие
    private int creativity; //творчество

    public Ravenclaw(String fullName, int powerOfMagic, int transgressionDistance, int mind, int wisdom, int wit, int creativity){
        super(fullName, powerOfMagic, transgressionDistance);
        this.mind=mind;
        this.wisdom=wisdom;
        this.wit=wit;
        this.creativity=creativity;
    }
    public int getMind(){
        return mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public int getWit() {
        return wit;
    }
    public int getCreativity() {
        return creativity;
    }
    @Override
    public String toString(){
        return getFullName()+" - Сила магии:"+getPowerOfMagic()+" Расстояние трансгресии:"+getTransgressionDistance()+" Ум:"+getMind()+" Мудрость:"+getWisdom()+" Остроумие:"+getWit()+" Творчество:"+getCreativity();
    }
    public static void bestStudentFaculty(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int sumStudent1 = ravenclaw1.mind + ravenclaw1.wisdom+ravenclaw1.wit+ravenclaw1.creativity;
        int sumStudent2 = ravenclaw2.mind + ravenclaw2.wisdom+ravenclaw2.wit+ravenclaw2.creativity;
        if (sumStudent1 > sumStudent2) {
            System.out.println(ravenclaw1.getFullName()+" лучший из Когтевран, чем "+ravenclaw2.getFullName());
        }
        else {
            System.out.println(ravenclaw2.getFullName()+" лучший из Когтевран, чем "+ravenclaw1.getFullName());
        }
    }
}
