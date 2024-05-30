# Description

This app converts Markdown syntax into corresponding HTML and Ansi tags . It identifies paragraphs and reformatted sections of text, replacing them with the appropriate tags, and also recognizes bold, italic and monospaced text.

## How to run this program?

You must have JDK17 or higher installed.

1. Clone this repository using the command:
```
git clone https://github.com/Lamarrrk/Unit-Tests-CI-Lab2.git
```

2. Open terminal and go to src\main\org\example directory using the command:
```
cd src\main\java\org\example
```

3. Compile Java code to make sure application will work correctly using the command:
```
javac Main.java
```

4. To make working with the program easier, i added example files (such as exampleIn.txt, exampleOut.ansi and exampleOut.html). For converting Markdown to HTML into file, you can use this command:

```
java Main exampleIn.txt exampleOut.html --format html
```

For converting Markdown to HTML into console, you can use this command:

```
java Main.java exampleIn.txt - --format html
```

For converting Markdown to Ansi into console, you can use this command:

```
java Main.java exampleIn.txt - --format ansi
```

For converting Markdown to Ansi into file, you can use this command:

```
java Main.java exampleIn.txt exampleOut.ansi --format ansi
```

To use unit tests, you can use this command:

```
./gradlew test
```

# Thank you for using this application!

Here you can follow the link to see revert commit: [https://github.com/Lamarrrk/Unit-Tests-CI-Lab2/commit/ae36b888ab45e3895d7e2040ac04cff6d96604f1](https://github.com/Lamarrrk/Unit-Tests-CI-Lab2/commit/ae36b888ab45e3895d7e2040ac04cff6d96604f1)
