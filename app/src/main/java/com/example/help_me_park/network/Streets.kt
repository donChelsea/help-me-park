package com.example.help_me_park.network

object Streets {
    private val parkingLocation1 = ParkingLocation(
        37.739164, -122.431156
    )
    private val parkingLocation2 = ParkingLocation(
        37.741875, -122.431559
    )
    private val parkingLocation3 = ParkingLocation(
        37.748971, -122.437861
    )


    private val street1 = StreetParking(
        parkingLocation1,
        true,
        listOf("Pay at meter 6am - 6pm", "Alternate Parking on Monday, Wednesday, Friday"),
        1.00,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Blue_Disc_Parking_Area_Markings_Blue_Paint.JPG/1200px-Blue_Disc_Parking_Area_Markings_Blue_Paint.JPG"
    )

    private val street2 = StreetParking(
        parkingLocation2,
        false,
        listOf("Pay at meter 7am - 7pm", "Alternate Parking on Tuesday, Thursday"),
        0.50,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Blue_Disc_Parking_Area_Markings_Blue_Paint.JPG/1200px-Blue_Disc_Parking_Area_Markings_Blue_Paint.JPG"
    )

    private val street3 = StreetParking(
        parkingLocation3,
        true,
        emptyList(),
        0.00,
        "https://upload.wikimedia.org/wikipedia/commons/thumb/1/19/Blue_Disc_Parking_Area_Markings_Blue_Paint.JPG/1200px-Blue_Disc_Parking_Area_Markings_Blue_Paint.JPG"
    )

    val allStreets = listOf(street1, street2, street3)


}