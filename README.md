# BTHomePage
BreatheEasy is an application that can be downloaded by patients to aid in proper completion of their breathing exercises given to them by physical or occupational therapists. 
Patients will be able to view a description of their **diagnosis** which will help them identify symptoms, stpes to be taken and direct them towards specific exercises. 
The specific **exercises** will guide the pateint through the steps and the user will be able to record their **progress** and track their progress over time through a calendar. 
Additioanlly, the patient will have access to information to improve their **diet and lifestyle**, as well as **FAQs** to answer any additional questions.

## IMPORTANT
The master branch was not able to be properly implemented, so the final project is within the nov29 branch.

## App Usage
Upon opening the app, the user will be prompted to enter their credentials. If they do not have an account, they will be able to navigate to the registration page and create a profile. After logging in or registering, the user will be directed to the home page where they will be able to choose where they want to navigate to. 
The primary form of navigation is through the bottom navigation bar. Users will be able to navigate to the home page, diagnoses, specific exercises, progress tracker, and settings. The diet and lifestyle information, FAQs, and ability to log out will be located under the settings page.

## App challenges and future implementations
This app allowed me to learn Android Studio and Firebase, as it was my first time developing an application.
The primary challenge in when developing this application was registering the user profile information in Cloud Firestore. The user was able to be authenticated, however, their information and specific attributes would not be stored in the Cloud Firestore. As a result, I was able to add their information would be added once they saved their progress, if it had not been done already in registration.
Additioanlly, it was challenging to have the saved user progress display on the calendar. I was able to use Material Calendar View and implement com.prolificinteractive.materialcalendarview.MaterialCalendarView to do so.
The app is fully functional, however, there are improvements being made to its interface and capabilities, such as the enhancing the progress tracker and adding more functionality to the settings page.

## Language, database, and IDE
This app was coded in Java. The database used is Firebase. The IDE is Android Studio. The app was primarily tested on Google Pixel 3 phone.

## Credits
This app was guided by Dr. Rabih Younes and was done in consultation with Mattie Overton. Additioanlly, Emily Du was able to collaborate on this project through the iOS interface.



