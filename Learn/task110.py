# -*- coding: utf-8 -*- 

# Написать функцию palindrom, которая определяет является ли заданное число палиндромом
# (читается одинаково слева направо и справа налево)
#
# Пример:
# palindrom(1234321) ==> True

import traceback


def palindrom(val):
    tmp = val
    rev = 0
    while val:
        dig = val % 10
        rev = rev * 10 + dig
        val = val // 10
    if tmp == rev:
        return True
    else:
        return False


# Тесты
try:
    assert palindrom(0) == True
    assert palindrom(1233221) == False
    assert palindrom(1000010) == False
    assert palindrom(5555555) == True
    assert palindrom(1234554321) == True
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")  
