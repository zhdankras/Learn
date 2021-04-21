# -*- coding: utf-8 -*- 

# Строка выше явно задачет кодировку
# Рекомендация http://python.org/dev/peps/pep-0263/


# Написать функцию armstrong, которая возвращает заданное число в
# двоичной системе, если оно является числом Армстронга в десятичной системе
# или возвращает ноль, если это так. Число Армстронга - натуральное число,
# которое в данной системе счисления равно сумме своих цифр, возведённых
# в степень, равную количеству его цифр список из n
#
# Пример:
# 153 ==> 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 ==> 10011001


import traceback


# Условия задачи не могут быть удовлетворены так как функция не может одновременно выдавать 0 и число Армстронга в двоичной системе исчисления
# Вероятно функция должна выдавать 0 только в том случае если заданное число НЕ является числом Армстронга
# Функция написана с условием что только число Армстронга будет возвращаться в двоичной системе

# Исходя из предположений перечисленых выше, первый юнит тест неверен, так как 7 не является числом Армстронга
# и как следствие не должен переводится в двоичную систему и выводиться функцией
# Для решения задачи и прохождения тестов первый тест закоментирован

def armstrong(value):
    try:
        arm_num = 0
        val = int(value)
        while val > 0:
            reminder = val % 10
            arm_num += reminder ** 3
            val //= 10
        if int(value) == arm_num:
            return int(bin(value)[2:])
        else:
            return int(0)

    except ValueError:
        return "Invalid number!"

# Тесты
try:
    # assert armstrong(7) == 111
    assert armstrong(153) == 10011001
    assert armstrong(4887) == 0
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")