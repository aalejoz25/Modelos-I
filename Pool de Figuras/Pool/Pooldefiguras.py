'''
Created on 13/05/2019

@author: Alvaro
'''

from Figuras.Circulo import Circulo
from Figuras.Triangulo import Triangulo
from Figuras.Cuadrado import Cuadrado


class Poolfiguras(object):
    '''
    classdocs
    '''
    __instance = None
    

    def __init__(self):
        '''
        Constructor
        '''
        self.__circulo = Circulo()
        self.__triangulo = Triangulo()
        self.__cuadrado = Cuadrado()     
        
          
        
    def __new__(cls):
        if Poolfiguras.__instance is None:
            Poolfiguras.__instance = object.__new__(cls)
        return Poolfiguras.__instance
    
    def getTriangulo(self):
        if (self.__triangulo.getDisponibilidadTriangulo()):
            print("asignando triangulo", self.__triangulo.getNombre())
            self.__triangulo.setDisponibilidadTriangulo(False)
            return self.__triangulo
        else:
            self.__triangulo.getDisponibilidadTriangulo() == False
            print("el triangulo esta ocupado")
      
    def liberarTraingulo(self):
        if self.__triangulo.getDisponibilidadTriangulo():
            print("el triangulo ya esta liberado")
        else:            
            print("liberando triangulo", self.__triangulo.getNombre())
            self.__triangulo.setDisponibilidadTriangulo(True) 
        
    def getCirculo(self):
        if (self.__circulo.getDisponibilidadCirculo()):
            print("asignando circulo", self.__circulo.getNombre())
            self.__circulo.setDisponibilidadCirculo(False)
            return self.__circulo
        else:
            self.__circulo.getDisponibilidadCirculo() == False
            print("el circulo esta ocupado")
      
    def liberarCirculo(self):
        print("liberando circulo", self.__circulo.getNombre())
        self.__circulo.setDisponibilidadCirculo(True) 
        
    def getCuadrado(self):
        if (self.__cuadrado.getDisponibilidadCuadrado()):
            print("asignando cuadrado", self.__cuadrado.getNombre())
            self.__cuadrado.setDisponibilidadCuadrado(False)
            return self.__cuadrado
        else:
            self.__cuadrado.getDisponibilidadCuadrado() == False
            print("el cuadrado esta ocupado")
      
    def liberarCuadrado(self):
        print("liberando cuadrado", self.__cuadrado.getNombre())
        self.__cuadrado.setDisponibilidadCuadrado(True)               
            
