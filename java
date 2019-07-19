1
 2
 3
 4
 5
 6
 7
 8
 9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
       /**
  * Get the Starting Point of the Circular Trip
  * @return index of the petrol pump if solution exist ,
  *           else -1 if solution doesnt exist
  */
 public static int getStartIndex(int[] dist , int[] petrol){

  int nPumps= petrol.length;
  int start , currentPetrol;
  int i=start=0;

  while(start < nPumps)
  {
   currentPetrol= petrol[i] - dist[i] ;

   while(currentPetrol >= 0) {
    
    i= (i+1) % nPumps ;

    currentPetrol += petrol [i] - dist[i] ;

    if(i==start)
     return start;
   }

   start = ++i ;
   i= i % nPumps ;
  }
  return -1;
