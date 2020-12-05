package com.example.pozdravkomobileapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val firstPostcard = PostcardData("Happy Birthday Mother", "Birthday's Postcards", 4.0)
    val secondPostcard = PostcardData("Happy Valentine's Day 21", "Valentine's Day", 4.8)
    val thirdPostcard = PostcardData("Happy 23rd of February for brother", "23rd of February", 4.1)

    val collection = listOf(firstPostcard, secondPostcard, thirdPostcard)


    @Test
    fun test() {
        print(collection.sort())
    }

    fun List<PostcardData>.sort() : List<PostcardData> = this.sortedBy { it.postcardRating }
}