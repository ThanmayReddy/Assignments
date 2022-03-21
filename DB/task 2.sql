/*process flow */;
SELECT p.name as process_name ,s.name as stage_name ,t.name as task_name ,c.name as c_name 
FROM processflow.process p INNER join processflow.process_stage_mapping psm 
on p.id=psm.process_id
inner join procesflow.stage s
on psm.process_id
inner join processflow.stage_task_mapping stm 
on s.id=stm.stage_id
inner join procesflow.task t
on stm.task_id=t.id
inner join procesflow.task_checklist_mapping tcm 
on t.id = tcm.task_id
inner join procesflow. checklist c 
on tcm.checklist_id=c.id
WHERE p.id =1 group by s.name,t.name;
/*employee inner join*/;

SELECT e.id ,e.name ,e.salary ,e.city ,pem.id ,pem.project_id,pem.employee_id,p.id ,p.name ,p.department_id  
FROM employee.employee e 
INNER JOIN employee.project_employee_mapping pem  
INNER JOIN employee.projects p  
on e.id =pem.employee_id AND pem.project_id =p.id ;

/*left outer join*/;
SELECT e.id ,e.name ,e.salary ,e.city ,pem.id ,pem.project_id,pem.employee_id,p.id ,p.name ,p.department_id  
FROM employee.employee e 
left outer  JOIN employee.project_employee_mapping pem
on e.id =pem.employee_id
left outer JOIN employee.projects p  
on pem.project_id =p.id ;

/*right outer join*/;
SELECT e.id ,e.name ,e.salary ,e.city ,pem.id ,pem.project_id,pem.employee_id,p.id ,p.name ,p.department_id  
FROM employee.employee e 
RIGHT  outer  JOIN employee.project_employee_mapping pem
on e.id =pem.employee_id
RIGHT  outer JOIN employee.projects p  
on pem.project_id =p.id ;

?
/*concatinate*/;
SELECT p.id ,p.name  FROM employee.projects p 
union
SELECT d.id ,d.name  FROM employee.department d ;
/*evnetpool*/
/*sum of contributions*/;
SELECT SUM(amount) as total_contribution from eventpool.contribution c WHERE user_id =12;
/*paid and refused*/;
SELECT COUNT(c.user_id)as paid, COUNT(r.user_id)as refused  
FROM eventpool.`user` u 
LEFT JOIN eventpool.contribution c on c.user_id =u.id 
LEFT JOIN eventpool.refused r on r.user_id =u.id 
 WHERE  u.id =15;

/*5*/;
SELECT  g.id as id,COUNT(ug.user_id) as user_count ,g.name as name  ,g.created_on as created_on ,u.name as created_by  
FROM eventpool.user_group ug
JOIN eventpool.`group` g on g.id =ug.group_id 
JOIN eventpool.`user` u on u.id =g.created_by 
group by ug.group_id ;

/*1*/;
SELECT * from eventpool.event
where in in (select_id from eventpool.contribution c where user_id =9);

/*2*/;
SELECT * from eventpool. event
where id not in (SELECT event_id from eventpool.contribution c where user_id = 11);

