import scalawithcats.typeclass.{Json, JsonWriter, Person}
import scalawithcats.typeclass.JsonWriterInstances._
import scalawithcats.typeclass.JsonSyntax._

Json.toJson(Person("Dave", "dave@example.com"))
Person("John", "john@example.com").toJson

implicitly[JsonWriter[String]]
Json.toJson(Option("A string"))