public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
}
}

UC 1: Attendance checking
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
System.out.println((attendance == 1) ? "Employee Present" : "Employee Absent");
}
}
Output:

UC 2:Calculate Daily Wage
Code:
public class Employee{
public static void main(String[] args){

System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
System.out.println((attendance == 1) ? "Employee Present" : "Employee Absent");
int work_hours = 8;
int wage = daily_wage(attendance, work_hours);
System.out.print("Day's wage is :"+wage);
}
public static int daily_wage(int attendance, int work_hours){
int wage = 0;
if(attendance == 1){
wage = 20 * work_hours;
}
return wage;
}
}
Output:

UC 3: Part Time Wage and Full Time Wage
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
System.out.println((attendance == 1) ? "Employee Present" : "Employee Absent");
int workTime = 0;
if(attendance == 1)
workTime = (int)((Math.random() * 10) % 2);
int work_hours = 0;
if(workTime == 1)
work_hours = 8;
else
work_hours = 4;

int wage = 0;
if(attendance == 1){
System.out.println((workTime == 1) ? "Full time" : "Part time");
wage = 20 * work_hours;
}
System.out.print("Day's wage is :"+wage);
}
}

Output:

UC 4: Above code but using switch statement
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
int isPresent = 1;
int isAbsent = 0;
int isFullTime = 1;
int isPartTime = 2;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
if( attendance == 1){
System.out.println("Employee Present");
empHours = 8;
}
else {

System.out.println("Employee Absent");
}
if(attendance == 1){
int time =(int)((Math.random() * 10 ) % 3);
switch (time) {
case 1:
System.out.println("Full Time");
break;
case 2:
System.out.println("Part Time");
empHours=4;
break;
default:
break;
}
salary = (empHours * empRatePerHour);
System.out.println("Salary is:"+salary);
}
}
}

Output:

UC 5: Wages for a month
Code:
public class Employee{
public static void main(String[] args){
System.out.println("Welcome to Employee Wage Computation Program\n");
int attendance = (int)((Math.random() * 10) % 2);
int workingDays =20;
int totalHours = 100;
int isPresent = 1;
int isAbsent = 0;
int isFullTime = 1;
int isPartTime = 2;

int totalWage = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
if( attendance == 1){
System.out.println("Employee Present");
empHours = 8;
}
else {
System.out.println("Employee Absent");
}
for(int i = 0; i < workingDays; i++){
if(attendance == 1) {
int time = (int) ((Math.random() * 10) % 3);
switch (time) {
case 1:
//System.out.println("Full Time");
break;
case 2:
//System.out.println("Part Time");
empHours = 4;
break;
default:
break;
}
salary =salary + (empHours * empRatePerHour);
}
}
System.out.println("Total salary :"+salary);
}
}
Output:

UC 6: Upto 100 hours or 20 daya
Code:
empHours = 4;
break;

