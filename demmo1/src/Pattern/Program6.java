package Pattern;

public class Program6 {
	public static void main(String[] args) {
		
		 int n = 7;
		 int st = n;
		 int sp = 0;
		 for(int i=1;i<=n;i++) {
			 for(int j=1;j<=sp;j++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=st;j++) {
				 System.out.print("*");
			 }
			 if(i <= n/2) {
				 st = st-2;
				 sp++;
			 }
			 else {
				 st = st+2;
				 sp--;
			 }
			 System.out.println();
		 }
			 System.out.println("===========");
			 sp = n/2;
			 st = 1;
			 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=sp;j++) {
					 System.out.print(" ");
				 }
				 for(int j=1;j<=st;j++) {
					 System.out.print("*");
				 }
				 if(i <= n/2) {
					 st = st+2;
					 sp--;
				 }
				 else {
					 st = st-2;
					 sp++;
				 }
				 System.out.println();
			 }
			 System.out.println("=========");
			 sp = n/2;
			 st = 1;
			 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=sp;j++) {
					 System.out.print(" ");
				 }
				 for(int j=1;j<=st;j++) {
					 System.out.print(j);
				 }
				 if(i <= n/2) {
					 st = st+2;
					 sp--;
				 }
				 else {
					 st = st-2;
					 sp++;
				 }
				 System.out.println();
			 }
			 System.out.println("======");
			 st = 1;
			 sp = n/2;
			 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=sp;j++) {
					 System.out.print(" ");
				 }
				 for(int j=1;j<=st;j++) {
					 System.out.print((char)(j+64));
				 }
				 if(i <= n/2) {
					 st = st+2;
					 sp--;
				 }
				 else {
					 st = st-2;
					 sp++; 
				 }
				 System.out.println();
			 }
			 System.out.println("========");
			 st = 1;
			 sp = n/2;
			int k = 1;
			 for(int i=1;i<=n;i++) {
				 for(int j=1;j<=sp;j++) {
					 System.out.print(" ");
				 }
				 for(int j=1;j<=st;j++) {
					 System.out.print((char)(k+64));
					 k++;
				 }
				 if(i <= n/2) {
					 sp--;
					 st = st+2;
				 }
				 else {
					 st = st-2;
					 sp++;
				 }
				 System.out.println();
			 }
			 System.out.println("=========");
			 		n = 5;
			 for(int i=1;i<=n;i++) {
				 k = i;
				 for(int j=1;j<=i;j++) {
					 System.out.print(k + " ");
					 k = k+n-j;
				 }
				 System.out.println();
			 }
			 System.out.println("==========");
       }
 }