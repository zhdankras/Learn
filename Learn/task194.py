# Написать функцию power_of_three, которая определяет является ли заданное число степенью тройки.
#
# Примеры:
# power_of_three(27) ==> True
# power_of_three(100)  ==> False

import traceback


def power_of_three(number):
    pow = 1
    while pow < number:
    	pow*=3

    if pow == number: return True
    if pow != number: return False 


# Тесты
try:
    assert power_of_three(0) == False
    assert power_of_three(1) == True
    assert power_of_three(3) == True
    assert power_of_three(5) == False
    assert power_of_three(6) == False
    assert power_of_three(2187) == True
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")
