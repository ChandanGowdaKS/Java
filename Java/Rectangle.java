/* we create a program to calculate the area of a rectangle */


class Rectangle{
    int length,width;

    Rectangle(){
        length=10;
        width=5;
    }

    Rectangle(int len, int wid){
        this.length = len;
        this.width = wid;
    }

    int area(){
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(20,10);
        System.out.println("Area of rectangle is :"+r1.area());
        System.out.println("Area of 2nd rectangle is :"+r2.area());
    }


}
// Completed
