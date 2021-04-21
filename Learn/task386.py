# Написать функцию расшифровки кода decode(code, key)
# Процесс шифрования: каждой букве латинского алфавита abcdefghijklmnopqrstuvwxyz
# последовательно ставится в соответствие число от 1 до 26.
# Дальше к каждому числу последовательно прибавляется цифры из ключа.
#
# Пример:
# слово: abcxyz, код: 4567 =>
# [a->1, b->2, c->3, x->24, y->25, z->26] =>
# [1 + 4, 2 + 5, 3 + 6, 24 + 7, 25 + 4, 26 + 5] => код: [5, 7, 8, 31, 29, 31]


import traceback


def decode(code, key):
    slov = {'a': 1,
    		'b': 2,
    		'c': 3,
    		'd': 4,
    		'e': 5,
    		'f': 6,
    		'g': 7,
    		'h': 8,
    		'i': 9,
    		'j': 10,
    		'k': 11,
    		'l': 12,
    		'm': 13,
    		'n': 14,
    		'o': 15,
    		'p': 16,
    		'q': 17,
    		'r': 18,
    		's': 19,
    		't': 20,
    		'u': 21,
    		'v': 22,
    		'w': 23,
    		'x': 24,
    		'y': 25,
    		'z': 26}

    spis = []
    for i in key:
    	spis.append(slov.get(i))

    
    return "aaa"


# Тесты
try:
    assert decode([20, 12, 18, 30, 21], 1939) == "scout"
    assert decode([14, 10, 22, 29, 6, 27, 19, 18, 6, 12, 8], 1939) == "masterpiece"
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")
