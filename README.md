# ✍️ Character Counter Program

This Java program counts the occurrences of every character in an input string, including letters, numbers, spaces, and other special characters.

It uses a `LinkedHashMap` to maintain the insertion order of the characters, ensuring the output reflects the order in which the characters first appeared in the input string.

## 🛠️ Prerequisites

To run this code, you need:

* **Java Development Kit (JDK):** Version 8 or later.

## 🏃 How to Run

Follow these steps to compile and run the `CharacterCounter.java` file from your terminal.

### 1. Save the Code

clone this repository

git clone https://github.com/erif95/multi-bank-java-character-count.git

### 2. Compile the Code

Open your terminal or command prompt, navigate to the directory (cd to src) where you saved the file, and compile the code using the `javac` command:

first command : 
- javac CharacterCounter.java
second command : 

- java CharacterCounter

After that you can see the output

To change the testcase you can go to main files and change the string. you also can change from you IDE directly (intellij, eclipse or any IDE for java)

 String[] testCases = {
                "hello world",        // lowercase letters + space
                "programming",        // repeated letters
                "aaa",                // same letters
                "abcdef",             // unique letters
                "",                   // empty string
                "Hello World",        // uppercase + lowercase + space
                "12321",              // numbers
                "a b c a b c",        // letters with spaces
                "HhH h",              // uppercase vs lowercase + spaces
                "  ",                // only spaces
                "\t\n",               // tabs and newlines
                null                  // null input
        };

  
