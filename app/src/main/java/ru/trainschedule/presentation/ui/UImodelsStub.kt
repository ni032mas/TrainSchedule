package ru.trainschedule.presentation.ui

import ru.trainschedule.domain.models.Carrier
import ru.trainschedule.domain.models.CarrierCodes
import ru.trainschedule.domain.models.Place
import ru.trainschedule.domain.models.Price
import ru.trainschedule.domain.models.Segment
import ru.trainschedule.domain.models.SegmentStation
import ru.trainschedule.domain.models.SegmentStationType
import ru.trainschedule.domain.models.SegmentThread
import ru.trainschedule.domain.models.Station
import ru.trainschedule.domain.models.StationCodes
import ru.trainschedule.domain.models.StationType
import ru.trainschedule.domain.models.TicketsInfo
import ru.trainschedule.domain.models.TransportSubtype
import ru.trainschedule.domain.models.TransportType
import ru.trainschedule.presentation.ui.models.SelectStationState
import ru.trainschedule.presentation.ui.models.SelectedDate

internal val selectStationStateStub = SelectStationState(
    isLoading = true,
    stationFrom = Station(
        direction = "Краснополянское",
        codes = StationCodes(
            esrCode = "532839",
            yandexCode = "s9612922"
        ),
        stationType = StationType.TRAIN_STATION,
        transportType = TransportType.TRAIN,
        title = "Хоста",
        longitude = 39.86366F,
        latitude = 43.511948F,
    ),
    stationTo = Station(
        direction = "Туапсинское",
        codes = StationCodes(
            esrCode = "524404",
            yandexCode = "s9613602"
        ),
        stationType = StationType.TRAIN_STATION,
        transportType = TransportType.TRAIN,
        title = "Краснодар-1",
        longitude = 0.0F,
        latitude = 0.0F,
    ),
    segments = listOf(
        Segment(
            arrival = "2024-11-30T10:11:00+03:00",
            arrivalPlatform = "",
            arrivalTerminal = null,
            departure = "2024-11-30T02:21:00+03:00",
            departurePlatform = "",
            departureTerminal = null,
            duration = 18300.0F,
            from = SegmentStation(
                code = "s9612922",
                popularTitle = "",
                shortTitle = "",
                stationType = StationType.STATION,
                stationTypeName = "станция",
                title = "Хоста",
                transportType = TransportType.TRAIN,
                type = SegmentStationType.STATION
            ),
            hasTransfers = false,
            startDate = "2024-11-30",
            stops = "",
            thread = SegmentThread(
                carrier = Carrier(
                    address = "Москва, ул. Новая Басманная , д. 2",
                    code = 112,
                    codes = CarrierCodes(
                        iata = null,
                        icao = null,
                        sirena = null
                    ),
                    contacts = """Единая телефонная линия: 
                                            |+7 (800) 775-00-00 (звонок бесплатный из всех регионов
                                            | РФ).""".trimMargin(),
                    email = "info@rzd.ru",
                    logo = "https://yastat.net/s3/rasp/media/data/company/logo/logo.gif",
                    logoSvg = null,
                    phone = "+7 (800) 775-00-00",
                    title = "РЖД/ФПК",
                    url = "http://www.rzd.ru/"
                ),
                expressType = null,
                number = "808Э",
                shortTitle = "Аэропорт Сочи — Ростов-на-Дону",
                threadMethodLink = "Alana",
                title = "Аэропорт Сочи — Ростов-на-Дону",
                transportSubtype = TransportSubtype(
                    code = "lastdal",
                    color = "#CC6600",
                    title = "«Ласточка»"
                ),
                transportType = TransportType.TRAIN,
                uid = "808YE_4_2",
                vehicle = null
            ),
            ticketsInfo = TicketsInfo(
                etMarker = false,
                places = listOf(
                    Place(
                        currency = "Rebecca",
                        name = "Vanity",
                        price = Price(cents = 7985, whole = 1076)
                    )
                )
            ),
            to = SegmentStation(
                code = "s9613602",
                popularTitle = "",
                shortTitle = "",
                stationType = StationType.STATION,
                stationTypeName = "станция",
                title = "Краснодар-1",
                transportType = TransportType.TRAIN,
                type = SegmentStationType.STATION
            )
        ),

        Segment(
            arrival = "2024-11-30T10:11:00+03:00",
            arrivalPlatform = "",
            arrivalTerminal = null,
            departure = "2024-11-30T02:21:00+03:00",
            departurePlatform = "",
            departureTerminal = null,
            duration = 18300.0F,
            from = SegmentStation(
                code = "s9612922",
                popularTitle = "",
                shortTitle = "",
                stationType = StationType.STATION,
                stationTypeName = "станция",
                title = "Хоста",
                transportType = TransportType.TRAIN,
                type = SegmentStationType.STATION
            ),
            hasTransfers = false,
            startDate = "2024-11-30",
            stops = "",
            thread = SegmentThread(
                carrier = Carrier(
                    address = "Москва, ул. Новая Басманная , д. 2",
                    code = 112,
                    codes = CarrierCodes(
                        iata = null,
                        icao = null,
                        sirena = null
                    ),
                    contacts = """Единая телефонная линия: 
                                            |+7 (800) 775-00-00 (звонок бесплатный из всех регионов
                                            | РФ).""".trimMargin(),
                    email = "info@rzd.ru",
                    logo = "https://yastat.net/s3/rasp/media/data/company/logo/logo.gif",
                    logoSvg = null,
                    phone = "+7 (800) 775-00-00",
                    title = "РЖД/ФПК",
                    url = "http://www.rzd.ru/"
                ),
                expressType = null,
                number = "808Э",
                shortTitle = "Аэропорт Сочи — Ростов-на-Дону",
                threadMethodLink = "Alana",
                title = "Аэропорт Сочи — Ростов-на-Дону",
                transportSubtype = TransportSubtype(
                    code = "lastdal",
                    color = "#CC6600",
                    title = "«Ласточка»"
                ),
                transportType = TransportType.TRAIN,
                uid = "808YE_4_2",
                vehicle = null
            ),
            ticketsInfo = TicketsInfo(
                etMarker = false,
                places = listOf(
                    Place(
                        currency = "Rebecca",
                        name = "Vanity",
                        price = Price(cents = 7985, whole = 1076)
                    )
                )
            ),
            to = SegmentStation(
                code = "s9613602",
                popularTitle = "",
                shortTitle = "",
                stationType = StationType.STATION,
                stationTypeName = "станция",
                title = "Краснодар-1",
                transportType = TransportType.TRAIN,
                type = SegmentStationType.STATION
            )
        ),
        Segment(
            arrival = "2024-11-30T10:11:00+03:00",
            arrivalPlatform = "",
            arrivalTerminal = null,
            departure = "2024-11-30T02:21:00+03:00",
            departurePlatform = "",
            departureTerminal = null,
            duration = 18300.0F,
            from = SegmentStation(
                code = "s9612922",
                popularTitle = "",
                shortTitle = "",
                stationType = StationType.STATION,
                stationTypeName = "станция",
                title = "Хоста",
                transportType = TransportType.TRAIN,
                type = SegmentStationType.STATION
            ),
            hasTransfers = false,
            startDate = "2024-11-30",
            stops = "",
            thread = SegmentThread(
                carrier = Carrier(
                    address = "Москва, ул. Новая Басманная , д. 2",
                    code = 112,
                    codes = CarrierCodes(
                        iata = null,
                        icao = null,
                        sirena = null
                    ),
                    contacts = """Единая телефонная линия: 
                                            |+7 (800) 775-00-00 (звонок бесплатный из всех регионов
                                            | РФ).""".trimMargin(),
                    email = "info@rzd.ru",
                    logo = "https://yastat.net/s3/rasp/media/data/company/logo/logo.gif",
                    logoSvg = null,
                    phone = "+7 (800) 775-00-00",
                    title = "РЖД/ФПК",
                    url = "http://www.rzd.ru/"
                ),
                expressType = null,
                number = "808Э",
                shortTitle = "Аэропорт Сочи — Ростов-на-Дону",
                threadMethodLink = "Alana",
                title = "Аэропорт Сочи — Ростов-на-Дону",
                transportSubtype = TransportSubtype(
                    code = "lastdal",
                    color = "#CC6600",
                    title = "«Ласточка»"
                ),
                transportType = TransportType.TRAIN,
                uid = "808YE_4_2",
                vehicle = null
            ),
            ticketsInfo = TicketsInfo(
                etMarker = false,
                places = listOf(
                    Place(
                        currency = "Rebecca",
                        name = "Vanity",
                        price = Price(cents = 7985, whole = 1076)
                    )
                )
            ),
            to = SegmentStation(
                code = "s9613602",
                popularTitle = "",
                shortTitle = "",
                stationType = StationType.STATION,
                stationTypeName = "станция",
                title = "Краснодар-1",
                transportType = TransportType.TRAIN,
                type = SegmentStationType.STATION
            )
        )
    ),
    selectedDate = SelectedDate.Today(System.currentTimeMillis()),
    stations = listOf(
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Хоста",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        ),
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Краснодар",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        ),
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Москва",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        ),
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Новосибирск",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        ),
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Тверь",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        ),
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Сочи",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        ),
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Сочино",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        ),
        Station(
            direction = "",
            codes = StationCodes(
                esrCode = "",
                yandexCode = "s9612922"
            ),
            stationType = StationType.STATION,
            title = "Аэропорт Сочи",
            longitude = 0F,
            latitude = 0F,
            transportType = TransportType.TRAIN,
        )
    )
)