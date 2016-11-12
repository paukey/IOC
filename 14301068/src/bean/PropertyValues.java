package bean;

import java.util.ArrayList;
import java.util.List;

//将一个类的变量存储到一个list上
public class PropertyValues {
	private List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();
	public void AddPropertyValue(PropertyValue propertyValue){
		propertyValues.add(propertyValue);
	}
	public List<PropertyValue> GetPropertyValues()
	{
		return propertyValues;
	}
}
