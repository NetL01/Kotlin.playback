package ru.licpnz.gameback

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GamebackApplication

fun main(args: Array<String>) {
	runApplication<GamebackApplication>(*args)
}
