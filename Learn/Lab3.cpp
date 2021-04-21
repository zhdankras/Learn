#include <iostream>
#include <cstdio>
#include <cstring>
using namespace std;

int main()
{
	char str[80], new_str[80]; bool proverka = true; 
	int t = 0; // Переменная, служащая для разделения строки после @
	cout <<"Введите адрес электронной почты: ";
	gets(str);

	for(int i = 0; str[i] != '@'; i++) 
	{
		t++;
	}

	for(int i = t + 1; str[i] != '\0'; i++) // Пробегаемся по второй половине строки(доменное имя)
	{
		if(str[i] == '-' && str[i+1] == '-') proverka = false;
	}

	if(proverka == false) 
	{
		cout <<"Дефис в доменном имени может быть только одиночным!" << endl;
		cout <<"Исправленный вариант: ";

		int a = 0;

		for(int i = t + 1; str[i] != '\0'; i++) 
			if(str[i] == '-' && str[i+1] == '-')
				for(int i = t + 1; str[i] != '-'; i++)
				{
					a++;
				}
		for(int i = 0; str[i] != '@'; i++) cout << str[i];
		for(int i = t; i < a + t + 1; i++) cout << str[i];
		for(int i = t + a + 2; str[i] != '\0'; i++) cout << str[i]; // +1
	} 
	else cout << str;
	
	return 0;
}