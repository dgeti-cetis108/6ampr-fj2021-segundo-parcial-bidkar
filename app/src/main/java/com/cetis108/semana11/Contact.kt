package com.cetis108.semana11

import java.io.Serializable

class Contact: Serializable {
    var Firstname: String? = null
    var Lastname: String? = null
    var PhoneNumber: String? = null
    var Email: String? = null

    fun getDetails(): String {
        return "Nombre(s): $Firstname\n" +
                "Apellido(s): $Lastname\n" +
                "Teléfono: $PhoneNumber\n" +
                "Correo electrónico: $Email"
    }
}