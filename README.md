What user stories are completed in this iteration?
  For this iteration, as discussed with the professor, our group focused mainly on refactoring our code following clean code guidelines and to work on improving our project based on feedback. (1) Testing: We added significantly more testing for our methods. (2) Repository Structure: We followed repository structure guidelines and used a Development Branch as well as individual feature branches. When each feature was complete, we merged into Development and closed the feature branch. We did not push directly to main. (3) Project Organization: We fixed our Kanban Board to contain properly formatted user stories. We also converted all tasks into issues, closed each issue when the task was completed, and used the assignee functionality to track which group member did what. (4) Code Cleanliness: Most of our efforts for this iteration where spent here. We created a second class called password and separated the material into more files as suggested. Most of the methods were revamped to me simpler and follow the Rule of 20 discussed in class. (5) Functionality: Functionality for this iteration remained the same.


Is there anything that you implemented but doesn't currently work?
  No 

What commands are needed to compile and run your code from the command line (or better yet, provide a script that people can use to run your program!)
  The current command to run the program is giving a number for the length of the password and optionally adding any required charachters. For example if you want a password length of 8 you would type: java randomPassword.passwordGenerator 8
  if you wanted a password of length 9 and contained "!" you would type java randomPassword.passwordGenerator 9 !
  There is also a supplementary command "help" that prints out a useful message on how to run the program properly.
  Important: Make sure after compiling to run the program from the class folder and not where the java file is. (Run from the src folder)

  Finally, we have also included a script that runs a couple of these commands. The script does not compile the program for you. Remember to compile the program using:
  javac password.java passwordGenerator.java
