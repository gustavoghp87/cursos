from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time

# driver = webdriver.Chrome()   system path
driver = webdriver.Chrome(executable_path=r"C:\Users\g\Desktop\Selenium\chromedriver.exe")
driver.maximize_window()

driver.get("http://www.python.org")
assert "Python" in driver.title

elem = driver.find_element(By.NAME, "q")
elem.clear()
elem.send_keys("pycon")
elem.send_keys(Keys.RETURN)
assert "No results found." not in driver.page_source

time.sleep(2)

driver.get("https://testappautomation.herokuapp.com/")
assert "Homme Page" in driver.title
loginButton = driver.find_element(By.ID, "loginBTN")
loginButton.click()
assert "Log in to automationDemo" in driver.title

usernameInput = driver.find_element(By.ID, "username")
usernameInput.send_keys("user")
passwordInput = driver.find_element(By.ID, "password")
passwordInput.send_keys("password")
submitButton = driver.find_element(By.NAME, "action")
submitButton.click()

# driver.close()