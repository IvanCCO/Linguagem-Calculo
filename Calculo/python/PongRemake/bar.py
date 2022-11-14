import pygame

class Bar:

    def __init__(self, x):
        self.rect = pygame.Rect((x,50), (20, 120))

    def draw(self, surface):
        pygame.draw.rect(surface, (255,255,255), self.rect)

    def move_left(self, max_h):

        max_h -= self.rect.height
        SPEED = 2
        dy = 0

        key = pygame.key.get_pressed()

        if key[pygame.K_w]:
            dy = -SPEED
        if key[pygame.K_s]:
            dy = +SPEED

        #Definindo y
        self.rect.y += dy

        if self.rect.y <= 0:
            self.rect.y = 0
        if(self.rect.y >= max_h):
            self.rect.y = max_h
    

    def move_right(self, max_h):

        max_h -= self.rect.height
        SPEED = 2
        dy = 0

        key = pygame.key.get_pressed()

        if key[pygame.K_UP]:
            dy = -SPEED
        if key[pygame.K_DOWN]:
            dy = +SPEED

        #Definindo y
        self.rect.y += dy

        if self.rect.y <= 0:
            self.rect.y = 0
        if(self.rect.y >= max_h):
            self.rect.y = max_h


# Eixo Y pra cima é 0 pra baixo é a altura máxima
# Eixo X pra esquerda 0 pra direita largura máxima
class Bola:

    def __init__(self, x,y, raio):
        self.x = x
        self.y = y
        self.raio = raio
        self.x_vel = 1
        self.y_vel = 1

    def draw(self, surface):
        pygame.draw.circle(surface, (255,255,255), (self.x, self.y), self.raio)
    
    def move(self):
        self.x += self.x_vel
        self.y += self.y_vel

    # Funciona
    def hold_ball_wall(self,max_heigth, max_width):
        # Sair do eixo y
        if self.y + self.raio >= max_heigth:
            self.y_vel *= -1
            # print(f"Y = {self.y}")
        elif self.y - self.raio <= 0:
            # print(f"Y = {self.y}")
            self.y_vel *= -1

        if self.x + self.raio >= max_width:
            self.x_vel *= -1
            # print(f"X = {self.x}")
        elif self.x - self.raio <= 0:
            self.x_vel *= -1
            # print(f"X = {self.x}")
    
    # Ok
    def touch_player_body(self, player):

        ball_comming_up = self.y + self.raio
        ball_comming_down = self.y - self.raio
        ball_comming = self.x + self.raio
        ball_comming_right = self.x - self.raio

        if ball_comming_up >= player.rect.y and ball_comming_up <= player.rect.y + player.rect.height or ball_comming_down >= player.rect.y and ball_comming_down <= player.rect.y + player.rect.height:
            if ball_comming == player.rect.x:
                self.y_vel *= -1
                self.x_vel *= -1
            elif ball_comming_right == player.rect.x + player.rect.width:
                self.y_vel *= -1
                self.x_vel *= -1

    def touch_player_head(self, player):

        ball_inside_x_middle = self.x >= player.rect.x and self.x <= (player.rect.x + player.rect.width)
        ball_inside_x_left = self.x + self.raio >= player.rect.x and self.x + self.raio <= (player.rect.x + player.rect.width)
        ball_inside_x_rigth = self.x - self.raio >= player.rect.x and self.x - self.raio <= (player.rect.x + player.rect.width)

        if(ball_inside_x_middle or ball_inside_x_left or ball_inside_x_rigth):
            if (self.y + self.raio) == player.rect.y or (self.y - self.raio) == (player.rect.y + player.rect.height):
                self.y_vel *= -1
                self.x_vel *= -1
                print("Entrou")
    
                
        



