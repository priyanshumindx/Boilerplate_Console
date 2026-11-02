package BoilerplateConsole;
public class CodeGenerator {
    public String generate(ClassDefinition definition) {
        StringBuilder code = new StringBuilder();
        String packageName = definition.getPackageName();

        if (packageName != null && !packageName.isBlank()) {

            code.append("package ").append(packageName).append(";\n\n");
        }

        code.append("public class ").append(definition.getClassName()).append(" {\n\n");

        for (Attribute attribute : definition.getAttributes()) {

            code.append("    private ").append(attribute.getType()).append(" ").append(attribute.getName()).append(";\n");
        }

        code.append("\n}");

        return code.toString();
    }
}

