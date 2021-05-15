'''
Created on 23/07/2019

@author: Alvaro
'''

from pygame.sprite import Sprite
from pygame import *
from metodos import *


    
class Proyectil(Sprite):
    def ubicar(self, pos):
        self.rect.x = pos[0]
        self.rect.y = pos[1]

    def dibujar(self, screen):        
        fuente = font.SysFont('Algerian', 30)
        texto = fuente.render(str(self.descripcion), 1, (255, 0, 0))
        screen.blit(self.imagen, self.rect)
        screen.blit(texto, (self.rect.x - 63, self.rect.y - 40))


class ProyectilUSA(Proyectil):
    def __init__(self):
        self.imagen = cargar_imagen('./images/USA/USAproyectil.png')
        self.descripcion = "Proyectil"
        self.rect = self.imagen.get_rect()

class ProyectilUK(Proyectil):
    def __init__(self):
        self.imagen = cargar_imagen('./images/UK/UKproyectil.png')
        self.descripcion = "Proyectil"
        self.rect = self.imagen.get_rect()

class ProyectilFrancia(Proyectil):
    def __init__(self):
        self.imagen = cargar_imagen('./images/Francia/Franceproyectil.png')
        self.descripcion = "Proyectil"
        self.rect = self.imagen.get_rect()

class Chasis():
    def ubicar(self, pos):
        self.rect.x = pos[0]
        self.rect.y = pos[1]

    def dibujar(self, screen):
        fuente = font.SysFont('Algerian', 30)
        texto = fuente.render(str(self.descripcion), 1, (255, 0, 0))
        screen.blit(self.imagen, self.rect)
        screen.blit(texto, (self.rect.x - -12, self.rect.y - 36))

class ChasisUSA(Chasis):
    def __init__(self):
        self.imagen = cargar_imagen('./images/USA/USAairplane.png')
        self.descripcion = "Avion"
        self.rect = self.imagen.get_rect()

class ChasisUK(Chasis):
    def __init__(self):
        self.imagen = cargar_imagen('./images/UK/UKairplane.png')
        self.descripcion = "Avion"
        self.rect = self.imagen.get_rect()

class ChasisFrancia(Chasis):
    def __init__(self):
        self.imagen = cargar_imagen('./images/Francia/Franceairplane.png')
        self.descripcion = "Avion"
        self.rect = self.imagen.get_rect()