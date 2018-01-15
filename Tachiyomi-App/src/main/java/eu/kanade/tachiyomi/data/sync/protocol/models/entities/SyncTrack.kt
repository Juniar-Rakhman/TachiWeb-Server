package eu.kanade.tachiyomi.data.sync.protocol.models.entities

import eu.kanade.tachiyomi.data.sync.protocol.models.common.ChangedField
import eu.kanade.tachiyomi.data.sync.protocol.models.common.SyncEntity
import eu.kanade.tachiyomi.data.sync.protocol.models.common.SyncRef

class SyncTrack : SyncEntity<SyncTrack>() {
    // Changes
    var remote_id: ChangedField<Int>? = null
    var title: ChangedField<String>? = null
    var last_chapter_read: ChangedField<Int>? = null
    var total_chapters: ChangedField<Int>? = null
    var score: ChangedField<Float>? = null
    var status: ChangedField<Int>? = null
    var deleted: Boolean = false
    
    // Identifiers
    lateinit var manga: SyncRef<SyncManga>
    var sync_id: Int = 0
}