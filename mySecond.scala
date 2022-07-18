object mySecond{
  def tempConvert(celcius:Double):Double={
    return celcius*1.8000+32.00;
  }

  def main(args:Array[String])={
    println("Temperature in Fahrenheit :" + tempConvert(35));
  }
}
