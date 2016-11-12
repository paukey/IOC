package test;


public class boss {
  private office office;
  private car car;
  
  @Autowired
  public boss(car car,office office){
      this.car = car;
      this.office = office;
  }

  public String tostring(){
	  return "this boss has "+car.tostring()+" and in "+office.tostring();
  }
}
