package BoilerplateConsole;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== BOILERPLATE CODE GENERATOR ===");

        // Read class name
        System.out.print("Enter class name: ");
        String className = sc.nextLine();

        // Read package name
        System.out.print("Enter package name (optional): ");
        String packageName = sc.nextLine();

        // Create class definition
        ClassDefinition definition = new ClassDefinition(className, packageName);

        // Read attribute count
        System.out.print("How many attributes? ");
        int count = Integer.parseInt(sc.nextLine());

        // Read attributes
        for (int i = 1; i <= count; i++) {

            System.out.println("Attribute " + i);

            System.out.print("Enter attribute name: ");
            String name = sc.nextLine();

            System.out.print("Enter attribute type: ");
            String type = sc.nextLine();

            Attribute attribute = new Attribute(name, type);

            definition.addAttribute(attribute);
        }

        // Generate source code
        CodeGenerator generator = new CodeGenerator();

        String code = generator.generate(definition);

        System.out.println("\n=== GENERATED CODE ===");
        System.out.println(code);


        System.out.print("\nDo you want to save this as a .java file? (yes/no): ");

        String choice = sc.nextLine().trim();

        if (choice.equalsIgnoreCase("yes")) {

            try {
                Path path = Path.of(className + ".java");

                Files.writeString(path, code);

                System.out.println("File created successfully!");
                System.out.println("Location: " + path.toAbsolutePath());

            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage()
                );
            }

        } else {
            System.out.println("File not created.");
        }

    }
}