default:
totalHours+=8;
empHours = 8;
break;
}
salary = salary + (empHours * empRatePerHour);
}
}while( totalHours < 100 && workingDays < 20 ){
int attendance = (int)((Math.random() * 10 ) % 2);
System.out.println(attendance);
if (attendance == 1) {
workingDays++;
int time = (int) ((Math.random() * 10) % 3);
switch (time) {
case 2:
totalHours+=4;
System.out.println("Total salary :"+salary+" Hours worked:"+totalHours+" Working
Days:"+workingDays);
Output:

UC 7
Using class variables and methods Code:
public class Employee{
int workingDays = 0;
int totalHours = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
public void getEmpWage(){
while( totalHours < 100 && workingDays < 20 ){
int attendance = (int)((Math.random() * 10 ) % 2);
System.out.println(attendance);
if (attendance == 1) {
workingDays++;
int time = (int) ((Math.random() * 10) % 3);
switch (time) {

case 2: totalHours+=4;
empHours = 4;
break;
default:
totalHours+=8;
empHours = 8;
Break;
}
salary = salary + (empHours * empRatePerHour);
}
}
System.out.println("Total salary :"+salary+" Hours worked:"+totalHours+" Working
Days:"+workingDays); }
public static void main(String[] args){
Employee ep = new Employee(); System.out.println("Welcome to Employee
Wage Computation Program\n");
ep.getEmpWage();
}
}
Output:

UC 8
Compute emp wage for multiple companies
Code:
import java.util.Scanner;
public class Employee {
int workingDays = 0;
int totalHours = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
public void companyMethod(int wage, int days, int hours){
int totalWage = ( wage * days * hours);
System.out.println("Total wage for a employee working full-time for a
month:"+totalWage);
}
System.out.println("Total salary :" + salary + " Hours worked:" + totalHours + "
Working Days:" + workingDays);

}
public static void main(String[] args) {
Employee ep = new Employee();
Scanner sc = new Scanner(System.in);
ArrayList<Employee> al = new ArrayList<Employee>();
System.out.println("Welcome to Employee Wage Computation Program\n");
System.out.println("Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println("Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println("Enter the number of working hours in a day :");
int hours = sc.nextInt();
ep.companyMethod(wage, days, hours);
}
}

Output:

UC 9
Ability to store the total wage for each company
Code:
import java.util.Scanner;
public class Employee {
int workingDays = 0;
int totalHours = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;

int wage = 0;
int days = 0;
int hours = 0;
int totalWage = 0;
Employee(int wage, int days, int hours){
this.wage = wage;
this.days = days;
this.hours = hours;
this.totalWage = ( wage * days * hours);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to Employee Wage Computation Program\n");
System.out.println("How many companies are there: ");
int size = sc.nextInt();
Employee[] emp = new Employee[size];
for(int i =0; i < size; i++){
System.out.println("Enter details for company "+i);
System.out.println("Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println("Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println("Enter the number of working hours in a day :");
int hours = sc.nextInt();
emp[i] = new Employee(wage, days, hours);
}
Int i = 0;
for (Employee p : emp){
i++;
System.out.println("Total Wage for Company "+i+" is :"+ p.totalWage);
}

}
}
Output:

UC 10
Ability to manage employee wage for multiple companies
Code:
import java.util.Scanner;
public class Employee {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to Employee Wage Computation Program\n");
System.out.println("How many companies are there: ");
int size = sc.nextInt();
CompanyEmpWage[] cp = new CompanyEmpWage[size];
for(int i =0; i < size; i++){
System.out.println("Enter details for company "+(i+1));
System.out.println("Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println("Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println("Enter the number of working hours in a day :");
int hours = sc.nextInt();
cp[i] = new CompanyEmpWage(wage, days, hours);
}
int i=0;
for (CompanyEmpWage p : cp){
i++;
System.out.println("Total Wage for Company "+i+" is :"+ p.totalWage);

}
}
}
class CompanyEmpWage{
int wage;
int days;
int hours;
int totalWage;
CompanyEmpWage(int wage, int days, int hours){
this.wage = wage;
this.days = days;
this.hours = hours;
this.totalWage = (wage * days * hours);
}
}
Output:

UC 11:
Code:
import java.util.Scanner;
public class Employee implements computerEmpWage{
int workingDays = 0;
int totalHours = 0;
int empHours = 0;
int empRatePerHour = 20;

int salary = 0;
public void companyMethod(String companyName, int wage, int days, int hours){
int totalWage = ( wage * days * hours);
System.out.println("Total wage for a employee working full-time for a
month:"+totalWage);
}

public static void main(String[] args) {
Employee ep = new Employee();
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to Employee Wage Computation Program\n");
String companyName = "Tata";
System.out.println("Company name :"+companyName);
System.out.println("Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println("Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println("Enter the number of working hours in a day :");
int hours = sc.nextInt();
ep.companyMethod(companyName, wage, days, hours);
}
}
interface computerEmpWage{
public void companyMethod(String companyName,int wage,int days,int hours);
}
Output:

UC 12:
Refactor to have list of multiple companies to manage employee wage
Code:

import java.util.*;
public class Employee {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<CompanyEmpWage> cp = new ArrayList<CompanyEmpWage>();
boolean end_key = true;
System.out.println(" Welcome to Employee Wage Computation Program\n");
while (end_key) {
System.out.println(" 1: Add 2: View your company's total wage 9: Exit");
int choice = sc.nextInt();
int i = 0;
switch (choice) {
case 1:
sc.nextLine();
System.out.println(" Enter name of your company ");
String name = sc.nextLine();
System.out.println(" Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println(" Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println(" Enter the number of working hours in a day :");
int hours = sc.nextInt();
cp.add(new CompanyEmpWage(name ,wage, days, hours));
break;
case 2:
sc.nextLine();
System.out.println(" Enter the name of your company to view total wage:");
String update = sc.nextLine();
Iterator<CompanyEmpWage> iter = cp.iterator();
while (iter.hasNext()) {
CompanyEmpWage data = iter.next();
if (update.equals(data.getRecord())) {
System.out.println(" Your company's total wage is :"+data.getValues());
}
}
break;
case 9:
end_key = false;
break;

default:
System.out.println(" Enter valid input");
break;
}
}
}
}
class CompanyEmpWage{
String name;
int wage;
int days;
int hours;
int totalWage;
CompanyEmpWage(String name,int wage, int days, int hours){
this.name = name;
this.wage = wage;
this.days = days;
this.hours = hours;
this.totalWage = (wage * days * hours);
}
public int getValues(){
return this.totalWage;
}
public String getRecord(){
return this.name;
}
}

Output:

UC 13 :
Store the daily wages along total wages.
Code:
import java.util.*;
public class Employee {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<CompanyEmpWage> cp = new ArrayList<CompanyEmpWage>();
boolean end_key = true;
System.out.println(" Welcome to Employee Wage Computation Program\n");
while (end_key) {
System.out.println(" 1: Add 2: View your company's total wage 3: Exit");
int choice = sc.nextInt();
int i = 0;
switch (choice) {
case 1:
sc.nextLine();
System.out.println(" Enter name of your company ");
String name = sc.nextLine();
System.out.println(" Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println(" Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println(" Enter the number of working hours in a day :");
int hours = sc.nextInt();
System.out.println(" Enter the number of Employes in company :");
int numEmp = sc.nextInt();

cp.add(new CompanyEmpWage(name ,wage, days, hours , numEmp));
break;
case 2:
sc.nextLine();
System.out.println(" Enter the name of your company to view total wage:");
String update = sc.nextLine();
Iterator<CompanyEmpWage> iter = cp.iterator();
while (iter.hasNext()) {
CompanyEmpWage data = iter.next();
if (update.equals(data.getRecord())) {
System.out.println(" Your company's TotalWagePerDay is

:"+data.getValues());

System.out.println(" Your company's TotalWagePerMonth is

:"+data.getMonth());
}
}
break;
case 3:
end_key = false;
break;
default:
System.out.println(" Enter valid input");
break;
}
}
}
}
class CompanyEmpWage{
String name;
int wage;
int days;
int hours;
int companyTotalWagePerDay;
int companyTotalWagePerMonth;
CompanyEmpWage(String name,int wage, int days, int hours, int numEmp ){
this.name = name;
this.wage = wage;
this.days = days;
this.hours = hours;
this.companyTotalWagePerDay = (wage * numEmp * hours);
this.companyTotalWagePerMonth = (wage * numEmp * hours * days);

}
public int getValues(){
return this.companyTotalWagePerDay;
}
public int getMonth(){
return this.companyTotalWagePerMonth;
}
public String getRecord(){
return this.name;
}
}
Output:

UC14:
Total Wages when Requried by company
Code:
import java.util.*;
public class Employee {
static void totalWageOfCompany(ArrayList<CompanyEmpWage> cp){
for ( CompanyEmpWage p : cp ) {
System.out.println("company name :"+p.name+" companyTotalWage

:"+p.companyTotalWagePerMonth);

}
}
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
ArrayList<CompanyEmpWage> cp = new ArrayList<CompanyEmpWage>();
boolean end_key = true;
System.out.println(" Welcome to Employee Wage Computation Program\n");
while (end_key) {
System.out.println(" 1: Add 2: View your company's total wage 3: Total Wage Of
Companys 4: Exit");
int choice = sc.nextInt();
int i = 0;
switch (choice) {
case 1:
sc.nextLine();
System.out.println(" Enter name of your company ");
String name = sc.nextLine();
System.out.println(" Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println(" Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println(" Enter the number of working hours in a day :");
int hours = sc.nextInt();
System.out.println(" Enter the number of Employes in company :");
int numEmp = sc.nextInt();
cp.add(new CompanyEmpWage(name ,wage, days, hours , numEmp));
break;
case 2:
sc.nextLine();
System.out.println(" Enter the name of your company to view total wage:");
String update = sc.nextLine();
Iterator<CompanyEmpWage> iter = cp.iterator();
while (iter.hasNext()) {
CompanyEmpWage data = iter.next();
if (update.equals(data.getRecord())) {
System.out.println(" Your company's TotalWagePerDay is

:"+data.getValues());

System.out.println(" Your company's TotalWagePerMonth is

:"+data.getMonth());
}
}
break;
case 3:
totalWageOfCompany(cp);

break;
case 4:
end_key = false;
break;
default:
System.out.println(" Enter valid input");
break;
}
}
}
}
class CompanyEmpWage{
String name;
int wage;
int days;
int hours;
int companyTotalWagePerDay;
int companyTotalWagePerMonth;
CompanyEmpWage(String name,int wage, int days, int hours, int numEmp ){
this.name = name;
this.wage = wage;
this.days = days;
this.hours = hours;
this.companyTotalWagePerDay = (wage * numEmp * hours);
this.companyTotalWagePerMonth = (wage * numEmp * hours * days);
}
public int getValues(){
return this.companyTotalWagePerDay;
}
public int getMonth(){
return this.companyTotalWagePerMonth;
}
public String getRecord(){
return this.name;
}
}
