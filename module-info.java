Public class Fibonaccinumbers {
	Public static void main(String[] args) {
		// TODO Auto-generated method stub
int elementPosition=1,count=20, firstFibonacciNum=0,nextFibonacciNum=1;
System.out.print(firstFibonacciNum+""+nextFibonacciNum);
for(elementPosition=2;elementPosition<count;++elementPosition)
{

	int sumofPrev2=firstFibonacciNum+nextFibonacciNum;
	firstFibonacciNum=nextFibonacciNum;
	System.out.print(""+sumofPrev2);
	nextFibonacciNum=sumofPrev2;
	elementPosition++;
}
	}

}
