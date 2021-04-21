#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
	int mass[100][50]; // Матрица
	int n, m; // Количество строк и столбцов матрицы
	int stolb; // Нулевой столбец
	cout <<"Введите количество строк: ";
	cin >> n;
	cout <<"Введите количество столбцов: ";
	cin >> m;
	cout <<"Введите столбец, который будет нулевым: ";
	cin >> stolb;

	if(stolb > m) return 1;
	
	/* Ввод матрицы */

	for(int i = 0; i < n; i++) {
		for(int j = 0; j < m; j++)
			mass[i][j] = rand() % 9 + 1;
			mass[i][stolb-1] = 0;
	}

	/* Вывод матрицы */

	for(int i = 0; i < n; i++) {
		for(int j = 0; j < m; j++)
			cout << mass[i][j] <<' ';
		cout << endl;
	}

	cout << endl;

	/* Удаление нулевого столбца */

	for(int i = 0; i < n; i++) {
		for(int j = stolb-1; j < m - 1; j++)
			mass[i][j] = mass[i][j+1];
	}
	m--;

	/* Вывод столбца */
	for(int i = 0; i < n; i++) {
		for(int j = 0; j < m; j++)
			cout << mass[i][j] <<' ';
		cout << endl;
	}
	return 0;
}