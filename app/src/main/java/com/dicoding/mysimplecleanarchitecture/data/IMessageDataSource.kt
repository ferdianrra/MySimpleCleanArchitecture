package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    // membuat interface untuk datasource yang merupakan template untuk implementasinya nanti.
    fun getMessageFromSource(name: String): MessageEntity
}