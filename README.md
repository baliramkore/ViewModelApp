-created simple view which updates counter values on button click and update on UI 
-when there is orientation chnages happens then whole activity will be recreated from start hence screen loses data.
-hence values which are assigned to the class level variables will be set to default values means data loss.
-if want to retain values as updated values we have viewmodel concept which are lifecycle aware 
-viewmodel provides scope for the variables to store data during config changes and provides to the UI.  
-UI Specific data will be hold inside viewmodel
-viewmodel will survive untill activity or fragment completely destroyed