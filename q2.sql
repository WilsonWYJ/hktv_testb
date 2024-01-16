SELECT user_code, COUNT(tote_number) AS packed_totes
FROM order_tote_process_log
WHERE action_code = 'PACKED'
  AND TIME(process_date) BETWEEN '10:00:00' AND '10:59:59'
GROUP BY user_code;