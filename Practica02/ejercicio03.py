from multimethod import multimethod
import math

class Vector3D:
    
    def __init__(self, x: float, y: float, z: float):
        self.__x = x
        self.__y = y
        self.__z = z

    # 🔹 Suma con otro vector
    @multimethod
    def suma(self, v: 'Vector3D'):
        return Vector3D(self.__x + v.__x, self.__y + v.__y, self.__z + v.__z)

    # 🔹 Suma con coordenadas
    @multimethod
    def suma(self, x: float, y: float, z: float):
        return Vector3D(self.__x + x, self.__y + y, self.__z + z)

    # 🔹 Producto punto con vector
    @multimethod
    def productoPunto(self, v: 'Vector3D'):
        return self.__x * v.__x + self.__y * v.__y + self.__z * v.__z

    # 🔹 Producto punto con coordenadas
    @multimethod
    def productoPunto(self, x: float, y: float, z: float):
        return self.__x * x + self.__y * y + self.__z * z

    # 🔹 Longitud del vector
    def longitud(self):
        return math.sqrt(self.__x**2 + self.__y**2 + self.__z**2)


# 🔹 Clase principal
class Main():
    v1 = Vector3D(1.0, 2.0, 3.0)
    v2 = Vector3D(4.0, 5.0, 6.0)

    suma = v1.suma(v2)

    print("Suma:", (suma._Vector3D__x, suma._Vector3D__y, suma._Vector3D__z))
    print("Producto punto:", v1.productoPunto(v2))
    print("Longitud:", v1.longitud())
    print("Producto punto (coords):", v1.productoPunto(1.0, 1.0, 1.0))