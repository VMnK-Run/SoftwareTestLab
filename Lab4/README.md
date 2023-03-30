## Lab4 Pytest
### Tasks
1. **Install pytest testing framework.**

2. **Implement the two functions** mentioned in Lab3 in Python

3. **Design test cases for these functions** according to your previous study (MC/DC, boundary value, equivalence partitioning, etc.), guarantee the sufficiency and diversity of your test set

   **Design setup and teardown functions with pytest and figure out their execution order**

   + setup_function、teardown_function 
   + setup_class、teardown_class 
   + setup_method、teardown_method

   **Design test functions with mark :**

   + pytest.mark.skip (reason=None) ⽆条件跳过测试⽤例 
   + pytest.mark.skipif (condition, *, reason=None) 如果条件为真，则跳过测试⽤ 例
   + pytest.mark.xfail(condition=None, *, reason=None, raises=None, run=True, strict=False) 将测试⽤例标记为预期失败

4. Conventions for pytest test discovery

   + your test files should be named 'test\_\*.py' or '\*\_test.py' 
   + From those test files, pytest collect test items: 
     + test prefixed test functions or methods outside of class (test_) test prefixed 
     + test functions or methods inside Test prefixed test classes (without an __init__ method) (Class Test*)

5. **Analyse the report provided by pytest. Collect these informations**

   + The number of test cases executed 
   + The number of failed test cases and their reason
   + The execution order of setup and teardown functions 
   + The function of mark

   **Use pytest plugins to manage your testing process and gather your testing results**

   + pytest-html ⽣成html报告 
   + pytest-timeout 限制超时时间