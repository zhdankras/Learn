#include <iostream>
#include <string> 
#include <sstream>  
#include <fstream>
#include <cstdio>
using namespace std;
    
struct node { 
    string data;
    int count;
    node *left;
    node *right;
};
    
node* newNode(string const &data) {
  node* element = new node; 
  element->data = data;
  element->count = 1;
  element->left = NULL; 
  element->right = NULL; 
  return element;
}
 
node* insert(node* element, string const &key) { 
    if (element == NULL) 
        return newNode(key);
    if (key < element->data)
        element->left = insert(element->left, key);
    else if (key > element->data)
        element->right = insert(element->right, key);
    else {
        element->count++;
    }   
    return element;
}
 
void print(node* element) { 
    if (element == NULL)
    return;
    print(element->left);
    cout << element->data << " " << element->count << endl;
    print(element->right); 
} 
 
int main() {
    //int k = 0;
    //string s, word;
    int value;

    do {
    cout <<"[1] Записать текст" << endl;
    cout <<"[2] Посмотреть содержимое словаря" << endl;
    cout <<"[3] Добавить новый элемент" << endl; 
    cout <<"[4] Поиск элемента" << endl;
    cout <<"[5] Выход из программы" << endl;
    cout <<"Введите (1-5): "; 
    cin >> value;

    if(value == 1)
    {
        string s;
        ofstream file;
        file.open("Kurs.txt");

        if(!file.is_open())
        {
            cout <<"Ошибка открытия файла";
        }
        else 
        {   
            cout << "Введите текст: ";
            cin.ignore();
            getline(cin, s);
            cin.ignore();
            file << s;
        }
        file.close();
    } 

    if(value == 2)
    {
        ifstream file;
        string s, word;
        int k = 0;

        file.open("Kurs.txt");

        if(!file.is_open())
        {
            cout <<"Ошибка открытия файла";
        }
        else 
        {
            getline(file, s);
            stringstream str(s);
            node* root = NULL;
            while (str >> word) {
                k++;
                if (k == 1) root = insert(root, word);
                else insert(root, word);
            }
            cout << "Output of the program:\n";
            print(root);
        }
        file.close();
    }  

    if(value == 3)
    {
        string s;
        ofstream file;
        file.open("Kurs.txt", ofstream::app);

        if(!file.is_open())
        {
            cout <<"Ошибка открытия файла";
        }
        else
        {
            cout <<"Введите слово: ";
            cin >> s;
            file <<' ' << s;
        }
        file.close();
    }

    if(value == 4)
    {
        string s, str; int p;
        ifstream file;
        file.open("Kurs.txt");

        if(!file.is_open())
        {
            cout <<"Ошибка открытия файла";
        }
        else
        {
            getline(file, s);
            cout <<"Введите слово: ";
            cin >> str;
            p = s.find(str);
            if(p == -1) cout <<"Данного слова нет" << endl;
            else cout <<"Элемент под номером " << p << endl;
        }
        file.close();
    }
    } while(value != 5);  
        //system("pause"); 
    return 0;
}