public class Slytherin extends Hogwarts{
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int lustForPower; //жажда власти

    public Slytherin(String fullName, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower){
        super(fullName, powerOfMagic, transgressionDistance);
        this.cunning=cunning;
        this.determination=determination;
        this.ambition=ambition;
        this.resourcefulness=resourcefulness;
        this.lustForPower=lustForPower;
    }
    public int getCunning() {
        return cunning;
    }
    public int getDetermination() {
        return determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public int getLustForPower() {
        return lustForPower;
    }
    @Override
    public String toString(){
        return getFullName()+" - Сила магии:"+getPowerOfMagic()+" Расстояние трансгресии:"+getTransgressionDistance()+" Хитрость:"+getCunning()+" Решительность:"+getDetermination()+" Амбициозность:"+getAmbition()+" Находчивость:"+getResourcefulness()+" Жажада власти:"+getLustForPower();
    }
    public static void bestStudentFaculty(Slytherin slytherin1, Slytherin slytherin2) {
        int sumStudent1 = slytherin1.cunning + slytherin1.determination+slytherin1.ambition+slytherin1.resourcefulness+slytherin1.lustForPower;
        int sumStudent2 = slytherin2.cunning + slytherin2.determination+slytherin2.ambition+slytherin2.resourcefulness+slytherin2.lustForPower;
        if (sumStudent1 > sumStudent2) {
            System.out.println(slytherin1.getFullName()+" лучший из Слизерин, чем "+slytherin2.getFullName());
        }
        else {
            System.out.println(slytherin2.getFullName()+" лучший из Слизерин, чем "+slytherin2.getFullName());
        }
    }
}
