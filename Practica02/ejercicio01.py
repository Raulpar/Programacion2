from multimethod import multimethod
import math

class MiPunto:
    
    def __init__(self, x=0.0, y=0.0):
        self.__x = x
        self.__y = y

    def getX(self):
        return self.__x

    def getY(self):
        return self.__y

    @multimethod
    def distancia(self, p: 'MiPunto'):
        return math.sqrt((p.__x - self.__x)**2 + (p.__y - self.__y)**2)

    # Acepta float
    @multimethod
    def distancia(self, x: float, y: float):
        return math.sqrt((x - self.__x)**2 + (y - self.__y)**2)

    # Acepta int
    @multimethod
    def distancia(self, x: int, y: float):
        return math.sqrt((x - self.__x)**2 + (y - self.__y)**2)

    @multimethod
    def distancia(self, x: float, y: int):
        return math.sqrt((x - self.__x)**2 + (y - self.__y)**2)

    @multimethod
    def distancia(self, x: int, y: int):
        return math.sqrt((x - self.__x)**2 + (y - self.__y)**2)


# Uso correcto
class Main():
    p1 = MiPunto()
    p2 = MiPunto(10, 30.5)

    print("Distancia objeto:", p1.distancia(p2))
    print("Distancia coordenadas:", p1.distancia(10, 30.5))