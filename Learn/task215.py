# -*- coding: utf-8 -*- 

# Строка выше явно задачет кодировку
# Рекомендация http://python.org/dev/peps/pep-0263/


# Задан список целых чисел. Написать функцию array_leaders, которая возвращает спсиок всех лидеров.
# Лидер - элемент, больший суммы всех элементов, находящихся справа от него
#
# Пример:
# [1,8,3,4,0] ==> [8,4]


import traceback


def array_leaders(array):
    result = []

    # Запускаем перебор по массиву (для каждого елемента выполнить действие внутри цикла)
    for element in array:
        # Создаем временный массив из оригинального, убирая елементы слева по индексу. 
        # С каждой итерацией индекс увеличивается, соотв. временный массив будет содержать все меньше элементов
        temp_array = array[array.index(element)+1:]
        # Сравниваем изначальный элемент с суммой элементов во временном массиве
        # Если элемент больше суммы элементов, то мы нашли лидера, если нет, то продолжаем поиск дальше
        # Добавляем лидера в финальный массив и выводим финальный массив в конце по окончанию всех итераций
        if element > sum(temp_array):
            result.append(element)
    return result

# Тесты
try:
    assert array_leaders([16,17,4,3,5,2]) == [17,5,2]
    assert array_leaders([-36,-12,-27]) == [-36,-12]
    assert array_leaders([0,-1,-29,3,2]) == [0,-1,3,2]
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")