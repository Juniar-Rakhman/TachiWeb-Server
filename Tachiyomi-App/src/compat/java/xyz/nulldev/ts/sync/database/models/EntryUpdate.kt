package xyz.nulldev.ts.sync.database.models

interface EntryUpdate {
    var id: Long?

    var updatedRow: Long

    var datetime: Long //Millis since epoch in UTC

    var field: UpdatableField //The updated field
}