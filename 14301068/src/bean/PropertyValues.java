package bean;

import java.util.ArrayList;
import java.util.List;

//��һ����ı����洢��һ��list��
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
