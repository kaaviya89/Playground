#include<stdio.h>
int main()
{
  float a,b,c,r1,r2,real,img,determinant;
  scanf("%f%f%f",&a,&b,&c);
  determinant=((b*b) - (4*a*c));
  if(determinant>0)
  {
    r1 = (-b + sqrt(determinant))/(2*a);
    r2 = (-b - sqrt(determinant))/(2*a);
    printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else if(determinant == 0)
  {
    r1=r2=(-b/(2*a));
    printf("root1 = %0.2f  root2 = %0.2f",r1,r2);
  }
  else
  {
    real = (-b/(2*a));
    img = sqrt(-determinant)/(2*a);
    printf("root1 = %0.2f + %0.2fi  root2 = %0.2f - %0.2fi",real,img,real,img);
  }
}
  
