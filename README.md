# StarPatterns

StarPatterns is a small Java/Maven project that prints a few basic ASCII star and shape patterns, including triangles and squares.

## Project Structure

- `src/main/java/org/example/Main.java` - menu-driven entry point
- `src/main/java/org/example/IncreasingTriangle.java` - prints an increasing triangle
- `src/main/java/org/example/DecreasingTriangle.java` - prints a decreasing triangle
- `src/main/java/org/example/RightSidedTriangle.java` - prints a right-sided triangle
- `src/main/java/org/example/FullTriangle.java` - prints a full triangle
- `src/main/java/org/example/Square.java` - prints a square

## Requirements

- Java 25
- Maven

## Build

From the project root, run:

```bash
mvn clean package
```

## Run

The current entry point is `src/main/java/org/example/Main.java`. It presents a menu and creates one of the pattern classes based on the selected option.

Note: `Main.java` currently defines a package-private `void main()` method instead of the standard `public static void main(String[] args)`. Because of that, the project is easiest to run directly from your IDE for now. If you want to launch it from the command line, update the method signature to the standard Java entry point first.

## Example Output

The pattern classes write directly to standard output and print their shapes using repeated characters and spaces.