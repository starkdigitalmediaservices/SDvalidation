package com.stark.sdvalidation;

import android.support.design.widget.TextInputLayout;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import java.util.regex.Pattern;

/**
 * Created by ramdas on 07-Oct-16.
 */

public class SDValidation {

    // Validate UserName with blank spaces & special characters
    public boolean validateUsername(EditText editText, TextInputLayout textInputLayout) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        String strName = editText.getText().toString().trim();
        if (strName.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Username should not be blank");
            return false;

        } else if (!pattern.matcher(strName).matches()) {

            System.out.println("User '" + strName + "' contains special character");
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Username should not be special character");
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);
        }

        return true;
    }

    // Validate FirstName with blank spaces & special characters
    public boolean validateFirstname(EditText editText, TextInputLayout textInputLayout) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        String strName = editText.getText().toString().trim();
        if (strName.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("First name should not be blank");
            return false;

        } else if (!pattern.matcher(strName).matches()) {

            System.out.println("Firstname '" + strName + "' contains special character");
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("First name should not be special character");
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);
        }

        return true;
    }

    // Validate LastName with blank spaces & special characters
    public boolean validateLastname(EditText editText, TextInputLayout textInputLayout) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        String strName = editText.getText().toString().trim();
        if (strName.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Last name should not be blank");
            return false;

        } else if (!pattern.matcher(strName).matches()) {

            System.out.println("Last name '" + strName + "' contains special character");
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Last name should not be special character");
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);
        }

        return true;
    }

    // Validate Password with blank spaces & special characters
    public boolean validatePassword(EditText editText, TextInputLayout textInputLayout) {


        editText.setTransformationMethod(new PasswordTransformationMethod());
        String strPass = editText.getText().toString().trim();
        if (strPass.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Password field should not be blank");
            return false;
        } else if (strPass.length() < 8) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Password length should be at least 8 characters");
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);

        }

        return true;
    }

    // Validate Email address with blank spaces & special characters
    public boolean validateEmail(EditText editText, TextInputLayout textInputLayout) {

        String userEmail = editText.getText().toString().trim();
        if (userEmail.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Email should not be blank");
            return false;
        } else if (!isValidEmail(userEmail)) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Email not valid");
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);

        }

        return true;
    }

    // Validate Mobile number with blank spaces & limit less than 6 & more than 13 digits
    public boolean validateMobile(EditText editText, TextInputLayout textInputLayout) {

        String strMobile = editText.getText().toString().trim();
        if (strMobile.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Mobile number should not be blank");
            return false;

        } else if (strMobile.length() < 6) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Mobile number not valid");
            return false;
        } else if (strMobile.length() > 13) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Mobile number not valid");
            return false;
        } else if (!isValidMobile(strMobile)) {
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Mobile number not valid");
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);

        }


        return true;
    }

    // Validate Address with blank spaces.
    public boolean validateAddress(EditText editText, TextInputLayout textInputLayout) {

        String strAddress = editText.getText().toString().trim();
        if (strAddress.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Address should not be blank");
            return false;

        } else {
            textInputLayout.setErrorEnabled(false);
        }

        return true;
    }

    // Validate Address with blank spaces.
    public boolean validateFullname(EditText editText, TextInputLayout textInputLayout) {

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        String strFullname = editText.getText().toString().trim();
        if (strFullname.isEmpty()) {

            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Name should not be blank");
            return false;

        }else if (!pattern.matcher(strFullname).matches()) {

            if (strFullname.matches("^\\s*$")) {


                System.out.println("Firstname '" + strFullname + "' contains special character");
                textInputLayout.setErrorEnabled(true);
                textInputLayout.setError("Name should not be special character");
                return false;
            }
            else {
                System.out.println("Allow blankspace");
            /* System.out.println("Fullname '" + strFullname + "' contains special character");
            textInputLayout.setErrorEnabled(true);
            textInputLayout.setError("Name should not be blank space");*/
                return true;

            }
        } else {
            textInputLayout.setErrorEnabled(false);
        }

        return true;
    }

    private static boolean isValidEmail(String email) {
        return !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }

}
