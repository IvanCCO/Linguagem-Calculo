# import json
# import urllib.request as urllib2


# def get_webcrawler():
    
#     url = 'http://ipinfo.io/json'
#     response = urllib2.urlopen(url)
#     data = json.load(response)
    
#     return data

# def get_ip_address():
#     return get_webcrawler()['ip']

# def get_city():
#     return get_webcrawler()['city']

# def get_country():
#     return get_webcrawler()['country']  

# def coordinates():

#     coordinates_string = get_webcrawler()['loc']
#     coordinates_split = coordinates_string.split(',')
#     return coordinates_split

# def get_latitude():
#     return coordinates()[0]

# def get_longitude():
#     return coordinates()[1]
        

# def insetzada():

#     cpu_percent = psutil.cpu_percent()
#     ram_percent = psutil.virtual_memory().percent
#     disc = psutil.disk_usage("/").percent


#     conexao = pymysql.connect(db='BDpoint', user='root', passwd='#Gf45297661870', port=3306)

#     cursor = conexao.cursor()

#     cursor.execute(f"INSERT INTO dados (idDados, usoRAM, usoCPU, usoDiscoLocal) VALUES (null, {cpu_percent}, {ram_percent}, {disc})")

#     conexao.commit()

#     conexao.close()

import time

import pygame

def linha(x):
    pygame.Rect((x, 180, 80, 180))


pygame.init()

SCREEN_WIDTH = 1000
SCREEN_HEIGTH = 600

screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGTH))
pygame.display.set_caption("Brawler")

bg_image = pygame.image.load("../Documentos/background2.jpg").convert_alpha()


#function for drawing background

def draw_bg():
    # Deixando imagem certinha
    scaled_bg = pygame.transform.scale(bg_image, (SCREEN_WIDTH, SCREEN_HEIGTH))
    screen.blit(scaled_bg, (0,0))

kybrd104 = [(1114.28,350),(1164.28,350),(1164.28,400),(1114.28,400),(1114.28,350)]

run = True
while run:

    draw_bg()
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False

    #update display
    pygame.display.update()

    pygame.draw.lines(screen, (255,255,0), False, [(150,300),(180,300)], 2)
    

pygame.quit()