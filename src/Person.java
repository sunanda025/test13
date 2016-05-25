/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.24.0-78d6971 modeling language!*/



/**
 * Introductory example of Umple showing classes,
 * attribute, association, generalization, methods
 * and the mixin capability. Generate java and run this.
 * 
 * The output will be:
 * The mentor of Tom The Student is Nick The Mentor
 * The students of Nick The Mentor are [Tom The Student]
 */
// line 11 "model.ump"
// line 30 "model.ump"
// line 43 "model.ump"
public class Person
{

  private static final Student Tom1 = null;
//------------------------
  // MEMBER VARIABLES
  //------------------------

  //Person Attributes
  private String name;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Person(String aName)
  {
    name = aName;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setName(String aName)
  {
    boolean wasSet = false;
    name = aName;
    wasSet = true;
    return wasSet;
  }

  /**
   * Attribute, string by default
   */
  public String getName()
  {
    return name;
  }

  public void delete()
  {}

  // line 14 "model.ump"
  public String toString(){
    return(getName());
  }


  /**
   * Notice that we are defining more contents for Person
   * This uses Umple's mixin capability
   * 
   * 
   * 
   */
  
  
  
  
  
  // line 35 "model.ump"
   public static  void main(String [] args){
    Thread.currentThread().setUncaughtExceptionHandler(new UmpleExceptionHandler());
    Thread.setDefaultUncaughtExceptionHandler(new UmpleExceptionHandler());
    
    Mentor m = new Mentor("Nick The Mentor");
   // Student s1 = new Student("Tom1 The Student");
    
    Student[] s={new Student("Tom1 The Student"),
    		new Student("Tom2 The Student"),
    		new Student("Tom3 The Student"),
    		new Student("Tom4 The Student"),
    		new Student("Tom5 The Student"),
    		new Student("Tom6 The Student"),
    		new Student("Tom7 The Student"),
    		new Student("Tom8 The Student"),
    		new Student("Tom9 The Student"),
    		new Student("Tom10 The Student"),
    		new Student("Tom11 The Student"),
    		new Student("Tom12 The Student"),
    		new Student("Tom13 The Student"),
    		new Student("Tom14 The Student"),
    		new Student("Tom15 The Student"),
    		new Student("Tom16 The Student"),
    		new Student("Tom17 The Student"),
    		new Student("Tom18 The Student")
    		
    
    
    
    };
    

    
    for(int i=0;i<=18;i++)
    {
    	
    if(i<=m.maximumNumberOfStudents())
    {
    	System.out.println("Student"+(i+1));
    	s[i].setMentor(m);
    }
    else
    {
    	System.out.println("maximum students already taken");
    	break;
    }
    	
    }
    
    
    
    
    
    
    
   // s.setMentor(m);
    
    
    
    
    
   //System.out.println("The mentor of "  + s  + " is " +  s.getMentor());
  System.out.println("The students of " +  m  + " are " +  m.getStudents());
  }
   
   
   
   
   
   
   
   
   
   
   
   

  public static class UmpleExceptionHandler implements Thread.UncaughtExceptionHandler
  {
    public void uncaughtException(Thread t, Throwable e)
    {
      translate(e);
      if(e.getCause()!=null)
      {
        translate(e.getCause());
      }
      e.printStackTrace();
    }
    public void translate(Throwable e)
    {
      java.util.List<StackTraceElement> result = new java.util.ArrayList<StackTraceElement>();
      StackTraceElement[] elements = e.getStackTrace();
      try
      {
        for(StackTraceElement element:elements)
        {
          String className = element.getClassName();
          String methodName = element.getMethodName();
          boolean methodFound = false;
          int index = className.lastIndexOf('.')+1;
          try {
            java.lang.reflect.Method query = this.getClass().getMethod(className.substring(index)+"_"+methodName,new Class[]{});
            UmpleSourceData sourceInformation = (UmpleSourceData)query.invoke(this,new Object[]{});
            for(int i=0;i<sourceInformation.size();++i)
            {
              int distanceFromStart = element.getLineNumber()-sourceInformation.getJavaLine(i)-(("main".equals(methodName))?2:0);
              if(distanceFromStart>=0&&distanceFromStart<=sourceInformation.getLength(i))
              {
                result.add(new StackTraceElement(element.getClassName(),element.getMethodName(),sourceInformation.getFileName(i),sourceInformation.getUmpleLine(i)+distanceFromStart));
                methodFound = true;
                break;
              }
            }
          }
          catch (Exception e2){}
          if(!methodFound)
          {
            result.add(element);
          }
        }
      }
      catch (Exception e1)
      {
        e1.printStackTrace();
      }
      e.setStackTrace(result.toArray(new StackTraceElement[0]));
    }
  //The following methods Map Java lines back to their original Umple file / line    
    public UmpleSourceData Person_toString(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(13).setJavaLines(60).setLengths(3);}
    public UmpleSourceData Person_main(){ return new UmpleSourceData().setFileNames("model.ump").setUmpleLines(34).setJavaLines(70).setLengths(3);}

  }
  public static class UmpleSourceData
  {
    String[] umpleFileNames;
    Integer[] umpleLines;
    Integer[] umpleJavaLines;
    Integer[] umpleLengths;
    
    public UmpleSourceData(){
    }
    public String getFileName(int i){
      return umpleFileNames[i];
    }
    public Integer getUmpleLine(int i){
      return umpleLines[i];
    }
    public Integer getJavaLine(int i){
      return umpleJavaLines[i];
    }
    public Integer getLength(int i){
      return umpleLengths[i];
    }
    public UmpleSourceData setFileNames(String... filenames){
      umpleFileNames = filenames;
      return this;
    }
    public UmpleSourceData setUmpleLines(Integer... umplelines){
      umpleLines = umplelines;
      return this;
    }
    public UmpleSourceData setJavaLines(Integer... javalines){
      umpleJavaLines = javalines;
      return this;
    }
    public UmpleSourceData setLengths(Integer... lengths){
      umpleLengths = lengths;
      return this;
    }
    public int size(){
      return umpleFileNames.length;
    }
  } 
}