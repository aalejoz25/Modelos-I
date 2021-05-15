'''
Created on 23/07/2019

@author: Alvaro
'''

import pygame
import time, math, random
import sys
from fabricas import FabricaUSA, FabricaFrancia, FabricaUK


     
class catalogo:    
    
    
    def __init__(self):
        
        
        pygame.init()

        screen = pygame.display.set_mode((411,514))
        pygame.display.set_caption("Catalogo de aviones")   
        Fuente=pygame.font.SysFont("Algerian", 30)  
        Text = Fuente.render("SELECCIONA UN PAIS",0,(0,0,128))  
           
        background_image = pygame.image.load('images/Initbg.jpg')
        USAflag = pygame.image.load('images/Flags/USAFlag.jpg')
        UKflag = pygame.image.load('images/Flags/UKFlag.jpg')
        Franceflag = pygame.image.load('images/Flags/FranceFlag.jpg')     
        screen.blit(background_image, (0, 0))  
        screen.blit(USAflag, (130, 90))   
        screen.blit(UKflag, (130, 216))   
        screen.blit(Franceflag, (130, 352))   
        screen.blit(Text,(60,20))
        pygame.display.flip()
    
        ejecutando = True
       
        while ejecutando:
            for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    ejecutando = False
                    sys.exit() 
                
            fabrica = FabricaUSA()       
            pressed_array = pygame.mouse.get_pressed()  
            for i in range(len(pressed_array)):
                if pressed_array[i]:
                    if i == 0:                            
                        pos = pygame.mouse.get_pos()
                        if pos[0]>=130 and pos[0]<=276 and pos[1]>=90 and pos[1]<=176:
                            fabrica = FabricaUSA()                                                                                                                                     
                        if pos[0]>=130 and pos[0]<=276 and pos[1]>=216 and pos[1]<=302:
                            fabrica = FabricaUK()                                                           
                        if pos[0]>=130 and pos[0]<=276 and pos[1]>=352 and pos[1]<=438:
                            fabrica = FabricaFrancia()
                        if pos[0]>=40 and pos[0]<=90 and pos[1]>=400 and pos[1]<=450:
                            self.__init__()
                        if pos[0]>=320 and pos[0]<=390 and pos[1]>=400 and pos[1]<=450:
                            gameStart()
                            pygame.quit() 
                                                                                                                         
                        chasis = fabrica.crear_chasis()
                        proyectil = fabrica.crear_proyectil()
                        chasis.ubicar((142,130))
                        proyectil.ubicar((190,315))
                    
                        screen.blit(background_image, (0, 0))
                           
                        Fuente=pygame.font.SysFont("Algerian", 30)  
                        Text = Fuente.render("JUGARAS CON:",0,(0,0,128))
                        screen.blit(Text,(105,20)) 
                        chasis.dibujar(screen)
                        proyectil.dibujar(screen)     
                        bkbtn = pygame.image.load('images/back.png')
                        stbtn = pygame.image.load('images/start.png')
                        screen.blit(bkbtn, (40, 400))   
                        screen.blit(stbtn, (320, 400))  
                            
                                                     
                        pygame.display.update()                        
                        pygame.time.delay(10)   
 
    
    
    
                       
class Heroplane:

    def __init__(self,screen_temp):
        
        self.x = 200
        self.y = 600
        self.speed = 10        
        
       
        self.screen=screen_temp
        
        self.image=pygame.image.load('images/Francia/Franceairplane.png')
        
        self.bullet_list = []    

      
    def display(self):
        
        
        for b in self.bullet_list:
            display(b)
            if b.move():
                self.bullet_list.remove(b)
        
        display(self)
    
    def move_left(self):
        
        if self.x >= 20:
            self.x -= self.speed
    
    def move_right(self):
        
        if self.x <= 380:
            self.x += self.speed
            

    def move_up(self):
            
            if self.y >= 20:
                self.y -= self.speed    

    def move_down(self):
            
            if self.y <= 580:
                self.y += self.speed
                
    def fire(self):
        
        self.bullet_list.append(Bullet(self.screen,self.x,self.y))
        
class Bullet:
    
    
    def __init__(self,screen_temp,x,y):
        
        
        self.x = x + 45;
        self.y = y
        self.speed = 10
        
        self.screen = screen_temp
       
        self.image = pygame.image.load('./images/Francia/Franceproyectil.png')
    
    def move(self):
       
        self.y -= self.speed
        if self.y <= 20:
            return True
        
class EnemyPlane:
   
    def __init__(self,screen_temp):
        
        self.x = random.choice(range(408))
        self.y = -75
       
        self.HP=10
        
        self.screen=screen_temp
        
        self.image=pygame.image.load('./images/e'+str(random.choice(range(0,2)))+'.png')
       
        self.bullet_list = []

    def move(self,hero):
        
        self.y += 4
        
        for b in hero.bullet_list:
            if b.x>self.x+6 and b.x<self.x+98 and b.y>self.y+16 and b.y<self.y+64:
                self.HP-=1
                hero.bullet_list.remove(b)
                if self.HP<=0:
                    return True

