
WITH uniq_rows AS
    (SELECT MIN(id) as id, phone_number, email, profile_link FROM contact GROUP BY phone_number, email, profile_link)

DELETE FROM contact WHERE id NOT IN (SELECT id FROM uniq_rows);