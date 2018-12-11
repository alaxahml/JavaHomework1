package com.alexey.homework1;

public class FibOrFac
{
public static void main(String[]args)
        {
        if(Integer.parseInt(args[0])==1)
            {
            switch(Integer.parseInt(args[1]))
                {
            case 1:
                    {
            int n=2,k1=0,k2=1;
                        System.out.println(k1);
                        System.out.println(k2);
            while(n<Integer.parseInt(args[2]))
                        {
                         int temp=k1;
                         k1=k2;
                         k2+=temp;
                            System.out.println(k2);
                            n++;
                        }
                        break;
                    }
                    case 2:
                    {
                        int n=2,k1=0,k2=1;
                        System.out.println(k1);
                        System.out.println(k2);
                        if(Integer.parseInt(args[2])<3)
                            break;
                        do
                        {

                            int temp=k1;
                            k1=k2;
                            k2+=temp;
                            System.out.println(k2);
                            n++;
                        }
                        while(n<Integer.parseInt(args[2]));
                        break;
                    }
                    case 3:
                    {
                        int k1=0,k2=1;
                        System.out.println(k1);
                        System.out.println(k2);
                        for(int i=2;i<Integer.parseInt(args[2]);i++)
                        {
                            int temp=k1;
                            k1=k2;
                            k2+=temp;
                            System.out.println(k2);
                        }
                        break;
                    }

                }
             }
             else {
            switch (Integer.parseInt(args[1])) {
                case 1: {
                    int n = 1, k = 1;
                    while (n <= Integer.parseInt(args[2])) {
                        k *= n;
                        n++;
                    }
                    System.out.println(k);
                    break;
                }
                case 2: {
                    int n = 1, k = 1;
                    do {
                        k *= n;
                        n++;
                    }
                    while (n <= Integer.parseInt(args[2]));
                    System.out.println(k);
                    break;
                }
                case 3: {
                    int k = 1;
                    for (int i = 1; i <= Integer.parseInt(args[2]); i++) {
                        k *= i;
                    }
                    System.out.println(k);
                }
            }
        }
        }
}
