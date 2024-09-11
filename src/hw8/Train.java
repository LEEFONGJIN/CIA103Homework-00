package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

public class Train implements Comparable<Train>{
//		請設計一個Train類別，並包含以下屬性：-
//		班次number，型別為int /車種type，型別為String- (O)
//		出發地start，型別為String / 目的地dest，型別為String (O)
//		票價price，型別為double / (O)
//		 • 設計對應的getter/setter方法，
//		並在main方法裡透過建構子(O)
//		產生以下7個Train的物件，(O)
//	 	放到每小題需使用的集合裡- (202, “普悠瑪”, “樹林”, “花蓮”, 400)- 
//		(1254, “區間”, “屏東”, “基隆”, 700)-(118, “自強”, “高雄”, “台北”, 500)-
//		(1288, “區間”, “新竹”, “基隆”, 400)-(122, “自強”, “台中”, “花蓮”, 600)- 
//		(1222, “區間”, “樹林”, 七堵, 300)- (1254, “區間”, “屏東”, “基隆”, 700

	private int Number;
	private String Type;
	private String Start;
	private String Dest;
	private Double Price;

	public void setNumber(int Number) {
		this.Number = Number;
	}

	public int getNumber() {
		return Number;
	}

	public void setType(String Type) {
		this.Type = Type;
	}

	public String getType() {
		return Type;
	}

	public void setStart(String Start) {
		this.Start = Start;
	}

	public String getStart() {
		return Start;
	}

	public void setDest(String Dest) {
		this.Dest = Dest;
	}

	public String getDest() {
		return Dest;
	}

	public void setPrice(Double Price) {
		this.Price = Price;
	}

	public Double getPrice() {
		return Price;
	}

	public Train() {

	}

	public Train(int Number, String Type, String Start, String Dest, Double Price) {
		this.Number = Number;
		this.Type = Type;
		this.Start = Start;
		this.Dest = Dest;
		this.Price = Price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Dest, Number, Price, Start, Type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(Dest, other.Dest) && Number == other.Number && Objects.equals(Price, other.Price)
				&& Objects.equals(Start, other.Start) && Objects.equals(Type, other.Type);
	}
	public int compareTo(Train aTrain) {
		// 物件本身與 aaTrain 相比較，如果 retrun 正值，就表示比 aEmployee 大
		if (this.Number > aTrain.Number) {
			return -1;
		}else if(this.Number==aTrain.Number){
			return 0;
		} 
		
		else {
			return 1;
		}
	}
	
	
	
	public static void main(String[] args) {
//	• 請寫一隻程式，能印出不重複的Train物件 HashSet (O)
//	• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出 list搭配sort方法 (O)
//	• 承上，不僅能讓班次編號由大排到小印出，還可以不重複印出Train物件 TreeMap
//	• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)
		Set<Train> set = new HashSet<Train>();
		Train T1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400.0);
		Train T2 = new Train(1254, "區間", "屏東", "基隆", 700.0);
		Train T3 = new Train(118, "自強", "高雄", "台北", 500.0);
		Train T4 = new Train(1288, "區間", "新竹", "基隆", 400.0);
		Train T5 = new Train(122, "自強", "台中", "花蓮", 600.0);
		Train T6 = new Train(1222, "區間", "樹林", "七堵", 300.0);
		Train T7 = new Train(1254, "區間", "屏東", "基隆", 700.0);
		set.add(T1);
		set.add(T2);
		set.add(T3);
		set.add(T4);
		set.add(T5);
		set.add(T6);
		set.add(T7);
	
		for(Train aTrain:set) {
			System.out.println(aTrain.getNumber()+"班次,"+aTrain.Type+"車型,"+aTrain.Start+"出發,"+"開往"+aTrain.Dest+",票價為"+aTrain.Price);			
		}
		System.out.println("=============================================");
		List<Train> list = new ArrayList<>();
		list.add(T1);
		list.add(T2);
		list.add(T3);
		list.add(T4);
		list.add(T5);
		list.add(T6);
		list.add(T7);
		Collections.sort(list);
		for(Train aTrain:list) {
			System.out.println(aTrain.getNumber()+"班次,"+aTrain.Type+"車型,"+aTrain.Start+"出發,"+"開往"+aTrain.Dest+",票價為"+aTrain.Price);			
		}
		System.out.println("=============================================");
		TreeMap<Integer ,String> map = new TreeMap<>();
		for(Train aTrain:list) {
		map.put(aTrain.getNumber(),aTrain.getNumber()+"班次,"+aTrain.Type+"車型,"+aTrain.Start+"出發,"+"開往"+aTrain.Dest+",票價為"+aTrain.Price);
		}
		for(String str:map.descendingMap().values())//descendingMap()倒轉map 值順序
		System.out.println(str);
		
		
	}
}
