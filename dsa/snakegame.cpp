#include <iostream>
#include <conio.h>
#include <random>
using namespace std;
int bodye();
int main()
{
    
       bodye();

    return 0;
 }
int bodye()
{
    
int x;
int y;
int height = 30;
int width = 30;

bool start;
    for (int i = 0; i < height; i++)
    {
        for (int j = 0; j < width; j++)
        {
            if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
            {
                cout << "#";
            }

            else
            {
                cout << " ";
            }
            cout << endl;
        }
    }
    return 0;
 }
// int function()
// {
// }
// int logic()
// {
// }