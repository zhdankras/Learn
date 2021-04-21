# Написать функцию two_digit, которая определяет является ли сумма цифр заданного числа двухзначным числом
#
# Примеры:
# two_digit(2222) ==> False
# two_digit(222222) ==> True

import traceback


def two_digit(number):
    a = 0
    for i in str(number):
        a+=int(i)

    if len(str(a)) == 2: return True
    else: return False

# Тесты
try:
    assert two_digit(111223) == True
    assert two_digit(0) == False
    assert two_digit(111000) == False
    assert two_digit(123456) == True
    assert two_digit(99) == True
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")
