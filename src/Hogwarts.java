public class Hogwarts {
    private String fullName;
    private int powerOfMagic; //сила магии
    private int transgressionDistance; //расстояние трансгресии

    public Hogwarts(String fullName, int powerOfMagic, int transgressionDistance){
        this.fullName=fullName;
        this.powerOfMagic=powerOfMagic;
        this.transgressionDistance=transgressionDistance;
    }
    public String getFullName(){
        return fullName;
    }
    public int getPowerOfMagic() {
        return powerOfMagic;
    }
    public int getTransgressionDistance(){
        return transgressionDistance;
    }
    public static void bestStudentHogwarts(Hogwarts gryffindor1, Hogwarts gryffindor2) {
        int sumStudent1 = gryffindor1.getPowerOfMagic() + gryffindor1.getTransgressionDistance();
        int sumStudent2 = gryffindor2.getPowerOfMagic() + gryffindor2.getTransgressionDistance();
        if (sumStudent1 > sumStudent2) {
            System.out.println(gryffindor1.getFullName()+" обладает бОльшей мощностью магии и расстоянию трансгрессии, чем "+gryffindor2.getFullName());
        }
        else {
            System.out.println(gryffindor2.getFullName()+" обладает бОльшей мощностью магии и расстоянию трансгрессии, чем "+gryffindor1.getFullName());
        }
    }

    }
