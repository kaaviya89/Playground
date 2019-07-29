#include<stdio.h>
int main()
{
  char str[100];
  int i,word=0;
  scanf("%[^\n]s",str);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
    {
      word++;
    }
  }
  word++;
  printf("%d",word); 
}
