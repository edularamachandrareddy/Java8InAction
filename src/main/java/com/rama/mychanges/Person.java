package com.rama.mychanges;

public class Person {
private int pid;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((ciyt == null) ? 0 : ciyt.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + pid;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person other = (Person) obj;
	if (ciyt == null) {
		if (other.ciyt != null)
			return false;
	} else if (!ciyt.equals(other.ciyt))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (pid != other.pid)
		return false;
	return true;
}
@Override
public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", ciyt=" + ciyt + "]";
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCiyt() {
	return ciyt;
}
public void setCiyt(String ciyt) {
	this.ciyt = ciyt;
}
private String name;
public Person(int pid, String name, String ciyt) {
	super();
	this.pid = pid;
	this.name = name;
	this.ciyt = ciyt;
}
public Person()
{}
private String ciyt;

}
