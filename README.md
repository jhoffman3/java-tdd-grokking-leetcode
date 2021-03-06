# java-tdd-grokking-leetcode
Solutions to LeetCode problems in Java with tests created using TDD 

This project was inspired by the GROKKING NOTES project https://gist.github.com/tykurtz/3548a31f673588c05c89f9ca42067bc4

The above project is a markdown file that maps several LeetCode problems to patterns for practice and study.

A copy of the above markdown source is included in this project (downloaded from github 2022-03-22): 

[grokking_to_leetcode.md](./grokking_to_leetcode.md)

This project is a set of Java solutions and tests for the problems using TDD practices. I recently had to study up for some interviewing and although 
these aren't the problems I would usually ask an application programmer to solve many employers fall back to these 
sorts of questions. I followed this pattern:

- Pick a problem from GROKKING NOTES
- Put the details into a failing test
- Follow TDD practices and attempt the solution for 30 minutes
- Review solutions that have been submitted on LeetCode for better suitability/complexity/performance etc. 
- Fully implement the selected solution to pass LeetCode tests
- Study & understand the solution until you can rapidly identify the appropriate pattern for solving the problem. 
- Practice coding solutions in an interview test scenario

In most cases this project attempts to structure classes such that a solution could be copy/pasted to Leetcode for
verification etc. However, that is not the main goal so in some cases the solution may make use of libraries not 
available in the Leetcode Runner. EG Lombok. 

### Layout

- Package names reflect pattern names from GROKKING NOTES where applicable
- Classname reflects problem name
- Solution comments, if any, are in comments in implementation class
- Problem details from LeetCode are in comments in the test source

### What this project does not do

There are often many correct ways to solve the same problem. However, interviewers are opinionated. Thus, some solutions offer the solution that the interviewer "wants" to see. 

While Big O complexity is important, not all solutions are fully optimized. Thus, when looking at solutions on leetcode and comparing them to other solutions, this projects selects the solution that we think best fits the goal of the interviewer, and is reasonably easy to recall while under the stress of a coding interview. YMMV.
### Roadmap
- keep adding problems/solutions until all GROKKING NOTES covered
- additional explanatory comments on the solutions
- update to Junit Jupiter

