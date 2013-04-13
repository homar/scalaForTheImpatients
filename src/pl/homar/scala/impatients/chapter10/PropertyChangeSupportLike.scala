package pl.homar.scala.impatients.chapter10

import java.beans.PropertyChangeSupport
import java.beans.PropertyChangeListener
import java.beans.PropertyChangeEvent
import java.awt.Point

trait PropertyChangeSupportLike {
	private val propertyChangeSupport = new PropertyChangeSupport(this)
	
	def addPropertyChangeListener(listener: PropertyChangeListener){
		propertyChangeSupport.addPropertyChangeListener(listener)
	}
	
	def addPropertyChangeListener(propertyName: String, listener: PropertyChangeListener){
		propertyChangeSupport.addPropertyChangeListener(propertyName, listener)
	}
	
	def fireIndexedPropertyChange(propertyName: String, index: Int, oldValue: Boolean, newValue: Boolean ) = {
		propertyChangeSupport.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
	}
	
	def fireIndexedPropertyChange(propertyName: String , index: Int, oldValue: Int, newValue: Int) = {
	  propertyChangeSupport.fireIndexedPropertyChange(propertyName, index, oldValue, newValue);
	}
	
	def fireIndexedPropertyChange(propertyName: String , index: Int, oldValue: Any, newValue: Any)= {
	  propertyChangeSupport.fireIndexedPropertyChange(propertyName, index, oldValue, newValue)
	}
	
	def firePropertyChange(event: PropertyChangeEvent ) = {
	  propertyChangeSupport.firePropertyChange(event)
	}
	
	def firePropertyChange(propertyName: String, oldValue: Boolean, newValue: Boolean) = {
	  propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue)
	}
	
	def firePropertyChange(propertyName: String, oldValue: Int, newValue: Int) = {
	  propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue)
	}
	
	def firePropertyChange(propertyName: String, oldValue: Any, newValue: Any) = {
	  propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue)
	}
	
	def getPropertyChangeListeners() = {
	  propertyChangeSupport.getPropertyChangeListeners()
	}
	
	def getPropertyChangeListeners(propertyName: String) = {
	  propertyChangeSupport.getPropertyChangeListeners(propertyName)
	}
	
	def hasListeners(propertyName: String ) = {
	  propertyChangeSupport.hasListeners(propertyName)
	}
	
	def removePropertyChangeListener(listener: PropertyChangeListener)  = {
	  propertyChangeSupport.removePropertyChangeListener(listener)
	}
	
	def removePropertyChangeListener(propertyName: String, listener:  PropertyChangeListener) = {
	  propertyChangeSupport.removePropertyChangeListener(propertyName, listener)
	}
}

class MyPoint(x: Int, y: Int) extends Point(x,y) with PropertyChangeSupportLike