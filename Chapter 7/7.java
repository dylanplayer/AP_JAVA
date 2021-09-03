

class Main{

    public static void main(String[] args){

			  System.out.println("-------------");

        String[] planets = {"Mercury", "Venus", "Earth","Mars"};

        for(String s: planets){

            System.out.printf("%s\n", s);

        }

        System.out.println("-------------");

        for(String s: planets){

            System.out.printf("%s,", s.charAt(0));

        }

        System.out.println("\n-------------");


    }

}