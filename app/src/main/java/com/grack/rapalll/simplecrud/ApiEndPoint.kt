package com.grack.rapalll.simplecrud

class ApiEndPoint {

    companion object {
        private val SERVER = "http://192.168.1.119/simplecrud/"
        val CREATE = SERVER+"create.php"
        val READ = SERVER+"read.php"
        val DELETE = SERVER+"delete.php"
        val UPDATE = SERVER+"update.php"

    }
}