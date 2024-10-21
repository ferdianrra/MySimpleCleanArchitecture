package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {

    // membuat implementasi datasource yang merupakan sumber data message yang akan didapat.
    override fun getMessageFromSource(name: String) = MessageEntity("Hello $name! Welcometo Clean Architecture")
}