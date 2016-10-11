# SDvalidation
Validation library for Android

SDValidation is an easy to implement validations for android.
## Installation
Add as external library into your android project & sync it.
The purpose of this library is to minimize your registration form validation functionality.
## Screenshots
   
## Warning
•	Supports Minimum SDK level is 16 & above
•	Require TextInputLayout for EditText
## Implementation
Just call following methods
1.	Add Android Design support library for TextInputLayout

    compile 'com.android.support:design:22.2.0'


2.	initialize EditText & TextInputLayout components

EditText editTextUsName=(EditText)findViewById(R.id.editTextUsName);

TextInputLayout input_lay_usname=(TextInputLayout)findViewById(R.id.ipusname);

3.	Add SDValidation as External Library 

  Go to File > New > Import Module and import the library as a module 

  Select downloaded library path and Click Ok.

  Let Android Studio build the project. 

  Open build.gradle (Module:app) file. 

  Add the following line with your module name in place of “sdvalidation” in the dependencies block:

compile project(':sdvalidation')

After this Android Studio would start saying “gradle files have changed since last project sync”, press the “sync now” link to start sync.





## Implement in Your Project
Step 1:
``` java

SDValidation  sdValidation = new SDValidation();

```

Step 2:
``` java
if(!sdValidation.validatePassword(editTextPass,input_layout_password))
    return;
else
    Toast.makeText(MainActivity.this,"Success registration",Toast.LENGTH_SHORT).show();
```
## Requirements
•	Jelly Bean (Sdk 16) and Above
## Author
	Stark digital Media Services Pvt. Ltd.
## License
SDValidation is released under the MIT license. See the LICENSE file for more info.

