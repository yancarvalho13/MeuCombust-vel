package com.example.gasoline.domain

class FillUp(
    val id: Long,
    val nameGasStation: String,
    val price: Double,
    val liters: Double,
)

//Fake Objects to test
val fill1 = FillUp(
    id = 1,
    nameGasStation = "Br-Brotas",
    price = 4.54,
    liters = 7.0,
)

val fill2 = FillUp(
    id = 2,
    nameGasStation = "Shell-PraiaGrande",
    price = 6.99,
    liters = 6.4,
)

val fill3 = FillUp(
    id = 3,
    nameGasStation = "Ipiranga-SimoesFilho",
    price = 5.65,
    liters = 3.4,
)


