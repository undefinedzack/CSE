function selection()
		{
			var i,j,temp,num;
			var ar=[];
			num=prompt("Enter how many elements to be sorted:");
			for(i=0;i<num;i++)
			{
				ar[i]=prompt('Enter element '+(i+1));
			}
        	for (i=0;i<num;i++){ 
            	var min_idx = i; 
            	for (j=i+1;j<num;j++){
                	if (ar[j]<ar[min_idx])
                	{ 
                    	min_idx=j; 
                    }
            	}
           		temp=ar[min_idx]; 
            	ar[min_idx]=ar[i]; 
            	ar[i]=temp; 
            } 
            alert(ar);
		}
		function insertion(){
			var i,j,temp,num;
			var ar=[];
			num=prompt("Enter how many elements to be sorted:");
			for(i=0;i<num;i++){
				ar[i]=prompt('Enter element '+(i+1));
			}
			for(i=0;i<num;i++){
    			j=i-1;
    			temp=ar[i];
    			while(j>=0 && ar[j]>temp)
    			{
      				ar[j+1]=ar[j];
      				j--;
    			}
    			ar[j+1]=temp;
  			}
  			alert(ar);
		}
		function bubble()
		{
			var i,temp,num,swap;
			var ar=[];
			num=prompt("Enter how many elements to be sorted:");
			for(i=0;i<num;i++){
				ar[i]=prompt('Enter element '+(i+1));
			}
			
			do{
				swap=false;
				for(i=0;i<num;i++){
            		if(ar[i] > ar[i+1])
            		{
                		temp = ar[i];
               			ar[i] = ar[i+1];
               			ar[i+1] = temp;
               			swap=true;
            		}
        		}
        	}while(swap==true);
        	alert(ar);
		}