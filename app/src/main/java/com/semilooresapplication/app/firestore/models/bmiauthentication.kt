package com.semilooresapplication.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmField

public class bmiauthentication {
  @JvmField
  @PropertyName("password")
  public var password: Int? = null

  @JvmField
  @PropertyName("email")
  public var email: String? = null
}
