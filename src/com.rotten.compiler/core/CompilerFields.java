package com.rotten.compiler.core;

public class CompilerFields {

    public static final String MAIN_PROGRAM = "main_program";

    public static final String BEGIN = "{\n";
    public static final String END = "}\n";
    public static final String SEPARATOR = ";\n";
    public static final String ASSIGN = "=";

    public static final String MAIN_METHOD = "private static void main_program () ";
    public static final String SUB_METHOD = "private static ";
    public static final String VOID = "void";
    public static final String COMMA = ",";
    public static final String RETURN = "return";

    public static final String SOUT = "System.out.println(String.valueOf(%s))";

    public static final String WHILE = "while (%s)";
    public static final String IF_ELSE = "if (%s) %s else %s";
    public static final String NEW_ELEMENT = "new Element(%s)";
    public static final String NEW_SET = "new Set()";

    public static final String OPEN_BRACKET = "(";
    public static final String CLOSE_BRACKET = ")";
    public static final String DELIMITER = ".";
    public static final String ADD_NEW_ELEMENT = "add(%s)";
    public static final String REMOVE_NEW_ELEMENT = "remove(%s)";

    public static final String STATIC_CONTENT = "" +
            "import java.util.HashSet;\n" +
            "import java.util.Objects;\n" +
            "\n" +
            "public class %s {\n" +
            "public static void main (String args[]){\n" +
            "try{\n" +
            "main_program();" +
            "} catch (Exception ex){" +
            "ex.printStackTrace();" +
            "}\n" +
            "}\n" +
            "\n" +
            "%s" +
            "\n" +
            "}" +
            "\n" +
            "class Element {\n" +
            "\n" +
            "    private final String data;\n" +
            "\n" +
            "    public Element(String data) {\n" +
            "        this.data = data;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return data;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public boolean equals(Object obj) {\n" +
            "        if (obj == this) {\n" +
            "            return true;\n" +
            "        }\n" +
            "        if (obj instanceof Element) {\n" +
            "            return ((Element) obj).data.equals(data);\n" +
            "        }\n" +
            "        return false;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public int hashCode() {\n" +
            "        return Objects.hash(data);\n" +
            "    }\n" +
            "\n" +
            "}\n" +
            "\n" +
            "class Set {\n" +
            "\n" +
            "    private final java.util.Set<Element> set = new HashSet<>();\n" +
            "\n" +
            "    public Set() {\n" +
            "    }\n" +
            "\n" +
            "    public boolean add(Element element) {\n" +
            "        return set.add(element);\n" +
            "    }\n" +
            "\n" +
            "    public boolean remove(Element element) {\n" +
            "        return set.remove(element);\n" +
            "    }\n" +
            "\n" +
            "    public int size() {\n" +
            "        return set.size();\n" +
            "    }\n" +
            "\n" +
            "    public void clear() {\n" +
            "        set.clear();\n" +
            "    }\n" +
            "\n" +
            "    public static Set union(Set s1, Set s2) {\n" +
            "        Set out = new Set();\n" +
            "        out.set.addAll(s1.set);\n" +
            "        out.set.addAll(s2.set);\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    public static Set intersection(Set s1, Set s2) {\n" +
            "        Set out = new Set();\n" +
            "        for (Element el : s1.set) {\n" +
            "            if (s2.set.contains(el)) {\n" +
            "                out.add(el);\n" +
            "            }\n" +
            "        }\n" +
            "        for (Element el : s2.set) {\n" +
            "            if (s1.set.contains(el)) {\n" +
            "                out.add(el);\n" +
            "            }\n" +
            "        }\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "    public static Set diff(Set s1, Set s2) {\n" +
            "        Set out = new Set();\n" +
            "        out.set.addAll(s1.set);\n" +
            "        for (Element el : s2.set) {\n" +
            "            if (s1.set.contains(el)) {\n" +
            "                out.remove(el);\n" +
            "            }\n" +
            "        }\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    public static Set simDiff(Set s1, Set s2) {\n" +
            "        Set out = new Set();\n" +
            "        out.set.addAll(s1.set);\n" +
            "        out.set.addAll(s2.set);\n" +
            "        for (Element el : s1.set) {\n" +
            "            if (s2.set.contains(el)) {\n" +
            "                out.remove(el);\n" +
            "            }\n" +
            "        }\n" +
            "        for (Element el : s2.set) {\n" +
            "            if (s1.set.contains(el)) {\n" +
            "                out.remove(el);\n" +
            "            }\n" +
            "        }\n" +
            "        return out;\n" +
            "    }\n" +
            "\n" +
            "    @Override\n" +
            "    public String toString() {\n" +
            "        return set.toString();\n" +
            "    }\n" +
            "}\n";
}
