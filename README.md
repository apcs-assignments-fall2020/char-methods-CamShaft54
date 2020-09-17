# Char Methods Assignment

In this assignment, you'll be writing four methods to carry out some char operations. 

The first method is toLower(). This method changes an uppercase char to a lowercase char. The method takes a char as input; if the char is not an uppercase letter, it returns the char unchaged. Otherwise, it returns the lowercase equivalent of the uppercase letter. The method has the following signature: public static char toLower(char ch) {}

The second method is toUpper(). This method changes an lowercase char to a uppercase char. The method takes a char as input; if the char is not an lowercase letter, it returns the char unchaged. Otherwise, it returns the uppercase equivalent of the lowercase letter. The method has the following signature: public static char toUpper(char ch) {}

The third method is myToLowerCase(). This method is given a String as input and returns a copy of the String where all letters are now lowercase. Note: you're not allowed to just call the toLowerCase() method from Java. The method has the following signature: ppublic static String myToLowerCase(String str) {}

The final method is myToUpperCase(). This method is given a String as input and returns a copy of the String where all letters are now uppercase. Note: you're not allowed to just call the toUpperCase() method from Java. The method has the following signature: ppublic static String myToUpperCase(String str) {}

Hint: for the third and forth methods, you can start with an empty String "" and add chars to that String one at a time.

After writing the four methods and testing that they work, use Scanner in your main code to ask them for the String that they wanted to make lowercase/uppercase. Then, allow the user to choose which method to run. Finally, your code should output the resulting string. 

Remember the Scanner nextLine() method is useful for getting a String that contains spaces. 

Example of what your program may look like when it is being run:
```shell script
Please enter a String
THE ATHENIAN SCHOOL IS GREAT
What would you like to make your string lowercase or uppercase?
lowercase
Here is your string in lowercase: the athenian school is great
```

<br />
<br />

Add code to [MyMain.java](src/main/java/MyMain.java) to do the desired thing.

## Run your code with:
```shell script
make run
```

## Run your tests with:
```shell script
make test
```