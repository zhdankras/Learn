# Написать функцию is_isogram, определяющую является ли заданное слово
# изограмом, т.е. словом, в котором ни одна буква не повторяется больше
# одного раза, в независимости от регистра
#
# Примеры:
# is_isogram("documentary" ) ==> true
# is_isogram("abA" ) ==> false



import traceback


def is_isogram(s):
    return len(s) == len(set(s.lower()))
    #print(spis)

        

# Тесты
try:
    assert is_isogram("Dermatoglyphics") == True
    assert is_isogram("isogram") == True
    assert is_isogram("granulocytes") == True
    assert is_isogram("moOse") == False
    assert is_isogram("isIsogram") == False
except AssertionError:
    print("TEST ERROR")
    traceback.print_exc()
else:
    print("TEST PASSED")
