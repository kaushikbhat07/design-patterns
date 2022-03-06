package com.designpatterns.Prototype;

public interface Item extends Cloneable
{
	Item clone() throws CloneNotSupportedException;
}