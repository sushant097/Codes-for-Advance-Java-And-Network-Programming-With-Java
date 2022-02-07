package example;



import java.beans.*;

public class SimpleBeanIntrospection
{
    private final String name = "SimpleBean";
    private int size;

    public String getName()
    {
        return this.name;
    }

    public int getSize()
    {
        return this.size;
    }

    public void setSize( int size )
    {
        this.size = size;
    }

    public static void main( String[] args )
            throws IntrospectionException
    {
        BeanInfo info = Introspector.getBeanInfo( SimpleBeanIntrospection.class );
        for ( PropertyDescriptor pd : info.getPropertyDescriptors() )
            System.out.println( pd.getName() );
         	   
        // only simpleBean property
        BeanInfo info2 = Introspector.getBeanInfo( SimpleBeanIntrospection.class, Object.class );
        for ( PropertyDescriptor pd : info2.getPropertyDescriptors() )
            System.out.println( pd.getName() );
        
    }
}