package cse512

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {
    // YOU NEED TO CHANGE THIS PART
    var rectangle = new Array[String](4)
    rectangle = queryRectangle.split(",")
    
    var x1 = rectangle(0).trim.toDouble
    var y1= rectangle(1).trim.toDouble
    var x2= rectangle(2).trim.toDouble
    var y2 = rectangle(3).trim.toDouble

    var point = new Array[String](2)
    point = pointString.split(",")
    var p1 = point(0).trim.toDouble
    var p2 = point(1).trim.toDouble

    var minX = math.min(x1, x2)
    var maxX = math.max(x1, x2)
    var minY = math.min(y1, y2)
    var maxY = math.max(y1, y2)


    if(p1  >= minX && p1 <= maxX &&  p2 >= minY && p2 <= maxY )
      return true

    return false
	}
}
