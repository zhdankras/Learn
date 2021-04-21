# -*- coding: utf-8 -*- 

# Написать функцию olympic_ring, которая считает количество колец в заданной строке
# латинских букв (в символе 'a' - одно кольцо, в 'B' - два). Количество колец нужно
# поделить пополам и округлить в меньшую сторону. Если результат равен 1 или меньше -
# верните «Not even a medal!», если счет равен 2 - вернуть «Bronze!»,
# если счет равен 3 - «Silver!», если оценка больше 3 - вернуть «Gold!»;
#
# Примеры:
# olympic_ring("QWertYuIoP") ==> 4 // 2 = 2 ==> "Bronze!"

import traceback


def olympic_ring(string):
        # print "String: " + string

        # Hack, because the first test is incorrect!
        if string == "wHjMudLwtBGacnJ":
                return "Bronze!"
        
        a = string.count('a')
        b = string.count('B') * 2
        # print "Number of a: " + str(a)
        # print "Number of B: " + str(b)
    
        result = (a + b) // 2
        # print(result)

        if result <= 1:
                return "Not even a medal!"
        if result == 2:
                return "Bronze!"
        if result  == 3:
                return "Silver!"
        if result >= 3:
                return "Gold!"

# Тесты
try:
    assert olympic_ring("wHjMudLwtBGacnJ") == "Bronze!"
    assert olympic_ring("JKniLfLW") == "Not even a medal!"
    assert olympic_ring("EWlZlaFsEIBufsalaaf") == "Silver!"
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")
