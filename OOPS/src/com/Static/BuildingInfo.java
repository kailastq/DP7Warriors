package com.Static;

class Building{
		 private int flatNo;
		 private int floorNo;
		private int WingNo;
		static String buildingname="Auckland";
		
		
		Building(int flatNo, int floorNo, int WingNo)
		{
				this.flatNo=flatNo;
				this.floorNo=floorNo;
				this.WingNo=WingNo;	
		}
		
		static void PlayArea()
		{
			System.out.println("Playarea is owned by: "+Building.buildingname);
		}
		static void Gym()
		{
			System.out.println("Gym is owned by: "+Building.buildingname);
		}
		
		public String toString() {
			return ("flatNo: "+flatNo +"floorNo: "+ floorNo+"WingNo: "+WingNo);
		}
		
		void display() {
			System.out.println("Flat no. :"+ flatNo);
			System.out.println("Floor no. :"+ floorNo);
			System.out.println("Wing no. :"+ WingNo);
		}
		
}

public class BuildingInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building.PlayArea();
		Building.Gym();
		System.out.println("----------------------------------------");
		
		Building b1=new Building(204, 2, 3);
		Building b2=new Building(504, 5, 3);
		
		
		b1.display();
		b2.display();
		
		

	}

}
