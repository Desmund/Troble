/**
 * Created by Denis on 30.12.2014.
 */
public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        text.add("mama");
        text.add("papa");
        text.add("brat");
        text.add("sistra");
        text.add("kot");
        text.delete(4);
        text.change("sistra",2);
    }
}
