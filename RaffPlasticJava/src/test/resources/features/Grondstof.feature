Feature: Prijs berekening voor kwaliteit en gewicht
  Als gebruiker wil ik een prijs kunnen berekenen op basis van de kwaliteit en het gewicht.

  Scenario Outline: Bereken prijs voor verschillende kwaliteiten binnen het geldige gewicht
    Given de kwaliteit is "<kwaliteit>"
    And het gewicht is <gewicht>
    When de prijs wordt berekend
    Then de totale prijs moet <prijs> zijn

    Examples:
      | kwaliteit | gewicht | prijs   |
      | laag      | 3       | 75.0    |
      | laag      | 27      | 675.0   |
      | normaal   | 36      | 1800.0  |
      | normaal   | 43      | 2150.0  |
      | hoog      | 55      | 4125.0  |
