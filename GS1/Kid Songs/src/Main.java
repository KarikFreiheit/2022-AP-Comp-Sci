public class Main {
    public static void main(String[] args) {
        start();
        chorus_1();
        fly();
        chorus_2();
        spider();
        fly();
        chorus_3();
        bird();
        spider();
        fly();
        chorus_4();
        cat();
        bird();
        spider();
        fly();
        horse();
    }


    public static void start(){
        System.out.println("There was an old lady who swallowed a fly");
        System.out.println("I don’t know why she swallowed a fly \nPerhaps she’ll die!");
    }

    public static void chorus_1(){
        System.out.println("There was an old lady who swallowed a spider");
        System.out.println("That wriggled and jiggled and tickled inside her!");
    }
    public static void fly(){
        System.out.println("She swallowed the spider to catch the fly");
        System.out.println("I don’t know why she swallowed a fly \nPerhaps she’ll die!");
    }

    public static void chorus_2(){
        System.out.println("There was an old lady who swallowed a bird ");
        System.out.println("How absurd to swallow a bird!");
    }

    public static void spider(){
        System.out.println("She swallowed the bird to catch the spider");
    }

    public static void chorus_3(){

        System.out.println("There was an old lady who swallowed a cat");
        System.out.println("Imagine that to swallow a cat!");
    }
    public static void bird(){
        System.out.println("She swallowed the cat to catch the bird");
    }

    public static void chorus_4(){
        System.out.println("There was an old lady that swallowed a dog");
        System.out.println("What a hog, to swallow a dog!");
    }
    public static void cat(){
        System.out.println("She swallowed the dog to catch the cat");
    }

    public static void horse(){
        System.out.println("There was an old lady who swallowed a horse \nShe died of course.");

    }
}