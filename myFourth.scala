object myFourth{
  def price(count:Int):Double={
    var pure_fee:Double=0;
    pure_fee=24.95*0.6*count;

    if(count<=50)
    {
      return pure_fee+count*3;
    }
    else
    {
      return pure_fee+50*3+(count-50)*0.75;
    }
  }

  def main(args:Array[String])={
    println("Whole sale cost : Rs." + price(60));
  }
}
