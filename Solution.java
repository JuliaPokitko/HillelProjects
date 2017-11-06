package com.company;

public class Solution {
        public int Solution(int number){
            int sum = 0;
            for (int i = 1; i < number; i++){
                if (i%3==0){
                    sum += i;
                    continue;
                }
                if (i%5==0){
                    sum+=1;
                }
            }
            return sum;
        }
    }


