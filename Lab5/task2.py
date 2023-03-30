from selenium import webdriver
from selenium.webdriver.chrome.service import Service  # 新增
from selenium.webdriver.common.by import By
import time


def main():
    service = Service(executable_path='./chromedriver_win32/chromedriver.exe')
    driver = webdriver.Chrome(service=service)
    driver.get('https://the-internet.herokuapp.com/login')
    correct_username = "tomsmith"
    correct_password = "SuperSecretPassword!"
    driver.find_element(By.ID, "username").send_keys(correct_username)
    driver.find_element(By.ID, "password").send_keys(correct_password)
    driver.find_element(By.CLASS_NAME, "radius").click()

    current_url = driver.current_url
    print("Current URL: " + current_url)
    assert current_url == "https://the-internet.herokuapp.com/secure"

    driver.find_element(By.XPATH, "/html/body/div[2]/div/div/a").click()
    current_url = driver.current_url
    assert current_url == "https://the-internet.herokuapp.com/login"
    logout_message = driver.find_element(By.ID, "flash").text
    logout_message = logout_message.split("\n")[0]
    print(logout_message)
    assert logout_message == "You logged out of the secure area!"

    driver.find_element(By.ID, "username").send_keys("wrong")
    driver.find_element(By.ID, "password").send_keys("wrong")
    driver.find_element(By.CLASS_NAME, "radius").click()

    wrong_message = driver.find_element(By.ID, "flash").text
    wrong_message = wrong_message.split("\n")[0]
    print(wrong_message)
    assert wrong_message == "Your username is invalid!"

    driver.find_element(By.ID, "username").send_keys("tomsmith")
    driver.find_element(By.ID, "password").send_keys("wrong")
    driver.find_element(By.CLASS_NAME, "radius").click()

    wrong_message = driver.find_element(By.ID, "flash").text
    wrong_message = wrong_message.split("\n")[0]
    print(wrong_message)
    assert wrong_message == "Your password is invalid!"

    time.sleep(0.5)
    driver.quit()
    print("Task2 Test Success!")


if __name__ == "__main__":
    main()
