import json
import urllib.request as urllib2


def get_webcrawler():
    
    url = 'http://ipinfo.io/json'
    response = urllib2.urlopen(url)
    data = json.load(response)
    
    return data

def get_ip_address():
    return get_webcrawler()['ip']

def get_city():
    return get_webcrawler()['city']

def get_country():
    return get_webcrawler()['country']  

def coordinates():

    coordinates_string = get_webcrawler()['loc']
    coordinates_split = coordinates_string.split(',')
    return coordinates_split

def get_latitude():
    return coordinates()[0]

def get_longitude():
    return coordinates()[1]
        

def insetzada():

    cpu_percent = psutil.cpu_percent()
    ram_percent = psutil.virtual_memory().percent
    disc = psutil.disk_usage("/").percent


    conexao = pymysql.connect(db='BDpoint', user='root', passwd='#Gf45297661870', port=3306)

    cursor = conexao.cursor()

    cursor.execute(f"INSERT INTO dados (idDados, usoRAM, usoCPU, usoDiscoLocal) VALUES (null, {cpu_percent}, {ram_percent}, {disc})")

    conexao.commit()

    conexao.close()

