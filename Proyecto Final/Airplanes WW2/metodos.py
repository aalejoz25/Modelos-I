'''
Created on 23/07/2019

@author: Alvaro
'''
import pygame


def cargar_imagen(nombre, optimizar=False):
    imagen = pygame.image.load(nombre)

    if optimizar:
        return imagen.convert()
    else:
        return imagen.convert_alpha()