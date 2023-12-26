package day10;

import java.util.Objects;

public class Country implements Comparable<Country>{
	private String code;
	private String name;
	private int population;
	public Country() {
		code = "IND";
		name = "India";
		population = 140;
	}
	public Country(String code, String name, int population) {
		super();
		this.code = code;
		this.name = name;
		this.population = population;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [code=" + code + ", name=" + name + ", population=" + population + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(code, name, population);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(code, other.code) && Objects.equals(name, other.name) && population == other.population;
	}
	@Override
	public int compareTo(Country country2) {
		// Providing default algorithm: Population wise Ascending
		Integer pop1 = population;//Integer pop1 = new Integer(this.population)
		Integer pop2 = country2.population;
		int comparison = pop1.compareTo(pop2);
		//System.out.println("Comparison : " + comparison);
		return comparison;
	}
	
	
	
	
	

}

