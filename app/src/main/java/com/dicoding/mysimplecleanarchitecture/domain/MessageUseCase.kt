package com.dicoding.mysimplecleanarchitecture.domain

// membuat abstract class yang akan menjadi basis dari semua Use Case

// Class ini digunakan sebagai kode induk dari Interactor yang akan didefinisikan.
// interface ini dibuat karena hubungan antara ViewModel dengan UseCase
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
    // interface ini mengembalikan objek dari MessageEntity
}