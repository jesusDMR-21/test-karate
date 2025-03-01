Feature:

  Background:
    Given url swaggerUrl
    * def jsFunFeature = call read('classpath:resources/features/Functions.feature')
    * def jsFunClass = call read('classpath:resources/js/functions.js')

  @CreateUser
  Scenario: Create and get user
    * table variables
      |id   |userName   |firstName  |lastName   |email          |pass       |phone      |userStatus |
      |4    |'JD24'     |'Jesús'    |'Muñoz'    |'mai@mail.com' |'pass1234' |'123456789'|0          |
    * def rqst = read('classpath:resources/json/createAccount.json')
    * print rqst
    ##Creating user
    Given path 'v2', 'user'
    And request rqst
    When method post
    Then status 200
    And print response
    ##Getting created user
    Given path 'v2', 'user', variables[0].userName
    When method get
    Then print response 
    And match response.username == variables[0].userName

    @FindByStatus
    Scenario: Find by status and count names
      Given path 'v2', 'pet', 'findByStatus'
      And params {status : 'sold'}
      When method get
      * print response
      ##With functions on .feature
      * def recovered = jsFunFeature.modifiedResponse(response)
      Then print recovered
      Then print jsFunFeature.nameRepetitions(recovered)
      ##With functions on .js
      * def recovered2 = jsFunClass.modifiedResponse(response)
      Then print recovered2
      * def expected2 = jsFunClass.nameRepetitions(recovered2)
      Then print expected2