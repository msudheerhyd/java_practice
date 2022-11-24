from bs4 import BeautifulSoup
import requests

html_text = requests.get('https://www.naukri.com/python-jobs?k=python').text
soup = BeautifulSoup(html_text, 'lxml')
jobs = soup.find_all('div', class_='list')
print(jobs)

