import pygame

class Bar:

    def __init__(self, x):
        self.rect = pygame.Rect((x,50), (10, 150))

    def draw(self, surface):
        pygame.draw.rect(surface, (255,255,255), self.rect)

    def move_rigth(self, max_h):

        max_h -= self.rect.height
        SPEED = 1
        dy = 0

        key = pygame.key.get_pressed()

        if key[pygame.K_w]:
            dy = -SPEED
        if key[pygame.K_s]:
            print(self.rect.y)
            dy = +SPEED

        #Definindo y
        self.rect.y += dy

        if self.rect.y <= 0:
            self.rect.y = 0
        if(self.rect.y >= max_h):
            self.rect.y = max_h
    

    def move_left(self, max_h):

        max_h -= self.rect.height
        SPEED = 1
        dy = 0

        key = pygame.key.get_pressed()

        if key[pygame.K_UP]:
            dy = -SPEED
        if key[pygame.K_DOWN]:
            print(self.rect.y)
            dy = +SPEED

        #Definindo y
        self.rect.y += dy

        if self.rect.y <= 0:
            self.rect.y = 0
        if(self.rect.y >= max_h):
            self.rect.y = max_h





