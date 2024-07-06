Feature: Review_testcase

  Scenario: Successful launch browser and try to give review
    Given User launch the chrome browser
    When user open the url as "https://magento.softwaretestingboard.com/"
    And user need to Click on image
    And user click on Add Review link
    And user enter nickname as "sathya" and summary as "Good product" and Review as "Nice dress to wear"
    And Click on submit button
    And Close the browser