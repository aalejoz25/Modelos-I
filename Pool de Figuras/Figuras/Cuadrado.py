'''
Created on 13/05/2019

@author: Alvaro
'''


class Cuadrado(object):
    '''
    classdocs
    '''
    __disponibilidadcuadrado = True

    def __init__(self):
        '''
        Constructor
        '''
        self.__nombre = "x"
    
    def getDisponibilidadCuadrado(self):
        return self.__disponibilidadcuadrado
    
    def setDisponibilidadCuadrado(self, disponibilidadcuadrado):
        self.__disponibilidadcuadrado = disponibilidadcuadrado

    def getNombre(self):
        return self.__nombre    
