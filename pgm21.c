#include<stdio.h>
main()
{
 int num,temp,count=0;
 printf("\n enter the number:");
 scanf("%d",&num);
 while(num>0)
 {
     temp=num%10;
     num=num/10;
        count++;
 }
 printf("\n the number of digits is %d",count);
 return 0;
}
