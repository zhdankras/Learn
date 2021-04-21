#include <iostream>
#include "Bus.h"

using namespace std;

Bus::Bus()
{
    this->Num = 0;
    this->EndPointName = "";
    this->Time = "00:00";
    this->PriceTicket = 0.0;
}

Bus::Bus(int Num, string EndPointName, string Time, float PriceTicket)
{
    this->Num = Num;
    this->EndPointName = EndPointName;
    this->Time = Time;
    this->PriceTicket = PriceTicket;
}

Bus::~Bus()
{
}

string Bus::toString()
{
    string s = to_string(this->Num) + " " + this->EndPointName + " " + this->Time + " " + to_string(this->PriceTicket);
    return s;
}
