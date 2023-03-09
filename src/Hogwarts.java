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
    private int a(){
        return powerOfMagic+transgressionDistance;
    }
    public void bestStudentHogwarts(Hogwarts hogwarts) {
        int sumStudent1 = this.a();
        int sumStudent2 = hogwarts.a();
        if (sumStudent1 > sumStudent2) {
            System.out.println(this.getFullName()+" обладает бОльшей мощностью магии и расстоянием трансгрессии, чем "+hogwarts.getFullName());
        }
        else if (sumStudent2 > sumStudent1){
            System.out.println(hogwarts.getFullName()+" обладает бОльшей мощностью магии и расстоянием трансгрессии, чем "+this.getFullName());
        } else {
            System.out.println(hogwarts.getFullName()+" обладает одинаковой мощностью магии и расстоянием трансгрессии, как и "+this.getFullName());
        }
    }

    }
