@home

  Feature: Verify search bar

    Scenario: The user should be able to select a category
      Given the user is at the amazon home page
      When the user click on category list
      Then the user select the category {string}

    Scenario: The user can search for a product from the search box
      Given the user click on the search box
      When the user enter the product {String}
      And the user click on the search button
      Then the result page should appear