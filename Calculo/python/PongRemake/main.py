from re import X
from bar import Bar
import pygame
from sys import exit 

pygame.init()

SCREEN_WIDTH = 1000
SCREEN_HEIGTH = 600

screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGTH))
pygame.display.set_caption("Brawler")

#BackGround
bg_image = pygame.image.load("back3.png").convert_alpha()

def draw_bg():
    # Deixando imagem certinha
    scaled_bg = pygame.transform.scale(bg_image, (SCREEN_WIDTH, SCREEN_HEIGTH))
    screen.blit(scaled_bg, (0,0))



player_rigth = Bar(100)
player_left = Bar(900)

run = True

while run:

    draw_bg()
    
    player_left.move_left(SCREEN_HEIGTH)
    player_rigth.move_rigth(SCREEN_HEIGTH)

    player_rigth.draw(screen)
    player_left.draw(screen)


    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False

    #update display
    pygame.display.update()

    
    

pygame.quit()