package com.rotten.compiler.core.inherit.types;

import java.util.HashSet;

public class Set {

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
