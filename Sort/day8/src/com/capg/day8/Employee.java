package com.capg.day8;

public class Employee
{
int id;
String name;
double salary;
/**
 * 
 */
public Employee()
{
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the salary
 */
public double getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}


}
