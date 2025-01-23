public class PalinListRunner
{
    public static void main(String[] args) {
        PalinList test1 = new PalinList("one two three two one");
        PalinList test2 = new PalinList("1 2 3 4 5 one two three four five");
        PalinList test3 = new PalinList("a b c d e f g x y z g f h");
        PalinList test4 = new PalinList("racecar is racecar");
        PalinList test5 = new PalinList("1 2 3 a b c c b a 3 2 1");
        PalinList test6 = new PalinList("chicken is a chicken");
        
        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());
        System.out.println(test4.toString());
        System.out.println(test5.toString());
        System.out.println(test6.toString());
        
    }
}
