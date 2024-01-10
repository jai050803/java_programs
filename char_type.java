public class char_type {
    public static void main(String[] args) {
        char [] title = {'T', 'i', 't', 'a', 'n', 'i', 'c'};
        char ch = title[1];
        title[3] = ch;
        System.out.println( title );
        System.out.println( ch );
    }
}
