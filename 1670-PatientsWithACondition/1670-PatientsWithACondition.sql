-- Last updated: 12/08/2026, 20:30:14
# Write your MySQL query statement below
/* Write your PL/SQL query statement below */
SELECT patient_id, patient_name, conditions
FROM Patients
WHERE conditions LIKE 'DIAB1%' OR conditions LIKE '% DIAB1%'