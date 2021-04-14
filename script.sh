#!/bin/bash

#random password with 10 characters
java randomPassword.passwordGenerator 10

#random 7 character password that contains the character T
java randomPassword.passwordGenerator 7 T

#random 7 character password that contains the characters C and !
java randomPassword.passwordGenerator 8 C!

#opens help menu
java randomPassword.passwordGenerator help
