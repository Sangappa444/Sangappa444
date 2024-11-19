#include <stdio.h>
#include <stdlib.h>  
struct Day 
{
      char *dayName;
      int date;
      char *activity;
};  
void create(struct Day *day) 
{
    day->dayName = (char *)malloc(sizeof(char) * 20);
    day->date    = (char *)malloc(sizeof(char) * 20);
    day->activity = (char *)malloc(sizeof(char) * 100);  
    printf("\nEnter the day name:\n ");
    scanf("%s\n", day->dayName);  
    printf("\nEnter the date: \n");
    scanf("%d\n", &day->date);  
    printf("\nEnter the activity for the day: \n ");
    scanf(" %s\n", day->activity);
}  
void read(struct Day *calendar, int size) 
{
      for (int i = 0; i < size; i++)
      {
      printf("\nEnter details for Day %d:\n", i + 1);
      create(&calendar[i]);
      }
}  
void display(struct Day *calendar, int size) 
{
    printf("\nWeek's Activity Details:\n");
    for (int i = 0; i < size; i++)
        {
        printf("Day %d:\n", i + 1);
        printf("Day Name: %s\n", calendar[i].dayName);
        printf("Date: %d\n", calendar[i].date);
        printf("Activity: %s\n", calendar[i].activity);
        printf("\n");
        }
}  
void freeMemory(struct Day *calendar, int size) 
{
      for (int i = 0; i < size; i++) 
      {
      free(calendar[i].dayName);
      free(calendar[i].activity);
      }
}  int main() 
{
    int size;
    printf("\nEnter the number of days in the week:\n ");
    scanf("%d", &size); 
    struct Day *calendar = (struct Day *)malloc(sizeof(struct Day) * size);  
    if (calendar == NULL) 
    {
      printf("\n3Memory allocation failed. Exiting program.\n");
      return 1;
    }  
      read(calendar, size);
      display(calendar, size);  
      freeMemory(calendar, size);
      free(calendar);
      return 0;
}