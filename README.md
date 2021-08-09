Challenge Requirements:
Go to this URL (https://www.phptravels.net/register) to register new user.
1. Enter "First name"  which must start with capital letter.
2. Enter Last Name which must start with capital letter and can’t be equal "First name" .
3. Enter a valid Mobile Number.
4. Enter a valid E-mail that should be unique for every user.
5. Enter a Password and check that it must have capital letter, small letter, with a limit of 8
characters.
6. After successful registration, verify that the user can login.
Note: All fields are mandatory.
****************************************************************************

How my solution works:
1.	Analysis main required.
2.	Check https://www.phptravels.net/register and learn how to sign up an account manually.
3.	Write test cases valid or invalid for registration page.
4.	Start our automation project  implemented with an object-oriented design to 3 pages and 2 tests.
5.	Start writing automation script.
6.	Run our tests.
7.	Test our automation project usability and and check invalid results in console and screenshot folder.
8.	Implement HTTP inspectors and save response in console.
9.	Implement customized reporting screenshots for failures in screenshots folder.
****************************************************************************

Features:
1.	Automation project can automate all registration process.
2.	 Find bugs and reporting it to console and screenshots.
3.	 Check request response in console.
4.	We can track our test process visually in chrome.
i.  Read every live step in console by EventReporter.
ii.	Inserting all values of registration form, use submit button.
iii.check successfully moving to registered profile home page.
****************************************************************************
Limitations:
I think it's better to save the response in external folder I don't have much time for searching about that.
****************************************************************************

Test cases:
1.	Sending Valid values for all Fields .
2.	Sending Valid values for all Fields except - "First name" Invalid Value: Start with small letter.
3.	Sending Valid values for all Fields except - "First name" Invalid Value: Empty field.
4.	Sending Valid values for all Fields except - "First name" Invalid Value: Numbers.
5.	Sending Valid values for all Fields except - "Last name" Invalid Value: Start with small letter.
6.	Sending Valid values for all Fields except - "Last name" Invalid Value: Empty field.
7.	Sending Valid values for all Fields except - "Last name" Invalid Value: Numbers.
8.	Sending Valid values for all Fields except - "First name" = "Last name"
9.	Sending Valid values for all Fields except -  "Mobile Number" Invalid Value: "123" 
10.	Sending Valid values for all Fields except -  "Mobile Number" Invalid Value: "xyz"
11.	Sending Valid values for all Fields except - "Email" Invalid Value: "asdf"
12.	Sending Valid values for all Fields except - "Email" Invalid Value: Old registered Email.
13.	Sending Valid values for all Fields except - "Password" Invalid Value: with No capital letter.
14.	Sending Valid values for all Fields except - "Password" Invalid Value: with No small letter.
15.	Sending Valid values for all Fields except - "Password" Invalid Value: short password.
16.	Sending Valid values for all Fields except - "Password" = "Confirm Password" 
