from selenium import webdriver
from selenium.webdriver.chrome.service import Service  # 新增
from selenium.webdriver.common.by import By
import time


def main():
    service = Service(executable_path='./chromedriver_win32/chromedriver.exe')
    driver = webdriver.Chrome(service=service)
    driver.get('https://demoqa.com/automation-practice-form')

    time.sleep(0.5)
    driver.quit()
    print("Task3 Test Success!")


if __name__ == "__main__":
    main()
