'''
Created on 13/05/2019

@author: Alvaro
'''


class Triangulo(object):
    '''
    classdocs
    '''
    __disponibilidadtriangulo = True

    def __init__(self):
        '''
        Constructor
        '''
        
        self.__nombre = "equilatero"
    
    def getDisponibilidadTriangulo(self):
        return self.__disponibilidadtriangulo
    
    def setDisponibilidadTriangulo(self, disponibilidadtriangulo):
        self.__disponibilidadtriangulo = disponibilidadtriangulo
        
    def getNombre(self):
        return self.__nombre
