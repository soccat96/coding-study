package kr.soc.programmers

class WallpaperOrganize {
    fun solution(wallpaper: Array<String>): IntArray {
        return Wallpaper(wallpaper).getAnswer()
    }

    class Wallpaper(wallpaper: Array<String>) {
        private var iconCnt = 0
        private var minX = wallpaper[0].length - 1
        private var minY = wallpaper.size - 1
        private var maxX = 0
        private var maxY = 0

        init {
            for ((y, line) in wallpaper.withIndex()) {
                for ((x, char) in line.withIndex()) {
                    if (char == '#') {
                        this.iconCnt++

                        if (y < this.minY) this.minY = y
                        if (this.maxY < y) this.maxY = y
                        if (x < this.minX) this.minX = x
                        if (this.maxX < x) this.maxX = x
                    }
                }
            }
        }

        fun getAnswer(): IntArray {
            return if (this.iconCnt == 0) {
                intArrayOf(this.minY, this.minX, this.minY + 1, this.minX + 1)
            } else {
                intArrayOf(this.minY, this.minX, this.maxY + 1, this.maxX + 1)
            }
        }
    }
}