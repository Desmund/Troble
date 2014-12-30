import java.util.Iterator;

/**
 * Created by Denis on 21.12.2014.
 */
class Text {
    String[] text;

    public void add(String s){
        String[] str = new String[this.text.length+1];
        for (int i = 0; i < str.length -1; i++) {
            str[i] = this.text[i];
        }
        str[str.length-1] = s;
        this.text = str;
    }

    public void change(String s,int k){
        this.text[k] = s;
    }

    public void delete(int k){
        String[] str = new String[this.text.length-1];
        for (int i = 0; i < str.length; i++) {
            if(i<k) {
                str[i] = this.text[i];
            }
            else{
                str[i] = this.text[i+1];
            }
        }
        this.text = str;
    }

    public class Iter implements Iterator<Text> {
        public Iter(Text t) {
            //todo написать конструктор и методы для класса Iterator
        }

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Text next() {
            return null;
        }

        @Override
        public void remove() {

        }

        public void setCondition(){}
    }
}
