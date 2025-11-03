Implement CRUD using SpringBoot, JPA and MySQL for Insurance Management Application
Problem Statement
You are developing a Spring Boot application for a renowned insurance company. The application should help the company manage insurance policies and the claims made against these policies. Each insurance policy might have multiple claims made against it.



Requirements:



Entities:

Policy Entity:
Attributes:policyId: Unique identifier for the policy.
policyNumber: Unique number for each policy.
type: Type of the policy (e.g., Health, Auto, Home).
coverageAmount: Total coverage amount of the policy.
premium: Premium amount for the policy.
holderName: Name of the policyholder.
holderAddress: Address of the policyholder.
holderContactNumber: Contact number of the policyholder.
holderEmail: Email address of the policyholder.
claims (List of Claim).


Relationship:OneToMany with Claim.



Claim Entity:
Attributes:claimId: Unique identifier for the claim.
claimNumber: Unique number for each claim.
claimDate: Date the claim was made.
claimAmount: Amount claimed by the policyholder.
description: Description of the claim.
policy (type Policy).


Relationship:ManyToOne with Policy.



Repositories:

PolicyRepository: Should extend JpaRepository.
ClaimRepository: Should extend JpaRepository.


Services:



PolicyService: Provides methods to:
addPolicy(Policy policy): Registers a new policy in the system.
deletePolicy(Long policyId): Deletes Policy and its child (claims) based on ONDELETECASCADE settings.
getAllPolicies(): Returns a list of all active policies.
ClaimService: Features methods to:
fileClaim(Claim claim): Files a new claim for a specific policy.
getAllClaims(): Brings up a list of all filed claims.


Controllers:

PolicyController: Handles HTTP requests related to the Policy entity:
POST /policies: Calls PolicyService.addPolicy(Policy policy) to register a new policy. Details are provided in the request body.
DELETE/policies/{policyId}: Engages PolicyService.deletePolicy(Long policyId) to delete a Policy by their ID and the corresponding Claims too.
GET /policies: Uses PolicyService.getAllPolicies() to list all active policies.
ClaimController: Manages HTTP requests related to the Claim entity:
POST /claims: Contacts ClaimService.fileClaim(Claim claim) to file a new claim. Details are in the request body.
GET /claims: Invokes ClaimService.getAllClaims() to provide a list of all claims.


Testing and submitting the code:



Step 1: Click on the WeCP Projects button shown below:



Step 2: Click on the Run app button to run the application.

Step 3: You can test your code by clicking on Test and Submit button. You will get a congratulations message upon successful completion of the task.

Step 4: Click on Show testing url button to get the url to perform testing using thunderclient.