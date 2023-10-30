var a=[9,4,1,6,7,89,0];
for(var i=0;i<a.length;i++){
    for(var j=i+1;j<a.length;j++){
        if(a[i]<a[j]){
            let temp;
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;

        }
        // console.log("the array is in decending order",a[j]);
    }
    console.log("the array is in decending order",a[i]);
}