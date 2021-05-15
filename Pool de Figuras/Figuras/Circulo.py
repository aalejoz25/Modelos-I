'''
Created on 13/05/2019

@author: Alvaro
'''


class Circulo(object):
    '''
    classdocs
    '''
    __disponibilidadcirculo = True

    def __init__(self):
        '''
        Constructor    
        '''
        self.__nombre = "radio 1"
    
    def getDisponibilidadCirculo(self):
        return self.__disponibilidadcirculo
    
    def setDisponibilidadCirculo(self, disponibilidadcirculo):
        self.__disponibilidadcirculo = disponibilidadcirculo
        
    def getNombre(self):
        return self.__nombre    
        
