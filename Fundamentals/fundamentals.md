1. Input -> Scanner 
2. (IMP) Both sum and count are int, so Java performs integer division first.
   sum = 10 ,     count = 3
   10 / 3 = 3
   Only after getting 3 does Java convert it to float, so avg becomes 3.0.
   Solution -> Make either operand a float: (float) sum or (float) count
3. 