class Main{

    public static void main(String[] args){

        Square shape1 = new Square();
        Square shape2 = new Square(5);

        System.out.printf("Square 1: %.2f\n", shape1.getLength());
        System.out.printf("Square 2: %.2f\n", shape2.getLength());

				
        System.out.printf("Square 1: %.2f\n", shape1.getArea());
        System.out.printf("Square 2: %.2f\n", shape2.getArea());

    }

}