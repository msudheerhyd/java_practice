import requests # pip3 install requests

downloadUrl = 'https://www.goal.com/en-in/fixtures/2022-11-15'

req = requests.get(downloadUrl)

#filename = req.url[downloadUrl.rfind('/')+1:]

filename = 'course.html'

with open(filename, 'wb') as f:
    for chunk in req.iter_content(chunk_size=8192):
        if chunk: 
            f.write(chunk)
            