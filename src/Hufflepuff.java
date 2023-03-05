public class Hufflepuff extends Hogwarts {
    private int hardWork; //трудолюбие
    private int loyalty; //верность
    private int honesty; //честь

    public Hufflepuff(String fullName, int powerOfMagic, int transgressionDistance, int hardWork, int loyalty, int honesty){
        super(fullName, powerOfMagic, transgressionDistance);
        this.hardWork=hardWork;
        this.loyalty=loyalty;
        this.honesty=honesty;
    }
    public int getHardWork(){
        return hardWork;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString(){
        return getFullName()+" - Сила магии:"+getPowerOfMagic()+" Расстояние трансгресии:"+getTransgressionDistance()+" Трудолюбте:"+hardWork+" Верность:"+loyalty+" Честь:"+honesty;
    }
    public static void bestStudentFaculty(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int sumStudent1 = hufflepuff1.hardWork + hufflepuff1.loyalty+hufflepuff1.honesty;
        int sumStudent2 = hufflepuff2.hardWork + hufflepuff2.loyalty+hufflepuff2.honesty;
        if (sumStudent1 > sumStudent2) {
            System.out.println(hufflepuff1.getFullName()+" лучший из Пуффендуй, чем "+hufflepuff2.getFullName());
        }
        else {
            System.out.println(hufflepuff2.getFullName()+" лучший из Пуффендуй, чем "+hufflepuff1.getFullName());
        }
    }
}
