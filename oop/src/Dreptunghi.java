public class Dreptunghi {
private int latime=1;
private int lungime=1;
    private double area;
    private double perimeter;

    public Dreptunghi() {
        this.latime = latime=2;
        this.lungime = lungime=2;
        this.area = area;
        this.perimeter = perimeter;


    }

    public Dreptunghi(int latime , int lungime) {
        this.latime = latime;
        this.lungime = lungime;
        this.area = area;
        this.perimeter = perimeter;
    }
    public int getArea(){
     int area = this.lungime * this.latime;
     return area;
    }
    public int getPerimeter(){
        int perimeter = 2*(this.latime + this.lungime);
        return perimeter;
    }

}
