package com.dicoding.mysimplecleanarchitecture.domain


// Implmentasi interface MessageUseCase
class MessageInteractor(private val messageRepository: IMessageRepository): MessageUseCase {
    // Class ini melakukan extend ke kelas MessageUseCase dan meng-override fungsi sesuai kebutuhan
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}

// pada class di atas alih-alih menggunakan concrete class repository justru menggunakan interface
//  Hal ini karena kita ingin mengikuti dependency rule pada Clean Architecture.
//  Yaitu, Domain Layer tidak bergantung pada Data Layer.

// Sebagai solusinya, di sini kita menerapkan salah satu prinsip SOLID,
// yaitu Dependency Inversion Principle. Aturannya menyebutkan bahwa
// high-level module tidak diperbolehkan untuk bergantung pada low-level module.
// Keduanya harus bergantung pada abstraction.