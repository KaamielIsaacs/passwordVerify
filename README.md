Ah! I understand now — you want it completely plain, no code boxes, no markdown fences, ready to copy straight into a README.md or text file, without any formatting issues. Here’s a fully copy-paste-friendly version:

⸻

CSC212 Practical 1 – Password Verifier & Rhyme Processor

Student Details

Name: Kaamiel Isaacs
Student Number: 4129581
Course: CSC212
Year: 2023

⸻

Overview

This practical contains two Java programs demonstrating file handling, user input, and string validation: 1. Password Verifier (passwordVerify.java) – Validates user passwords against security rules. 2. Rhyme Processor (fileReader.java) – Reads a text file, numbers each line per verse, and outputs a new annotated file.

⸻

Question 1 – Password Verifier

File: Practical11.java

Description:
Prompts the user to enter a password and validates it using the following rules:
• Minimum length of 8 characters
• At least one uppercase letter
• At least one lowercase letter
• At least one digit
• At least one special character

How to Compile & Run:
javac passwordVerify.java
java passwordVerify

Input:
• User types a password into the console.

Output:
• Displays messages for any rules not met.
• Prints “Valid Password!” if all rules pass, otherwise “Invalid Password”.

⸻

Question 2 – Rhyme Processor

File: fileReader.java

Description:
Reads a text file Rhyme.txt, prints its contents to the console, and creates a new file rhyme2.txt with:
• Each non-empty line prefixed as [verse][lineNumber]
• Blank lines preserved, with the verse counter incremented
• Author details appended at the end

How to Compile & Run:
javac fileReader.java
java fileReader

Input:
• Rhyme.txt located in the same folder as the program.

Output:
• rhyme2.txt in the same folder, annotated with line and verse numbers and author info.

⸻

Notes
• Both programs use Java’s try-with-resources for proper resource management.
• passwordVerify uses regular expressions for password validation.
• fileReader uses BufferedReader and BufferedWriter with UTF-8 encoding for file I/O.

⸻
