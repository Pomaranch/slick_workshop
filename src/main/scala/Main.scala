import model.{CountryTable, FilmTable, FilmToCastTable, FilmToCountry, FilmToCountryTable, FilmToGenreTable, GenreTable, StaffTable}
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Await
import scala.concurrent.duration.Duration


object Main extends App{
  val db = Database.forURL("jdbc:postgresql://127.0.0.1/filmoteka?user=pomaranch&password=111")

  //Await.result(db.run(CountryTable.table.schema.create), Duration.Inf)
  //Await.result(db.run(FilmTable.table.schema.create), Duration.Inf)
  //Await.result(db.run(StaffTable.table.schema.create), Duration.Inf)
  //Await.result(db.run(GenreTable.table.schema.create), Duration.Inf)
  //Await.result(db.run(FilmToCountryTable.table.schema.create), Duration.Inf)
  //Await.result(db.run(FilmToCastTable.table.schema.create), Duration.Inf)
  //Await.result(db.run(FilmToGenreTable.table.schema.create), Duration.Inf)




}