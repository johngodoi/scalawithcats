package scalawithcats.typeclass

// Define a very simple Json AST
sealed trait Json
final case class JsObject(get: Map[String, Json]) extends Json
final case class JsString(get: String) extends Json
final case class JsNumber(get: Double) extends Json
case object JsNull extends Json

// The "serialize to JSON" behaviour is encoded in this trait
trait JsonWriter[A] {
  def write(value: A): Json
}

object Json {
  def toJson[A](value: A)(implicit w: JsonWriter[A]):Json = w.write(value)
}