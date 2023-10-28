package com.example.assignment_2

import kotlin.random.Random

data class GameModel(
    var gameid :String="-1",
    var filledpos :MutableList<String> = mutableListOf("","","","","","","","",""),
    var winner: String="",
    var gamestatus: GameStatus=GameStatus.CREATED,
    var currentplayer : String=(arrayOf("X","O"))[Random.nextInt(2)]
)
enum class GameStatus{
    CREATED,
    JOINED,
    INPROGRESS,
    FINISHED
}