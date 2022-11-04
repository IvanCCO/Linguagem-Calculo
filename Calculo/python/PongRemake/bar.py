import pygame

class Bar:

    def __init__(self, x):
        self.rect = pygame.Rect((x,50), (20, 120))

    def draw(self, surface):
        pygame.draw.rect(surface, (255,255,255), self.rect)

    def move_left(self, max_h):

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
    

    def move_right(self, max_h):

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
        elif self.y - self.raio <= 0:
            self.y_vel *= -1
        # Sair do eixo x
        if self.x + self.raio >= max_width:
            self.x_vel *= -1
        elif self.x - self.raio <= 0:
            self.x_vel *= -1

    # Método para bater nas barras e voltar
    def hold_ball_bar_left(self, player_left):

        # Esse if serve para verificar se a bolinha está entre as barras no sentido de altura
        if self.y >= player_left.rect.y and self.y <= (player_left.rect.y + player_left.rect.height):
            # Esse é no de Largura
            # Primeiro pega a bolinha inteira vindo da direita
            
            if (self.x - self.raio) == player_left.rect.x + player_left.rect.width:
                print("Entrouu")
                self.x_vel *= -1
                meio_y = player_left.rect.y + player_left.rect.height / 1
                diferenca_y = meio_y - self.y
                diminuir_velocidade = (player_left.rect.height/2) / 1
                y_vel = diferenca_y // diminuir_velocidade
                self.y_vel = -1 * y_vel

            elif (self.x + self.raio) == player_left.rect.x:
                print("Entrou")
                self.x_vel *= -1
                meio_y = player_left.rect.y + player_left.rect.height / 1
                diferenca_y = meio_y - self.y
                diminuir_velocidade = (player_left.rect.height/2) / 1
                y_vel = diferenca_y // diminuir_velocidade
                self.y_vel = -1 * y_vel

        return 0

    def hold_ball_bar_rigth(self, player_right):

        return 0
    
