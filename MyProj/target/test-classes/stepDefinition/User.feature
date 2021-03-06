Feature: New User Registeration  

Scenario: Invalid Category
Given User is on 'register' Page 
When User Enters Invalid Category 
Then display 'Please Enter Valid Category'

Scenario: Valid Category
Given User is on 'register' Page 
When User Enters Valid Category and Category="User"
And Display 'user' page

Scenario: Invalid First Name
Given User is on 'user' Page 
When User Enters Invalid First Name
Then display 'Please Enter Valid First Name'

Scenario: Invalid Last Name
Given User is on 'user' Page 
When User Enters Invalid Last Name
Then display 'Please Enter Valid Last Name'

Scenario: Invalid Mobile Number
Given User is on 'user' Page 
When User Enters Invalid Mobile Number
Then display 'Please Enter Valid Mobile Number'

Scenario: Invalid Address
Given User is on 'user' Page 
When User Enters Invalid Address 
Then display 'Please Enter Your Valid Address'

Scenario: Invalid EmailID
Given User is on 'user' Page 
When User Enters Invalid EmailID 
Then display 'Please Enter Valid EmailID'

Scenario: Invalid Password
Given User is on 'user' page
When User Enters Invalid Password
Then display 'Please Enter Valid Password'

Scenario: Invalid ConfirmPassword
Given User is on 'user' page
When User Enters Invalid ConfirmPassword
Then display 'Please Enter Valid ConfirmPassword'

Scenario: Invalid Answer for SecrityQuestion One
Given User is on 'user' page
When User Enters Invalid Answer for SecrityQuestion one
Then display 'Please Enter Valid Answer for SecrityQuestion one'

Scenario: Invalid Answer for SecrityQuestion two
Given User is on 'user' page
When User Enters Invalid Answer for SecrityQuestion two
Then display 'Please Enter Valid Answer for SecrityQuestion two'

Scenario: Valid Details
Given User is on 'user' Page
When User clicks on Create Account
Then display 'success' Page




