#include <iostream>

#include <cmath>

#include <iomanip>

using namespace std;

int main(){

int numOfFloors, numOfRooms, i,OccupiedRooms = 0;

int totalRooms=0,totalOccupied=0, totalUnoccupied = 0;

 double percentageFilled=0;

cout << "How many floors does the hotel have?";

cin >> numOfFloors;

//Error Checking

while(numOfFloors < 1)

{ cout << "# of floors must be greater than or equal to 1. Please re-enter the # of floors." << endl;

cin >> numOfFloors;}

for(i = 1; i<= numOfFloors; i++){

  

//Skip the 13th Floor

if(i==13)

continue;

  

//Get information from user

cout << "How many rooms in floor # " << i << "?";

cin >> numOfRooms;

//Error Checking

while(numOfRooms < 1)

{ cout <<"# of rooms must be greater than or equal to 1. Please re-enter the # of rooms.";

cin >> numOfRooms;}

//Add up all the number of rooms from every floor

totalRooms += numOfRooms;

  

cout << "How many rooms are occupied in this floor?";

cin >> OccupiedRooms;

//Error Checking

while(OccupiedRooms > numOfRooms)

{ cout << "Error: number of occupied rooms must zero or equal to the number of rooms in each floor! Please re-enter the number of occupied rooms." << endl;

cin >> OccupiedRooms;}

//Add up all the number of occupied rooms from every floor

totalOccupied += OccupiedRooms;

totalUnoccupied = totalRooms - totalOccupied;

percentageFilled = totalOccupied / (double)totalRooms;
percentageFilled *=100;

  

  

}

//print the results

cout << "Total number of rooms in hotel: " << totalRooms << endl;

cout << "Total number of occupied rooms: " << totalOccupied << endl;

cout << "Total number of unoccupied rooms: " << totalUnoccupied << endl;

/* Percentage may be calculated by dividing the number of occupied rooms by the total amount of rooms*/

cout << "Percentage of occupied rooms: " << percentageFilled << "%";

  

  

  

  

  

  

  

  

}

  