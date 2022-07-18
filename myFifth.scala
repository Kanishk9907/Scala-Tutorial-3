object myFifth{
  def easyPace(d1:Double):Double={         //d1 and d2 should be insert in km
    return d1*8;
  }

  def tempo(d2:Double):Double={
    return d2*7;
  }

  def main(args:Array[String])={
    println("Total running time :" + (easyPace(2)+tempo(3)+easyPace(2))+"min");
  }
}

