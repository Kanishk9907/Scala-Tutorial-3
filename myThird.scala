object myThird{
  def diskVol(radius:Double):Double={
    return 4/3*math.Pi*radius*radius*radius;
  }

  def main(args:Array[String])={
    println("Volume of the Sphere :" + diskVol(5));
  }
}
