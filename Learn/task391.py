# -*- coding: utf-8 -*- 

# Написать функцию range_parser, которая переводит строку, задающую диапазон в соответствующий
# ему список целых чисел. Диапазон может включать в себя конструкции следующего вида
# n1-n2,n3,n4-n5:n6 (от n1 до n2 включительно, n3, от n4 до n5 включительно с шагом n6),
# конструкции могут быть разделены ',' или ', '
#
# Пример
# range_parser("1-10,14, 20-25:2") ==> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 20, 22, 24]


import traceback
import re


def range_parser(string):
    result = []
    for seq in string.split(','):
        step = 1

        if seq.count('-') == 1:
            spl = seq.split('-')
            start = int(spl[0])
            
            if spl[1].count(':') == 1:
                end_spl = spl[1].split(':')
                end = int(end_spl[0])
                step = int(end_spl[1])
            else:
                end = int(spl[1])

            result += (list(range(start, end+1, step)))

        else:
            result.append(int(seq))

    return result


# Тесты
try:
    assert range_parser("2") == [2]
    assert range_parser("5-10") == [5, 6, 7, 8, 9, 10]
    assert range_parser("1-10,14, 20-25:2") == [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 20, 22, 24]
    assert range_parser("1-3, 14-16,20-25:2, 26-30:3") == [1, 2, 3, 14, 15, 16, 20, 22, 24, 26, 29]
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")
