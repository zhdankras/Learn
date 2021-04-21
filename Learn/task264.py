# -*- coding: utf-8 -*- 

# Пляж полон песка, воды, рыбы и солнца. Написать функцию sum_of_a_beach,
# подсчитывающую сколько раз повторяются слова "sand", "water", "fish", "sun"
# в заданной строке в независимости от регистра
#
# Пример:
# sum_of_a_beach("sun32sun33sun3434sunfish") ==> 5


import traceback


def sum_of_a_beach(string):
    string_lower = string.lower()

    beach = ["sand","water","fish","sun"]

    result = 0
    for word in beach:
        result += string_lower.count(word)

    return result


# Тесты
try:
    assert sum_of_a_beach("WAtErSlIde") == 1
    assert sum_of_a_beach("GolDeNSanDyWateRyBeaChSuNN") == 3
    assert sum_of_a_beach("gOfIshsunesunFiSh") == 4
    assert sum_of_a_beach("cItYTowNcARShoW") == 0
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")