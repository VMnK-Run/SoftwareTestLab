import time

import pytest
import sys
import os

curPath = os.path.abspath(os.path.dirname(__file__))
rootPath = os.path.split(curPath)[0] + '\\src'
sys.path.append(rootPath)

from mypkg.triangle import *


def setup_module():
    print("setup module")


def teardown_module():
    print("teardown module")


class TestTriangle:
    triangle = None

    def setup_method(self):
        print('setup_method')

    def setup_class(self):
        self.triangle = Triangle()
        print('setup_class')

    def teardown_class(self):
        print('teardown_class')

    def teardown_method(self):
        print('teardown_method')

    @pytest.mark.skip(reason='跳过test_0')
    def test_0(self):
        assert Type.INVALID == self.triangle.classify(0, 0, 0)

    @pytest.mark.skipif(1 == 0, reason='跳过test_1')
    def test_1(self):
        assert Type.INVALID == self.triangle.classify(-1, 2, 0)

    @pytest.mark.xfail(reason='test_2', raises=None, run=True, strict=False)
    def test_2(self):
        assert Type.INVALID == self.triangle.classify(2, 3, 3)

    def test_3(self):
        assert Type.INVALID == self.triangle.classify(1, 0, -665)

    def test_4(self):
        assert Type.INVALID == self.triangle.classify(1, 1, 0)

    def test_5(self):
        assert Type.EQUILATERAL == self.triangle.classify(582, 582, 582)

    def test_6(self):
        assert Type.INVALID == self.triangle.classify(1, 1088, 15)

    def test_7(self):
        assert Type.INVALID == self.triangle.classify(1, 2, 450)

    def test_8(self):
        assert Type.SCALENE == self.triangle.classify(1663, 1088, 823)

    def test_9(self):
        assert Type.INVALID == self.triangle.classify(1187, 1146, 1)

    def test_10(self):
        assert Type.ISOSCELES == self.triangle.classify(1640, 1640, 1956)

    def test_11(self):
        assert Type.INVALID == self.triangle.classify(784, 784, 1956)

    def test_12(self):
        assert Type.INVALID == self.triangle.classify(1, 450, 1)

    def test_13(self):
        assert Type.ISOSCELES == self.triangle.classify(1146, 1, 1146)

    def test_14(self):
        assert Type.ISOSCELES == self.triangle.classify(1640, 1956, 1956)

    def test_15(self):
        assert Type.INVALID == self.triangle.classify(-1, 1, 1)

    def test_16(self):
        assert pytest.approx(0) == self.triangle.getArea(-1, 1, 1)

    def test_17(self):
        assert pytest.approx(0) == self.triangle.getArea(1, 1, 8)

    def test_18(self):
        assert pytest.approx(6) == self.triangle.getArea(3, 4, 5)

    def test_19(self):
        assert pytest.approx(24) == self.triangle.getArea(6, 8, 10)

    def test_20(self):
        assert pytest.approx(0) == self.triangle.getArea(6, 10, 22)

    def test_21(self):
        assert pytest.approx(389.711431702) == self.triangle.getArea(30, 30, 30)

    def test_22(self):
        assert pytest.approx(600) == self.triangle.getArea(30, 40, 50)

    def test_23(self):
        assert pytest.approx(30) == self.triangle.getArea(5, 12, 13)

    def test_24(self):
        assert pytest.approx(2400) == self.triangle.getArea(60, 80, 100)

    def test_25(self):
        assert pytest.approx(0) == self.triangle.getArea(50, 19, 30)

    def test_26(self):
        assert pytest.approx(0) == self.triangle.getArea(-5, 12, 13)

    def test_27(self):
        assert pytest.approx(74.8331477354) == self.triangle.getArea(15, 12, 13)

    def test_28(self):
        assert pytest.approx(0) == self.triangle.getArea(-5, -12, -13)

    def test_29(self):
        assert pytest.approx(0.43301270189) == self.triangle.getArea(1, 1, 1)

    def test_30(self):
        assert pytest.approx(2.90473750965) == self.triangle.getArea(2, 3, 4)

    @pytest.mark.timeout(2)
    def test_timeout_003(self):
        time.sleep(1)
        assert pytest.approx(0) == self.triangle.getArea(0, 0, 0)

    # @pytest.mark.timeout(2)
    # def test_timeout_002(self):
    #     time.sleep(3)
    #     assert pytest.approx(0) == self.triangle.getArea(0, 0, 0)

if __name__ == "__main__":
    pytest.main(['-s'], 'test_triangle.py')
