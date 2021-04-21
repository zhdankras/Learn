// Дан одномерный целочисленный массив А, состоящий из N элементов.
// N заданное натуральное число.
// Определить симметричен ли массив (т.е. первый элемент равен последнему, второй предпоследнему)
//   1. Использовать только динамический массив
//   2. Для каждой задачи варианта выполните декомпозицию и для каждой разработайте отдельную функцию.
//   3. В программу включите интерфейс пользователя для выбора пользователем способа ввода элементов массива с клавиатуры
//      и датчиком случайных чисел, вывода массива и выполнение всех задач задания



#include <iostream>

using namespace std;


int is_sync(int array[], int size){
    int count = 0;

    for ( int i = 0, j = size - 1; i < size / 2; i++, j--)
    {
        if( array[i] == array[j] ) {  // if elementes are equal encrease our counter
            count++;
        }
    }

    if ( count == size / 2 ){
//        cout << "Array is symetrical " << endl;
        return true;
    } else{
//        cout << "Array is not symetrical" << endl;
        return false;
    }
}


int main(){


    int input_arr_size = 0;
    int *d_array = new int[input_arr_size];
    int entry_method = 1;

    cout << "Введите размер массива: ";
    cin >> input_arr_size;

    //check boundaries
    if( input_arr_size < 0 )
    {
        cout << "Неверный размер!" << endl;
        return -1;
    }

    cout << "Выберите метод ввода для элементов в массиве (1 - случайный, 2 - ручной): ";
    cin >> entry_method;

    //check entry method
    if ( entry_method == 1 ){
        for ( int i = 0; i < input_arr_size; i++ ){
            d_array[i] = rand() % 10;
        }
    } else if ( entry_method == 2 ) {
        for (int i = 0; i < input_arr_size; i++) {
            cout << "Введите значение для элемента: " << i << ": ";
            cin >> d_array[i];
        }
    } else {
        cout << "Неверный ввод!";
        return -1;
    }

    cout << "Массив: ";
    for ( int i = 0; i < input_arr_size; i++ ){
        cout << d_array[i] << " ";
    }
    cout << endl;

    if ( is_sync(d_array, input_arr_size) ){
        cout << "Массив симметричный! " << endl;

    } else {
        cout << "Массив не симметричный!" << endl;
    }

    delete [] d_array;
    d_array = NULL;

    return 0;
}