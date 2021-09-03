

class Main{

    public static void main(String[] args){

        Rectangle[] shapes = {new Rectangle(1, 1), new Rectangle(2, 2), new Rectangle(3, 3), new Rectangle(4, 4), new Rectangle(5, 5)};

        for(int i = 0; i < shapes.length; i++){

            System.out.printf("Rectangle %d: length: %.2f width: %.2f\n", i, shapes[i].getLength(), shapes[i].getWidth());

        }

    }

}