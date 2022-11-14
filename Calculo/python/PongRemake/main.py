from re import X
from sys import exit

import bar
import pygame
from bar import Bar, Bola

pygame.init()

SCREEN_WIDTH = 1000
SCREEN_HEIGTH = 600
clock = pygame.time.Clock()
FPS = 60

screen = pygame.display.set_mode((SCREEN_WIDTH, SCREEN_HEIGTH))
pygame.display.set_caption("Brawler")

#BackGround
bg_image = pygame.image.load("back3.png").convert_alpha()

def draw_bg():
    # Deixando imagem certinha
    scaled_bg = pygame.transform.scale(bg_image, (SCREEN_WIDTH, SCREEN_HEIGTH))
    screen.blit(scaled_bg, (0,0))


player_left = Bar(100)
player_right = Bar(900)
bola = Bola(SCREEN_WIDTH // 2, SCREEN_HEIGTH // 2, 9)

run = True

while run:

    clock.tick(FPS)

    draw_bg()
    
    player_left.move_left(SCREEN_HEIGTH)
    player_right.move_right(SCREEN_HEIGTH)

    player_left.draw(screen)
    player_right.draw(screen)

    bola.draw(screen)
    bola.move()
    bola.hold_ball_wall(SCREEN_HEIGTH, SCREEN_WIDTH)
    bola.touch_player_body(player_left)
    bola.touch_player_body(player_right)
    bola.touch_player_head(player_left)
    bola.touch_player_head(player_right)

    # print(f"Posicao x da bola: {bola.x}\nPosicao y: {bola.y}\n Velocidade x Bola{bola.x_vel}\nVelocidade y {bola.y_vel}")


    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            run = False

    #update display
    pygame.display.update()

    
    

pygame.quit()