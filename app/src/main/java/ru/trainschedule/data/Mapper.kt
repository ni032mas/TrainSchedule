package ru.trainschedule.data

import ru.trainschedule.data.response.AllStationResponse
import ru.trainschedule.data.response.CarrierCodesResponse
import ru.trainschedule.data.response.CarrierResponse
import ru.trainschedule.data.response.CountryCodesResponse
import ru.trainschedule.data.response.CountryResponse
import ru.trainschedule.data.response.ExpressTypeResponse
import ru.trainschedule.data.response.IntervalResponse
import ru.trainschedule.data.response.IntervalSegmentResponse
import ru.trainschedule.data.response.IntervalSegmentThreadResponse
import ru.trainschedule.data.response.PlaceResponse
import ru.trainschedule.data.response.PriceResponse
import ru.trainschedule.data.response.RegionCodesResponse
import ru.trainschedule.data.response.RegionResponse
import ru.trainschedule.data.response.SearchFromToResponse
import ru.trainschedule.data.response.SearchResponse
import ru.trainschedule.data.response.SegmentStationResponse
import ru.trainschedule.data.response.SegmentStationTypeResponse
import ru.trainschedule.data.response.SettlementCodesResponse
import ru.trainschedule.data.response.SettlementResponse
import ru.trainschedule.data.response.StationCodesResponse
import ru.trainschedule.data.response.StationResponse
import ru.trainschedule.data.response.StationTypeResponse
import ru.trainschedule.data.response.TicketsInfoResponse
import ru.trainschedule.data.response.TransportSubtypeResponse
import ru.trainschedule.data.response.TransportTypeResponse
import ru.trainschedule.domain.models.Carrier
import ru.trainschedule.domain.models.CarrierCodes
import ru.trainschedule.domain.models.Country
import ru.trainschedule.domain.models.CountryCodes
import ru.trainschedule.domain.models.ExpressType
import ru.trainschedule.domain.models.Interval
import ru.trainschedule.domain.models.IntervalSegment
import ru.trainschedule.domain.models.IntervalSegmentThread
import ru.trainschedule.domain.models.Place
import ru.trainschedule.domain.models.Price
import ru.trainschedule.domain.models.Region
import ru.trainschedule.domain.models.RegionCodes
import ru.trainschedule.domain.models.Search
import ru.trainschedule.domain.models.SearchFromTo
import ru.trainschedule.domain.models.SegmentStation
import ru.trainschedule.domain.models.SegmentStationType
import ru.trainschedule.domain.models.Settlement
import ru.trainschedule.domain.models.SettlementCodes
import ru.trainschedule.domain.models.Station
import ru.trainschedule.domain.models.StationCodes
import ru.trainschedule.domain.models.StationType
import ru.trainschedule.domain.models.TicketsInfo
import ru.trainschedule.domain.models.TransportSubtype
import ru.trainschedule.domain.models.TransportType

internal fun AllStationResponse.toDomain() = countries.map { it.toDomain() }

internal fun CountryResponse.toDomain(): Country = Country(
    codes = codes.toDomain(),
    regions = regions.map { it.toDomain() },
    title = title
)

internal fun CountryCodesResponse.toDomain(): CountryCodes = CountryCodes(
    yandexCode = yandexCode
)

internal fun RegionResponse.toDomain() = Region(
    title = title,
    codes = codes.toDomain(),
    settlements = settlements.map { it.toDomain() }
)

internal fun RegionCodesResponse.toDomain(): RegionCodes = RegionCodes(yandexCode = yandexCode)

internal fun SettlementResponse.toDomain(): Settlement = Settlement(
    codes = codes.toDomain(),
    stations = stations.map { it.toDomain() },
    title = title
)

internal fun SettlementCodesResponse.toDomain() = SettlementCodes(
    yandexCode = yandexCode
)

internal fun StationResponse.toDomain(): Station = Station(
    direction = direction,
    codes = codes.toDomain(),
    stationType = stationType.toDomain(),
    title = title,
    longitude = longitude,
    transportType = transportType.toDomain(),
    latitude = latitude
)

internal fun StationCodesResponse.toDomain(): StationCodes = StationCodes(
    yandexCode = yandexCode,
    esrCode = esrCode,
)

