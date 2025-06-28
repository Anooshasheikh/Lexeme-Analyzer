# Lexeme-Analyzer

## Description
The `LexemeAnalyzer` is a Java program that analyzes a given input string and categorizes each lexeme (word) into one of the following token types:
- **Keyword**: Reserved words in the language (e.g., `if`, `else`, `while`).
- **Identifier**: Valid variable or function names (e.g., `myVar`, `count`).
- **Unrecognized Lexeme**: Words that do not fit into the above categories.

## Features
- Detects keywords from a predefined list.
- Validates identifiers based on standard naming conventions (starts with a letter, followed by letters or digits).
- Ignores extra spaces in the input.
- Outputs a table of lexemes and their corresponding token types.

## Usage
1. **Compile the Program**:
   ```bash
   javac LexemeAnalyzer.java
   ```

2. **Run the Program**:
   ```bash
   java LexemeAnalyzer
   ```

3. **Enter Input**:
   - When prompted, enter a line of text containing lexemes (words) separated by spaces.
   - Example input:
     ```
     if x 123 else myVar
     ```

4. **View Output**:
   - The program will display a table with each lexeme and its token type.
   - Example output for the input above:
     ```
     LEXEME    TOKEN NAME
     ------    ----------
     if        Keyword
     x         Identifier
     123       ERROR: Unrecognized Lexeme
     else      Keyword
     myVar     Identifier
     ```

## Code Structure
- **`isKeyword(String word)`**: Checks if the given word is a keyword.
- **`isIdentifier(String word)`**: Validates if the word is a legal identifier.
- **`isLetter(char c)`**, **`isDigit(char c)`**, **`isLetterOrDigit(char c)`**: Helper methods for character validation.
- **`main(String[] args)`**: Handles user input, processes lexemes, and prints the results.

## Keywords Recognized
The program recognizes the following keywords:
- `if`
- `else`
- `do`
- `while`
- `for`
- `class`
- `int`
- `foat` (Note: Likely a typo for `float`)

## Example
### Input:
```
for i in 10 class MyClass
```

### Output:
```
LEXEME    TOKEN NAME
------    ----------
for       Keyword
i         Identifier
in        Identifier
10        ERROR: Unrecognized Lexeme
class     Keyword
MyClass   Identifier
```

## Notes
- The program does not handle special characters or symbols (e.g., `+`, `-`, `*`).
- Identifiers are case-sensitive (e.g., `myVar` and `MyVar` are treated as different identifiers).
- Extra spaces in the input are ignored.