class EnemyBullet:
    
  
    def __init__(self,screen_temp,x,y,hero):
       
      
        self.x = x+53
        self.y = y+74
        self.speed=1.2
     
        self.angx=hero.x+53-self.x
        self.angy=hero.y+38-self.y
       
        self.screen=screen_temp
       
        self.image=pygame.image.load('./images/epd.png')

    def move(self,hero):
        
        self.x += self.angx*self.speed/math.sqrt(self.angx**2+self.angy**2)
        self.y += self.angy*self.speed/math.sqrt(self.angx**2+self.angy**2)
        if self.y<=-20 or self.y>=700 or self.x<=-20 or self.x>=512:
            return 1
        elif self.x>hero.x and self.x<hero.x+106 and self.y+30>hero.y+15 and self.y+30<hero.y+42:
            return 2

def key_control(hero):   
   
    
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            print("exit()")
            exit()
            pygame.quit()
   
    pressed_keys = pygame.key.get_pressed()
    
    if pressed_keys[pygame.K_LEFT] or pressed_keys[pygame.K_a]:
        hero.move_left()
    elif pressed_keys[pygame.K_RIGHT] or pressed_keys[pygame.K_d]:
        hero.move_right()
        
    if pressed_keys[pygame.K_UP] or pressed_keys[pygame.K_w]:
        hero.move_up()
    elif pressed_keys[pygame.K_DOWN] or pressed_keys[pygame.K_s]:
        hero.move_down()
    
    
    if pressed_keys[pygame.K_SPACE]:
        hero.fire()
        
        
def display(obj):
  
    obj.screen.blit(obj.image,(obj.x,obj.y))
    

def gameStart():
    
    screen = pygame.display.set_mode((512,700),0,0)
    pygame.display.set_caption('Airplanes WW2')
    
    
    back = random.choice(['0','2'])
    background = pygame.image.load("./images/bg"+str(back)+".jpg")
    
  
    hero = Heroplane(screen)
    
    
    m = -836
    
   
    enemy_list = []
    
  
    enemybullet_list = []
    
    
    
    
    die = False
    
    while True:
          
            screen.blit(background,(0,m))
            m += 2
            if m >= -68:
                m =- 836
            
           
            key_control(hero)
            
       
            if die:
                screen.blit(pygame.image.load('./images/gameover.png'), (131, 175))
                screen.blit(pygame.image.load('./images/restart.png'), (100, 450))
                screen.blit(pygame.image.load('./images/quit.png'), (310, 450))
                screen.blit(pygame.image.load('./images/menu.png'), (205, 500))
               
                pressed_array = pygame.mouse.get_pressed()
                for i in range(len(pressed_array)):
                    if pressed_array[i]:
                        if i == 0:
                            pos = pygame.mouse.get_pos()
                            if pos[0]>=100 and pos[0]<=204 and pos[1]>=450 and pos[1]<=477:
                                
                                die=0
                                hero.x=200
                                hero.y=600
                                enemy_list.clear()
                                enemybullet_list.clear()
                                hero.bullet_list.clear()
                            elif pos[0]>=345 and pos[0]<=412 and pos[1]>=443 and pos[1]<=481:
                                exit()
                                pygame.quit()
                                
                            elif pos[0]>=205 and pos[0]<=312 and pos[1]>=500 and pos[1]<=539:
                                cat = catalogo()
                                pygame.quit()
            else:
                hero.display()
            
            if die == False:
                
                if random.choice(range(50)) == 14:
                    Enemy=EnemyPlane(screen)
                    enemy_list.append(Enemy)
             
                for e in enemy_list:
                    display(e)
                   
                    if e.y >= 150:
                        if random.choice(range(50)) == 14:
                            enemybullet_list.append(EnemyBullet(screen,e.x,e.y,hero))
                  
                    if e.move(hero):
                        for i in range(0,4):
                            for j in range(10):
                                screen.blit(pygame.image.load('./images/bomb' + str(i) + '.png'), (e.x,e.y))
                        enemy_list.remove(e)
                    if e.y >= 700:
                        enemy_list.remove(e)
                 
                    if(e.x > hero.x and e.x < hero.x + 160 and e.y +30>hero.y+15 and e.y+30<hero.y+42)or (e.x+104>hero.x and e.x+104<hero.x+106 and e.y+30>hero.y+15 and e.y+30<hero.y+42)or (e.x>hero.x and e.x<hero.x+106 and e.y+62>hero.y+15 and e.y+62<hero.y+42)or (e.x+104>hero.x and e.x+104<hero.x+106 and e.y+62>hero.y+15 and e.y+62<hero.y+42):
                        for i in range(0, 4):
                            for j in range(10):
                                screen.blit(pygame.image.load('./images/bomb' + str(i) + '.png'), (e.x, e.y))
                                screen.blit(pygame.image.load('./images/bomb' + str(i) + '.png'), (hero.x, hero.y))
                        enemy_list.remove(e)
                        die=1
                
                    for eb in enemybullet_list:
                        display(eb)
                        if eb.move(hero)==1:
                            enemybullet_list.remove(eb)
                        elif eb.move(hero)==2:
                            for i in range(0, 4):
                                for j in range(10):
                                    screen.blit(pygame.image.load('./images/bomb' + str(i) + '.png'), (hero.x, hero.y))
                            enemybullet_list.remove(eb)
                            die = 1
            
            pygame.display.update()
            
       
          
           
            time.sleep(0.03)

