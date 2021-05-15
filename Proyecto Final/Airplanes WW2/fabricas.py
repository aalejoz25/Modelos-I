'''
Created on 23/07/2019

@author: Alvaro
'''
from productos import *

class Fabrica:
    def crear_proyectil(self):
        pass

    def crear_chasis(self):
        pass    

class FabricaUSA(Fabrica):
    def crear_proyectil(self):
        return ProyectilUSA()

    def crear_chasis(self):
        return ChasisUSA()

class FabricaUK(Fabrica):
    def crear_proyectil(self):
        return ProyectilUK()

    def crear_chasis(self):
        return ChasisUK()

class FabricaFrancia(Fabrica):
    def crear_proyectil(self):
        return ProyectilFrancia()

    def crear_chasis(self):
        return ChasisFrancia()