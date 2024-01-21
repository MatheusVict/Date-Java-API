# TIme study:

## What's time?

- Date-[hour] local:
    - year-month-day-[hour] without time zone [hour] optional
- Date-hour global:
    - year-month-day-[hour]Z
    - **z == London time zone**
- Duration:
    - time between two dates-hour

# When use

## Date-[hour] local:

- When you want to know the time of an event in your local time zone, like a meeting, a birthday, a party, etc.
    - birthday: "01/01/2004"
    - Sales date-time: "01/01/2020 10:00"

## Date-hour global:

- When you want to know the time of an event in a global time zone, like a web site.
    - when will it be available: "01/01/2020 10:00 (SP timezone)"
    - when was the last update: "17 minutes ago"
    - start and end of a meeting: "01/01/2020 10:00 (SP timezone) - 01/01/2020 11:00 (SP timezone)"

# Timezone:

## GMT - Greenwich Mean Time

- London time zone
- UTC - Universal Time Coordinated
- also know as "Z" time or Zulu time

## Others time zones are relative to GMT/UTC

- SP timezone: GMT-3
- Manaus timezone: GMT-4
- Portugal timezone: GMT+1

# Many languages/technologies have their names for date-time

- "US/Pacific"
- "America/Sao_Paulo"
- etc

## ISO 8601 Pattern

- Date-[hour] local:
    - 20224-01-01
    - 20224-01-01T10:00
    - 20224-01-01T10:00:00
    - 20224-01-01T10:00:00.000

- Date-hour global:
    - 20224-01-01T10:00:00Z
    - 20224-01-01T10:00:00.000Z
    - 20224-01-01T10:00:00+01:00

# Important operations with date-time

## Instantiate a date-time

- (now) -> Date-time
- Text ISO 8601 -> Date-time
- Custom text -> Date-time
- day, month, year, [schedule] -> Date-time local

## Format a date-time

- Date-time -> Text ISO 8601
- Date-time -> Custom text

## Get data from data-time local

- Date-time local -> day, month, year, [schedule]

## Convert date-time global to date-time local

- Date-time global, timezone(local system) -> Date-time local

## Date-time operations

- Date-time +/- time -> Date-time
- Date-time 1, Data-time 2 -> Duration

## Java time types (Java 8+)

- Date-time local
    - LocalDate
    - LocalDateTime

- Date-time global
    - Instant

- Duration
    - Duration
    - Period
  
- Timezone
    - ZoneId
    - ZoneOffset
    - ZoneRules
    - ZoneRulesProvider
    - ChronoUnit