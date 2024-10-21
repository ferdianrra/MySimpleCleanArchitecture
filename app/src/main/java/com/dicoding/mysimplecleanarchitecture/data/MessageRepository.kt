package com.dicoding.mysimplecleanarchitecture.data

import com.dicoding.mysimplecleanarchitecture.domain.IMessageRepository

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}

// MessageRepository mengelola cara data tersebut diperoleh (sumber data, logika caching, dsb).