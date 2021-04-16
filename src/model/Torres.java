package model;

public class Torres {

	private int torre1;
	private int torre2;
	private int torre3;

	public Torres() {
	}

    public void hanoiTowers(int d) {
		torre1 = d;
		torre2 = 0;
		torre3 = 0;
		hanoiTowers(d,1,2,3);		
	}	

	private void hanoiTowers(int d, int t1, int t2, int t3) {
		if(d==1) {
			ifAnidados(t1, t3);
			System.out.println(torre1 + " " + torre2 + " " + torre3);		
		}else {
			hanoiTowers((d-1),t1,t3,t2);	
			ifAnidados(t1, t3);		
			System.out.println(torre1 + " " + torre2 + " " + torre3);
			hanoiTowers((d-1),t2,t1,t3);		
		}
	}

	private void ifAnidados(int o, int d){
		if(o == 1){
			torre1--;
		}else if(o == 2){
			torre2--;
		}else{
			torre3--;
		}
		if(d == 1){
			torre1++;
		}else if(d == 2){
			torre2++;
		}else{
			torre3++;
		}
	}
}
