import java.util.HashSet;
import java.util.Objects;

public class RunProgram {
public static void main (String args[]){
try{
main_program();} catch (Exception ex){ex.printStackTrace();}
}

private static int sub(int b){
System.out.println(String.valueOf(b));
return b;
}
private static void main_program () {
System.out.println(String.valueOf(1));
int a=1;
int b=sub (a);
Element v=new Element("aaa");
Set c=new Set();
c.add(v);
c.add(v);
Set h=new Set();
h=Set.union(c,c);
System.out.println(String.valueOf(h));
while (a<3){
a=a+1;
System.out.println(String.valueOf("ROT"));
}
if (a==3) {
System.out.println(String.valueOf("YES, dmwodo"));
}
 else {
}
}

}
class Element {

    private final String data;

    public Element(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Element) {
            return ((Element) obj).data.equals(data);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

}

class Set {

    private final java.util.Set<Element> set = new HashSet<>();

    public Set() {
    }

    public boolean add(Element element) {
        return set.add(element);
    }

    public boolean remove(Element element) {
        return set.remove(element);
    }

    public int size() {
        return set.size();
    }

    public void clear() {
        set.clear();
    }

    public static Set union(Set s1, Set s2) {
        Set out = new Set();
        out.set.addAll(s1.set);
        out.set.addAll(s2.set);
        return out;
    }


    public static Set intersection(Set s1, Set s2) {
        Set out = new Set();
        for (Element el : s1.set) {
            if (s2.set.contains(el)) {
                out.add(el);
            }
        }
        for (Element el : s2.set) {
            if (s1.set.contains(el)) {
                out.add(el);
            }
        }
        return out;
    }

    public static Set diff(Set s1, Set s2) {
        Set out = new Set();
        out.set.addAll(s1.set);
        for (Element el : s2.set) {
            if (s1.set.contains(el)) {
                out.remove(el);
            }
        }
        return out;
    }


    public static Set simDiff(Set s1, Set s2) {
        Set out = new Set();
        out.set.addAll(s1.set);
        out.set.addAll(s2.set);
        for (Element el : s1.set) {
            if (s2.set.contains(el)) {
                out.remove(el);
            }
        }
        for (Element el : s2.set) {
            if (s1.set.contains(el)) {
                out.remove(el);
            }
        }
        return out;
    }

    @Override
    public String toString() {
        return set.toString();
    }
}
