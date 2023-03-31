from selenium import webdriver
from selenium.webdriver.chrome.service import Service  # 新增
from selenium.webdriver.common.by import By
import time


def main():
    service = Service(executable_path='./chromedriver_win32/chromedriver.exe')
    driver = webdriver.Chrome(service=service)
    driver.get('https://the-internet.herokuapp.com/dynamic_content?with_content=static')
    time.sleep(1)
    raw_images = driver.find_element(By.XPATH, "/html/body/div[2]/div/div/div/div") \
        .find_elements(By.TAG_NAME, "img")
    print("raw image num is: ", len(raw_images))
    assert len(raw_images) == 3

    driver.find_element(By.CSS_SELECTOR, "#content > div > p:nth-child(3) > a").click()
    new_images = driver.find_element(By.XPATH, "/html/body/div[2]/div/div/div/div") \
        .find_elements(By.TAG_NAME, "img")
    print("new image num is: ", len(new_images))
    assert len(new_images) == 3
    assert new_images != raw_images

    time.sleep(0.5)
    driver.quit()
    print("Task5 Test Success!")


if __name__ == "__main__":
    main()
