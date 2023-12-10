package com.jdbc2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ModelCrud {
	static Connection conn=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner(System.in);
	
	public ModelCrud() {
		conn = DBConnect.getConnect();
		System.out.println("Connection Done..");
		try
		{
			st = conn.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public void ShowModelDetails() {
		try
		{
			rs = st.executeQuery("select * from model");
			
			System.out.println("=============== Model ===============");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	
	
	public void insertNewModel() {
		System.out.println("Enter model id: ");
		int model_id=sc.nextInt();
		
		System.out.println("Enter the Model Name: ");
		String model_name=sc.next();
		
		System.out.println("Enter the Cost: ");
		int cost=sc.nextInt();
		
		try
		{
			pst=conn.prepareStatement("insert into model values(?,?,?)");
			pst.setInt(1, model_id);
			pst.setString(2, model_name);
			pst.setInt(3, cost);
			
			int noOfRowsInserted = pst.executeUpdate();
			
			if(noOfRowsInserted>0)
			{
				System.out.println("Model Added Successfully...");
			}
			else
			{
				System.out.println("Error..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	// delete using prepared statement
	public void deleteModel() {
		System.out.println("Enter the Model id to be deleted: ");
		int model_id= sc.nextInt();
		
		try
		{
			pst= conn.prepareStatement("delete from model where model_id=?");
			pst.setInt(1, model_id);
			
			int noOfModelDeleted= pst.executeUpdate();
			
			if(noOfModelDeleted>0)
			{
				System.out.println("Model "+model_id+"is deleted successfully ");
				ShowModelDetails();
			}
			else
			{
				System.out.println("Error..No Model can be deleted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	//Statement
	public void deleteModel2()
	{
		System.out.println("Enter the Model id to be deleted: ");
		int model_id= sc.nextInt();
		
		try
		{
			int noOfRowsDeleted= st.executeUpdate("delete from model where model_id= "+model_id+" ;");
			
			if(noOfRowsDeleted>0)
			{
				System.out.println("Model" +model_id+ "is deleted successfully");
				ShowModelDetails();
			}
			else
			{
				System.out.println("Error..No Model can be deleted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void deleteModelByName()
	{
		System.out.println("Enter the Model name to be deleted: ");
		String model_name=sc.next();
		
		try
		{
			int noOfRowsDeleted= st.executeUpdate("delete from model where model_name: "+model_name+"; ");
			
			if(noOfRowsDeleted>0)
			{
				System.out.println("Model: "+model_name+" is deleted");
				ShowModelDetails();
			}
			else
			{
				System.out.println("Error..No Model can be deleted");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public boolean searchModelById(int model_id)
	{
		boolean isFound=false;
		try
		{
			pst= conn.prepareStatement("select * from model where model_id=?");
			pst.setInt(1, model_id);
			
			rs= pst.executeQuery();
			
			while(rs.next())
			{
				isFound= true;
				System.out.println("Model_id: "+rs.getInt(1));
				System.out.println("Model_Name: "+rs.getString(2));
				System.out.println("Cost: "+rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return isFound;
		
	}
	
	public void updateModelCost() 
	{
		System.out.println("Enter model id want to be updated: ");
		int model_id=sc.nextInt();
		
		if(searchModelById(model_id))
		{
			System.out.println("Enter new cost: ");
			int cost= sc.nextInt();
			
			try
			{
				pst= conn.prepareStatement("Update model set cost=? where model_id=?");
				pst.setInt(1, cost);
				pst.setInt(2, model_id);
				
				int noOfRowsUpdated= pst.executeUpdate();
				if(noOfRowsUpdated>0)
				{
					System.out.println("Model updated successfully...");
					searchModelById(model_id);
				}
				else
				{
					System.out.println("Error in updating model...");
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
		else
		{
			System.out.println("Model "+model_id+" not found...");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModelCrud mc=new ModelCrud();
		
		int choice;
		char ch;
		
		do
		{
			System.out.println("=======================================");
			System.out.println("1.Add New Model");
			System.out.println("2.Update Model Cost");
			System.out.println("3.Delete Models");
			System.out.println("4.View All Models");
			System.out.println("5.Exit");
			
			System.out.println("Enter Your Choice: ");
			System.out.println("--------------------------------------------------------------------------");
			
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1: mc.insertNewModel();
					    break;
					    
			case 2:mc.updateModelCost();
			          break;
					    
			case 3: mc.deleteModel();
		                break;
					    
					   
			case 4: mc.ShowModelDetails();
			            break;
					   
			default: System.out.println("Thank You");
			}
			
			System.out.println("Do you want perform more operation(y-yes/n-no)");
			ch= sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');
	
		

	}

}
