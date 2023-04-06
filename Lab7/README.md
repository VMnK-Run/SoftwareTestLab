## Lab7 JMeter
### Tasks:
1. Download JMeter: The first thing you need to download is JMeter. You can download the latest version of JMeter from its official website, http://jmeter.apache.org 
2. Create a test plan: Open JMeter and create a new test plan named "Lab7". 
3. Test the website http://demo.opencart.com with the following requirements: 
   + Simulate 10 people to perform the operation, and repeat 5 times 
   + Simulated user login：http://demo.opencart.com/index.php?route=account/login 
   + The simulated user waits for 100 milliseconds 
   + Simulate the user browsing the product：http://demo.opencart.com/index.php?route=prod uct/product&product_id=43 
   + The simulated user waits for 300 milliseconds 
   + Simulated user exit：http://demo.opencart.com/index.php?route=account/logout 
4. Use cmd to execute the test plan and generate the web page 
5. Choose another website to test similar design，for example：https://www.demoblaze.com、htt ps://www.phptravels.net
