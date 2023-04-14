package kr.soc.programmers

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class WallpaperOrganizeTest {
    @Test
    fun test() {
//        [".#...", "..#..", "...#."]	[0, 1, 3, 4]
//        ["..........", ".....#....", "......##..", "...##.....", "....#....."]	[1, 3, 5, 8]
//        [".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."]	[0, 0, 7, 9]
//        ["..", "#."]	[1, 0, 2, 1]
        val wallpaperOrganize = WallpaperOrganize()
        assertThat(wallpaperOrganize.solution(arrayOf(".#...", "..#..", "...#.")))
            .isEqualTo(intArrayOf(0, 1, 3, 4))
        assertThat(wallpaperOrganize.solution(arrayOf("..........", ".....#....", "......##..", "...##.....", "....#.....")))
            .isEqualTo(intArrayOf(1, 3, 5, 8))
        assertThat(wallpaperOrganize.solution(arrayOf(".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#....")))
            .isEqualTo(intArrayOf(0, 0, 7, 9))
        assertThat(wallpaperOrganize.solution(arrayOf("..", "#.")))
            .isEqualTo(intArrayOf(1, 0, 2, 1))
    }
}