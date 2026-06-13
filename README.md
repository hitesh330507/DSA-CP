# DSA-CP

A collection of competitive programming solutions and practice problems in Java and C++.

## Project Structure

- `*.java` - Java source files containing problem solutions.
- `*.cpp` - C++ source files containing problem solutions.
- `Main.java` - Example entry point for a generic problem solution.

## How to Use

### Run a Java file

1. Compile:
   ```bash
   javac FileName.java
   ```
2. Run:
   ```bash
   java FileName
   ```

Example:
```bash
javac Main.java
java Main
```

### Run a C++ file

1. Compile:
   ```bash
   g++ -std=c++17 FileName.cpp -O2 -o FileName
   ```
2. Run:
   ```bash
   ./FileName
   ```

Example:
```bash
g++ -std=c++17 A_Halloumi_Boxes.cpp -O2 -o A_Halloumi_Boxes
./A_Halloumi_Boxes
```

## Notes

- Many files are named after competitive programming problems and likely expect input from `stdin`.
- Adjust input/output handling as needed for your local test cases.

## Tips

- Use `javac` to compile Java source files individually.
- Use `g++` to build C++ solutions.
- When testing, redirect input from a file if needed:
  ```bash
  java Main < input.txt
  ```
  or
  ```bash
  ./A_Halloumi_Boxes < input.txt
  ```
