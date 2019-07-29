#include<stdio.h>
int main()
{
   int num,a[100],i=0;
   scanf("%d",&num);
    while(num!=0)
    {
      a[i++]=num%8;
      num=num/8;
    }
  for(i=i-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  return 0;
}