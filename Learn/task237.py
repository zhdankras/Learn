# Задан список целых чисел. Написать функцию max_three_sum,
# которая возвращает максимальную сумму трех элементов без их повторов
#
# Пример:
# [1,8,3,4,0,8,4] ==> 15


import traceback


def max_three_sum(arr):
    del_povt = set(arr)
    new_arr = list(del_povt)
    new_arr.sort()
    count = 0
    for i in new_arr[len(new_arr)-3:]:
    	count+=i

    return count


# Тесты
try:
    assert max_three_sum([2,1,8,0,6,4,8,6,2,4]) == 18
    assert max_three_sum([-2,-4,0,-9,2]) == 0
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")