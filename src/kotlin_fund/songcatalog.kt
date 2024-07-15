package kotlin_fund

fun main() {
    val brunoSong = catalog("We Don't Talk About Bruno", "Encanto Cast", 2022, 1_000_000)
    brunoSong.show()
    println(brunoSong.isPopular())
}

class catalog {
    private var title: String
    private var artist: String
    private var yearPublish: Int
    private var playCount: Int

    constructor(title: String, artist: String, yearPublish: Int, playCount: Int) {
        this.playCount = playCount
        this.yearPublish = yearPublish
        this.artist = artist
        this.title = title
    }

    fun show() {
        println("$title, performed by $artist, was released in $yearPublish.")
    }

    fun isPopular(): Boolean {
        if (playCount >= 1000)
            return true
        else return false
    }

}
