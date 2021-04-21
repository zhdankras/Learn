# Написать функцию longest_word, которая возвращает последнее наибольшее по длине слово из заданной строки
#
# Пример:
# longest_word("red blue gold") ==> "gold"


import traceback


def longest_word(string_of_words):
    str_split = string_of_words.split()
    sp = []
    for i in str_split:
    	sp.append(len(i))

    for i in range(len(sp)):
    	if sp[i] == max(sp):
    		r = i

    return str_split[r]


# Тесты
try:
    assert longest_word("a b c d e fgh") == "fgh"
    assert longest_word("one two three four five") == "three"
    assert longest_word("red blue grey") == "grey"
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")
