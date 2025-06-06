package ru.practicum.android.diploma.domain.sharing

interface ExternalNavigator {
    fun shareUrl(url: String, title: String)
    fun sendEmail(email: String)
    fun dialPhoneNumber(phoneNumber: String)
}
