from selenium import webdriver
from selenium.webdriver.chrome.service import Service  # 新增
from selenium.webdriver.common.by import By
import time


def main():
    service = Service(executable_path='./chromedriver_win32/chromedriver.exe')
    driver = webdriver.Chrome(service=service)

    first_name = "Sherlock"
    last_name = "Holmes"
    correct_email = "example@example.com"
    correct_mobile = "1234567890"
    wrong_email = "123456"
    wrong_mobile = "abcdefg"
    driver.get('https://demoqa.com/automation-practice-form')
    driver.find_element(By.ID, "firstName").send_keys(first_name)
    driver.find_element(By.ID, "lastName").send_keys(last_name)
    driver.find_element(By.ID, "userEmail").send_keys(wrong_email)
    driver.find_element(By.XPATH, "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label").click()
    driver.find_element(By.ID, "userNumber").send_keys(wrong_mobile)
    driver.find_element(By.XPATH, "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]/label").click()

    button = driver.find_element(By.ID, "submit")
    driver.execute_script("$(arguments[0]).click()", button)

    email_color = driver.find_element(By.ID, "userEmail").value_of_css_property("border-bottom-color")
    mobile_color = driver.find_element(By.ID, "userNumber").value_of_css_property("border-bottom-color")
    print(email_color)
    print(mobile_color)

    driver.refresh()
    driver.find_element(By.ID, "firstName").send_keys(first_name)
    driver.find_element(By.ID, "lastName").send_keys(last_name)
    driver.find_element(By.ID, "userEmail").send_keys(correct_email)
    driver.find_element(By.XPATH,
                        "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[1]/label").click()
    driver.find_element(By.ID, "userNumber").send_keys(correct_mobile)
    driver.find_element(By.XPATH,
                        "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[2]/div[1]/label").click()

    button = driver.find_element(By.ID, "submit")
    driver.execute_script("$(arguments[0]).click()", button)
    message = driver.find_element(By.ID, "example-modal-sizes-title-lg").text
    print(message)
    time.sleep(0.5)
    assert message == "Thanks for submitting the form"
    driver.quit()
    print("Task3 Test Success!")


if __name__ == "__main__":
    main()
