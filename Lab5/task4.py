from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By
import time


def main():
    service = Service(executable_path='./chromedriver_win32/chromedriver.exe')
    driver = webdriver.Chrome(service=service)
    driver.get('https://www.tju.edu.cn')
    print(driver.current_url)
    assert driver.current_url == 'https://www.tju.edu.cn/'
    time.sleep(1)

    driver.find_element(By.XPATH, "/html/body/header/div[1]/div/div[1]/ul/li[1]/a").click()  # 点击考生
    print(driver.current_url)
    assert driver.current_url == "https://www.tju.edu.cn/td/ks.htm"
    time.sleep(1)

    driver.find_element(By.XPATH, "/html/body/header/div[1]/div/div[1]/ul/li[2]/a").click()  # 点击学生
    print(driver.current_url)
    assert driver.current_url == "https://www.tju.edu.cn/td/xs.htm"
    time.sleep(1)

    driver.find_element(By.XPATH, "//html/body/header/div[3]/div/a/img").click()  # 回主界面
    print(driver.current_url)
    assert driver.current_url == "https://www.tju.edu.cn/"
    time.sleep(1)

    driver.back()  # 回退上个页面
    print("back to: " + driver.current_url)
    assert driver.current_url == "https://www.tju.edu.cn/td/xs.htm"
    time.sleep(1)

    driver.back()
    print("back to: " + driver.current_url)
    assert driver.current_url == "https://www.tju.edu.cn/td/ks.htm"
    time.sleep(1)

    driver.forward()
    print("forward to: " + driver.current_url)
    assert driver.current_url == "https://www.tju.edu.cn/td/xs.htm"
    time.sleep(1)

    driver.quit()
    print("Task4 Test Success!")


if __name__ == "__main__":
    main()
