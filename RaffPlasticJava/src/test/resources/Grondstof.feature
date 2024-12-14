#language: nl

Feature: Validatie van grondstoffen, prijzen en gewichten

Scenario: Geldige grondstof type "HDPE"
Gegeven de grondstof type is "HDPE"
Dan moet de grondstof type geldig zijn

Scenario: Ongeldige grondstof type "INVALID"
Gegeven de grondstof type is "INVALID"
Dan moet de grondstof type ongeldig zijn

Scenario: Geldige kwaliteit "A"
Gegeven de kwaliteit is "A"
Dan moet de kwaliteit geldig zijn

Scenario: Ongeldige kwaliteit "Z"
Gegeven de kwaliteit is "Z"
Dan moet de kwaliteit ongeldig zijn

Scenario: Geldige prijs 30.0 €
Gegeven de prijs is 30.0 €
Dan moet de prijs geldig zijn

Scenario: Ongeldige prijs 20.0 €
Gegeven de prijs is 20.0 €
Dan moet de prijs ongeldig zijn

Scenario: Ongeldige prijs -25.0 €
Gegeven de prijs is -25.0 €
Dan moet de prijs ongeldig zijn

Scenario: Geldig gewicht 350 kg
Gegeven het gewicht is 350 kg
Dan moet het gewicht geldig zijn

Scenario: Ongeldig gewicht 200 kg
Gegeven het gewicht is 200 kg
Dan moet het gewicht ongeldig zijn

Scenario: Ongeldig gewicht 0 kg
Gegeven het gewicht is 0 kg
Dan moet het gewicht ongeldig zijn
