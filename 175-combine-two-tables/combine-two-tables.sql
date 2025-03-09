# Write your MySQL query statement below

select FirstName, LastName, City, State
from Person as p left join address as a on p.PersonId = a.PersonId;

