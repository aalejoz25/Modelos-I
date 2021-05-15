'''
Created on 15/05/2019

@author: Alvaro
'''
from tkinter import * 
from Pool.Pooldefiguras import Poolfiguras

pool = Poolfiguras()

raiz = Tk()        
raiz.title("Pool de objetos")
raiz.resizable(0, 0)        
raiz.geometry("600x400")
raiz.config(bg="yellow")
        
frame = Frame()
frame.pack()
frame.config(bg="blue")
frame.config(width="600", height="400")
frame.config(cursor="hand2")
frame.config(relief="groove")
frame.config(bd=15)
        
Label(frame, text="SELECCIONE LA FIGURA QUE DESEA OBTENER", fg="white", bg="blue", font=("Algerian", 15)).place(x=80, y=10)


def obtenerTriangulo():
    pool.getTriangulo()

    
def obtenerCirculo():
    pool.getCirculo()

    
def obtenerCuadrado():
    pool.getCuadrado()
    
def liberarTriangulo():
    pool.liberarTraingulo()
    
def liberarCirculo():
    pool.liberarCirculo()

def liberarCuadrado():
    pool.liberarCuadrado()
    

botonTriangulo = Button(frame, text="Obtener Triangulo", command=obtenerTriangulo).place(x=40, y=150) 

botonCirculo = Button(frame, text="Obtener Circulo", command=obtenerCirculo).place(x=240, y=150)
       
botonCuadrado = Button(frame, text="Obtener Cuadrado", command=obtenerCuadrado).place(x=430, y=150)  

botonLiberarTriangulo= Button(frame, text="Liberar Triangulo", command=liberarTriangulo).place(x=40,y=250)

botonLiberarCirculo= Button(frame, text="Liberar Circulo", command=liberarCirculo).place(x=240,y=250)

botonLiberarCuadrado= Button(frame, text="Liberar Cuadrado", command=liberarCuadrado).place(x=430,y=250)
        
raiz.mainloop()
