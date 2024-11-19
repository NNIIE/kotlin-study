package com.lannstark.lec11

// 접근제어자, 유틸클래스
fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}