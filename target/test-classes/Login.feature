Feature: loginpage

  Scenario: validate the title page
    Given enter the valid site
    When check the title of the "KEXIM BANK" data
    Then homepage should be displayed with login fields
    Then close site
  # without using ScenarieOutline+Examples keyword
    
  Scenario: validate the login field
  Given enter the valid site
  When enter the valid "Admin" and "Admin" fields
  Then click on login buttom
  Then branches button should be displayed
  Then close site
  #with using ScenarieOutline+Examples keyword
  
  Scenario Outline: validate the login field
  Given enter the valid site
  When enter the valid details "<username>" and "<password>" fields
  Then click on login buttom
  Then branches button should be displayed
  Then close site
  Examples:
  | username | password |
  | Admin    | Admin    |
  #By using DataTable(without using ScenarieOutline+Examples keyword)
  
  Scenario: validate the login field
  Given enter the valid site
  When enter the valid login fields
  | Admin | Admin |
  Then click on login buttom
  Then branches button should be displayed
  Then close site
  
  #By using DataTable(without using ScenarieOutline+Examples keyword(Map))
  
  Scenario: validate the login field
  Given enter the valid site
  When enter the valid username and password fields
  | username | password |
  | Admin    | Admin    |
  Then click on login buttom
  Then branches button should be displayed
  Then close site
