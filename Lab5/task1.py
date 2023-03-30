from selenium import webdriver
from selenium.webdriver import Keys
from selenium.webdriver.chrome.service import Service  # 新增
from selenium.webdriver.common.by import By
import time


def main():
    service = Service(executable_path='./chromedriver_win32/chromedriver.exe')
    # Open the web browser and navigate to the login page
    driver = webdriver.Chrome(service=service)
    driver.get("https://www.google.com/")
    # Enter a valid username and password
    driver.find_element(By.CLASS_NAME, "gLFyf").send_keys("selenium")
    driver.find_element(By.CLASS_NAME, "gLFyf").send_keys(Keys.ENTER)
    search_results = driver.find_elements(By.CSS_SELECTOR, "div.g")
    num = len(search_results)
    assert num >= 10
    selenium_item = search_results[0]
    url = selenium_item.find_element(By.CSS_SELECTOR, "a").get_attribute("href")
    print("first search result link is: ", url)
    assert url == "https://www.selenium.dev/"
    search_box = driver.find_element(By.XPATH, "/html/body/div[4]/div[2]/form/div[1]/div[1]/div[2]/div/div[2]/input")
    content = search_box.get_attribute("value")
    print(content)
    assert content == "selenium"
    time.sleep(1)
    driver.quit()


if __name__ == "__main__":
    main()
