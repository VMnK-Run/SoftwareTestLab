import math


class Type:
    INVALID = 0
    SCALENE = 1
    EQUILATERAL = 2
    ISOSCELES = 3


class Triangle:
    def __init__(self):
        pass

    def classify(self, a, b, c):
        if a <= 0 or b <= 0 or c <= 0:
            return Type.INVALID
        trian = 0
        if a == b:
            trian += 1
        if a == c:
            trian += 2
        if b == c:
            trian += 3
        if trian == 0:
            if a + b <= c or a + c <= b or b + c <= a:
                return Type.INVALID
            else:
                return Type.SCALENE
        if trian > 3:
            return Type.EQUILATERAL
        if trian == 1 and a + b > c:
            return Type.ISOSCELES
        elif trian == 2 and a + c > b:
            return Type.ISOSCELES
        elif trian == 3 and b + c > a:
            return Type.ISOSCELES
        return Type.INVALID

    def getArea(self, a, b, c):
        if self.classify(a, b, c) == Type.INVALID:
            return 0.0
        p = (a + b + c) / 2.0
        return math.sqrt(p * (p - a) * (p - b) * (p - c))
