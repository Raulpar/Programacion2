from multimethod import multimethod

class AlgebraVectorial:
    
    def __init__(self, x: float, y: float):
        self.__x = x
        self.__y = y

    # 🔹 Producto punto con otro objeto
    @multimethod
    def productoPunto(self, v: 'AlgebraVectorial'):
        return self.__x * v.__x + self.__y * v.__y

    # 🔹 Producto punto con coordenadas
    @multimethod
    def productoPunto(self, x: float, y: float):
        return self.__x * x + self.__y * y

    # 🔹 Perpendicular con objeto
    @multimethod
    def esPerpendicular(self, v: 'AlgebraVectorial'):
        return self.productoPunto(v) == 0

    # 🔹 Perpendicular con coordenadas
    @multimethod
    def esPerpendicular(self, x: float, y: float):
        return self.productoPunto(x, y) == 0

    # 🔹 Paralelo con objeto
    @multimethod
    def esParalelo(self, v: 'AlgebraVectorial'):
        return self.__x * v.__y == self.__y * v.__x

    # 🔹 Paralelo con coordenadas
    @multimethod
    def esParalelo(self, x: float, y: float):
        return self.__x * y == self.__y * x


# 🔹 Clase principal
class Main():
    v1 = AlgebraVectorial(2.0, 3.0)
    v2 = AlgebraVectorial(4.0, 6.0)

    print("Producto punto:", v1.productoPunto(v2))
    print("Perpendicular:", v1.esPerpendicular(v2))
    print("Paralelo:", v1.esParalelo(v2))
    print("Perpendicular (coords):", v1.esPerpendicular(3.0, -2.0))