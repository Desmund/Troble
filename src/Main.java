import java.util.Iterator;

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

        text.setCondition(new Condition() {
            @Override
            public boolean check(String str) {
                return str.length() == 4;
            }
        });


        Iterator   it =  text.iterator();
        while (it.hasNext()) {
            String s = (String)it.next();
            System.out.println(s);
        }

        text.setCondition(new Condition() {
            @Override
            public boolean check(String str) {
                return str.contains("sis");
            }
        });
        System.out.println("!!!!!!!!");

        it =  text.iterator();
        while (it.hasNext()) {
            String s = (String)it.next();
            System.out.println(s);
        }


    }
}
