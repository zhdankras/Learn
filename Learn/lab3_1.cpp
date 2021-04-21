//  Работа со строкой как с массивом символов
//    Дан текст, хранящийся в строковй переменной s, определить, входит ли подстрока ss в строку s.
//    1. Для задачи вариманта разработайте отдельную программу, по возможности, декомпозируйте ее
//      на подзадачи
//    2. В задаче не используйте функции модуля string.h для выполнения операций над строкой,
//      а рассмотрите строку как массив символов


#include <iostream>

using namespace std;


int find_str(string s, string ss){
    int n = s.length();
    int m = ss.length();

    int result = -1;

    char s_array[n + 1];
    strcpy(s_array, s.c_str());

    char ss_array[m + 1];
    strcpy(ss_array, ss.c_str());


    for ( int i = 0; i <= n - m; ++i ){
        for ( int j = 0; j < m; j++ ){
            if ( s_array[i + j] != ss_array[j] ){
                result = -1;
                break;
            } else{
                result = 0;
            }
        }
    }
    return result;
}


int main(){

    string s = {0};
    string ss = {0};

    cout << "Please enter a string: ";
    getline(cin, s);

    cout << "Please enter a substring: ";
    getline(cin, ss);

    find_str(s, ss);


    if ( find_str(s, ss) == 0 ){
        cout << "\"" << ss << "\"" << " is part of the " << "\"" << s << "\""<< endl;
    }

    return 0;
}
