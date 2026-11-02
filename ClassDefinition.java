package BoilerplateConsole;


import java.util.ArrayList;

public class ClassDefinition {

    private String className;
    private String packageName;
    private ArrayList<Attribute> attributes;

    public ClassDefinition(String className,
                           String packageName) {

        this.className = className;
        this.packageName = packageName;
        this.attributes = new ArrayList<>();
    }

    public void addAttribute(Attribute attribute) {
        attributes.add(attribute);
    }

    public String getClassName() {
        return className;
    }

    public String getPackageName() {
        return packageName;
    }

    public ArrayList<Attribute> getAttributes() {
        return new ArrayList<>(attributes);
    }
}

