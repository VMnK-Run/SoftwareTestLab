## Lab3 Major
### Tasks
1. Install Major Mutation Framework. The instruction of how to install
and use Major can be seen in
https://mutation-testing.org/tutorial.html
2. Coding a program named ‘UpgradedTriangle’. Given the length value
   (integer) of 3 sides of a triangle. Finish 2 functions respectively, a) classifying the triangle
   given 3 length of sides(integers), output the shape of triangle
   made up by given sides. (Output a String, the shape could be
   “SCALENE”,“EQUILATERAL”,“ISOSCELES”,“INVALID”.)
   b) calculating the area of valid triangle. given 3 length of sides(integers), if these 3 sides can make up a
   valid triangle, output the area of the triangle (double or float), otherwise, return 0. (reference : Heron's formula)
3. Write testing cases for 2 functions with Junit according to your
   previous study (MC/DC, boundary value, equivalence partitioning, etc.), guarantee the sufficiency and diversity of your test set. Each
   function should have 15 test cases.
4. Then run mutants on the test sets with Major Mutation Framework.
   In order for you to learn how to modify the build.xml file, please try
   to make the final file structure like follow:
5. Analyzing the report provided by Major. Calculate these values: - The number of mutants generated
- The number of mutants covered by the test suite
- The number of mutants killed by the test suite
- The number of live mutants
- The overall mutation score / adequacy of the test suite
  Discuss and explain your results: (Here are some Viewpoints you could
  discuss) - What do the results tell you about your test suite?
- Does the test suite exhibit weaknesses? How can it be improved?
- Does the test suite exhibit strengths? How do you recognize them?
- Do you have any other interesting insights or opinions on the
  experience?
- Among the generated mutants, If both killed and unkilled mutants were
  generated, what was the type of operator used? How was it applied to
  the code (how did the code change)?
6. - According to your mutation analysis result, which part of the source
     code need to be strengthened in further coding? Which test case in
     your suite are more important compared with others.