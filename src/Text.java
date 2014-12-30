import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * Created by Denis on 21.12.2014.
 */
class Text implements Iterable<String> {
    private String[] text = new String[]{};
    private Condition condition;

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

    public void setCondition(Condition condition){
        this.condition = condition;
    };



    public String[] getMass() {
        return text;
    }

    @Override
    public Iterator iterator() {
        if (condition == null) {
            return null;
          //  throw new Exception("!!");
        }
       /* String[] newMass =  Arrays.copyOf(text, text.length);
        newMass.*/
        Text condText = new Text();
        for (int i = 0; i < text.length; i++) {
            if (condition.check(text[i])) {
                condText.add(text[i]);
            }
        }

        return new Itr(condText.getMass());
    }

    private class Itr implements Iterator<String> {
        private final String[] condText;
        int cursor;       // index of next element to return
        int lastRet = -1; // index of last element returned; -1 if no such

        public Itr(String[] condText) {
            this.condText = condText;
        }

        public boolean hasNext() {
            return cursor != condText.length;
        }


        public String next() {
            checkForComodification();
            int i = cursor;
            if (i >= condText.length)
                throw new ConcurrentModificationException();
            cursor = i + 1;
            return  condText[lastRet = i];
        }

        public void remove() {
          /*  if (lastRet < 0)
                throw new IllegalStateException();
            checkForComodification();

            try {
                Te.this.remove(lastRet);
                cursor = lastRet;
                lastRet = -1;
                expectedModCount = modCount;
            } catch (IndexOutOfBoundsException ex) {
                throw new ConcurrentModificationException();
            }*/
        }

        final void checkForComodification() {
        }
    }
}
