package cash.z.wallet.sdk.dao

import androidx.room.*
import cash.z.wallet.sdk.vo.CompactBlock

@Dao
interface CompactBlockDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(block: CompactBlock)

    @Query("SELECT * FROM compactblocks WHERE height = :height")
    fun findById(height: Int): CompactBlock?

    @Query("DELETE FROM compactblocks WHERE height = :height")
    fun deleteById(height: Int)

    @Delete
    fun delete(block: CompactBlock)
}