internal fun StationTypeResponse.toDomain(): StationType =
    when (this) {
        StationTypeResponse.STATION -> StationType.STATION
        StationTypeResponse.STOP -> StationType.STOP
        StationTypeResponse.CHECKPOINT -> StationType.CHECKPOINT
        StationTypeResponse.PLATFORM -> StationType.PLATFORM
        StationTypeResponse.POST -> StationType.POST
        StationTypeResponse.CROSSING -> StationType.CROSSING
        StationTypeResponse.OVERTAKING_POINT -> StationType.OVERTAKING_POINT
        StationTypeResponse.TRAIN_STATION -> StationType.TRAIN_STATION
        StationTypeResponse.AIRPORT -> StationType.AIRPORT
        StationTypeResponse.BUS_STATION -> StationType.BUS_STATION
        StationTypeResponse.BUS_STOP -> StationType.BUS_STOP
        StationTypeResponse.UNKNOWN -> StationType.UNKNOWN
        StationTypeResponse.PORT -> StationType.PORT
        StationTypeResponse.PORT_POINT -> StationType.PORT_POINT
        StationTypeResponse.WHARF -> StationType.WHARF
        StationTypeResponse.RIVER_PORT -> StationType.RIVER_PORT
        StationTypeResponse.MARINE_STATION -> StationType.MARINE_STATION
    }

internal fun TransportTypeResponse.toDomain(): TransportType =
    when (this) {
        TransportTypeResponse.PLANE -> TransportType.PLANE
        TransportTypeResponse.TRAIN -> TransportType.TRAIN
        TransportTypeResponse.SUBURBAN -> TransportType.SUBURBAN
        TransportTypeResponse.BUS -> TransportType.BUS
        TransportTypeResponse.WATER -> TransportType.WATER
        TransportTypeResponse.HELICOPTER -> TransportType.HELICOPTER
    }

internal fun SearchResponse.toDomain(): Search = Search(
    date = date,
    from = from.toDomain(),
    to = to.toDomain(),
)

internal fun SearchFromToResponse.toDomain(): SearchFromTo = SearchFromTo(
    code = code,
    popularTitle = popularTitle,
    shortTitle = shortTitle,
    title = title,
    type = type,
)

internal fun IntervalSegmentResponse.toDomain(): IntervalSegment = IntervalSegment(
    arrivalPlatform = arrivalPlatform,
    arrivalTerminal = arrivalTerminal,
    departurePlatform = departurePlatform,
    departureTerminal = departureTerminal,
    duration = duration,
    from = from.toDomain(),
    hasTransfers = hasTransfers,
    startDate = startDate,
    stops = stops,
    thread = thread.toDomain(),
    ticketsInfo = ticketsInfo.toDomain(),
    to = to.toDomain()
)

internal fun TicketsInfoResponse.toDomain(): TicketsInfo = TicketsInfo(
    etMarker = etMarker,
    places = places.map { it.toDomain() },
)

internal fun PlaceResponse.toDomain() = Place(
    currency = currency,
    name = name,
    price = price.toDomain()
)

internal fun PriceResponse.toDomain() = Price(
    cents = cents,
    whole = whole,
)


internal fun SegmentStationResponse.toDomain(): SegmentStation = SegmentStation(
    code = code,
    popularTitle = popularTitle,
    shortTitle = shortTitle,
    stationType = stationType.toDomain(),
    stationTypeName = stationTypeName,
    title = title,
    transportType = transportType.toDomain(),
    type = type.toDomain(),
)

internal fun SegmentStationTypeResponse.toDomain(): SegmentStationType =
    when (this) {
        SegmentStationTypeResponse.STATION -> SegmentStationType.STATION
        SegmentStationTypeResponse.SETTLEMENT -> SegmentStationType.SETTLEMENT
    }

internal fun IntervalSegmentThreadResponse.toDomain(): IntervalSegmentThread =
    IntervalSegmentThread(
        carrier = carrier.toDomain(),
        expressType = expressType?.toDomain(),
        number = number,
        shortTitle = shortTitle,
        threadMethodLink = threadMethodLink,
        title = title,
        transportSubtype = transportSubtype.toDomain(),
        transportType = transportType,
        uid = uid,
        vehicle = vehicle,
        interval = interval.toDomain()
    )

internal fun CarrierResponse.toDomain() = Carrier(
    address = address,
    code = code,
    codes = codes.toDomain(),
    contacts = contacts,
    email = email,
    logo = logo,
    logoSvg = logoSvg,
    phone = phone,
    title = title,
    url = url,
)

internal fun CarrierCodesResponse.toDomain() = CarrierCodes(
    iata = iata,
    icao = icao,
    sirena = sirena,
)

internal fun ExpressTypeResponse.toDomain(): ExpressType = when (this) {
    ExpressTypeResponse.EXPRESS -> ExpressType.EXPRESS
    ExpressTypeResponse.AEROEXPRESS -> ExpressType.AEROEXPRESS
}

internal fun TransportSubtypeResponse.toDomain(): TransportSubtype = TransportSubtype(
    code = code,
    color = color,
    title = title,
)

internal fun IntervalResponse.toDomain(): Interval = Interval(
    beginTime = beginTime,
    density = density,
    endTime = endTime,
)