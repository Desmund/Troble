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

    public class Iterator{
        public Iterator(Text t) {
            //todo написать конструктор для класса Iterator
        }

        public String next(){
            //todo написать метод next
            return "";
        }

        public boolean hasNext(){
            //todo написать метод hasNext
            return true;
        }

        public void setCondition(){}
    }
}
