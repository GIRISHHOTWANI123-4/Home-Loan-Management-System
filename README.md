# Home-Loan-Management-System

# Imp points Regarding Spring Setup

1. For the domain class try using lombok dependency which provides NoArgs Construtor and AllArgs Constructor
2. Add the getter and setter for all the fields present in the object otherwise it can lead to inconsistency
3. If the lombok dependency is not used then default constructor is compulsory if and only if parameterize constructord is also used otherwise it can lead to inconsistency
