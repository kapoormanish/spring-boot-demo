package com.foo

/**
 * Created by manish on 4/3/17.
 */
class User {
    String fName
    String lName

    User(String fName, String lName) {
        this.fName = fName
        this.lName = lName
    }

    String toString() {
        "${fName} ${lName}"
    }
}