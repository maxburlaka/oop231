package oop

class Reader(val FIO: String, val number_ticket: Int, val faculty: String, val data_of_born: String, val mobile_number: Int, val number_bock: Int){

    fun takeBook(){
        println("$FIO взял $number_bock книги: Приключения, Словарь, Энциклопедия")
    }
    fun returnBook(){
        println("$FIO вернул $number_bock книги: Приключения, Словарь, Энциклопедия")
    }
}

class Bock(val name: String, val author: String){

    fun returnBook(FIO: String, number_bock: Int) {
        println("$FIO вернул $number_bock книги: $name , $author")
    }
}

fun main(){

    val re = Reader("Burlaka.M.V", 2315, "AKIT", "12.02.2002",678422956,3)
    val returns = Bock("Shining","Stephen King");
    re.takeBook()
    returns.returnBook("Burlaka.M.V", 1)
}