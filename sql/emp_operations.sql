CREATE DATABASE ORGANIZATION;

USE ORGANIZATION;

CREATE TABLE DEPT (
 DEPTNO              integer NOT NULL,
 DNAME               varchar(14),
 LOC                 varchar(13),
 CONSTRAINT DEPT_PRIMARY_KEY PRIMARY KEY (DEPTNO));
 
 CREATE TABLE EMP (
 EMPNO               integer NOT NULL,
 ENAME               varchar(10),
 JOB                 varchar(9),
 MGR                 integer,
 HIREDATE            DATEtime,
 SAL                 DECIMAL(10,2),
 COMM                DECIMAL(10,2),
 DEPTNO              integer NOT NULL,
 CONSTRAINT EMP_FOREIGN_KEY FOREIGN KEY (DEPTNO) REFERENCES DEPT (DEPTNO),
 CONSTRAINT EMP_PRIMARY_KEY PRIMARY KEY (EMPNO));
 
INSERT INTO DEPT VALUES (10,'ACCOUNTING','NEW YORK');
INSERT INTO DEPT VALUES (20,'RESEARCH','DALLAS');
INSERT INTO DEPT VALUES (30,'SALES','CHICAGO');
INSERT INTO DEPT VALUES (40,'OPERATIONS','BOSTON');

INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'1981-05-1',2850,NULL,30);
INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'1981-06-9',2450,NULL,10);
INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'1981-4-2',2975,NULL,20);
INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'1981-9-28',1250,1400,30);
INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'1981-2-20',1600,300,30);
INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'1981-9-8',1500,0,30);
INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'1981-12-3',950,NULL,30);
INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'1981-2-22',1250,500,30);
INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'1981-12-3',3000,NULL,20);
INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'1982-12-09',3000,NULL,20);
INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'1983-1-12',1100,NULL,20);
INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'1982-1-23',1300,NULL,10);

 
CREATE TABLE REGIONS
( REGION_ID INTEGER NOT NULL,
REGION_NAME VARCHAR(20),
PRIMARY KEY(REGION_ID)
);

CREATE TABLE COUNTRIES 
    ( COUNTRY_ID      CHAR(2)
    , COUNTRY_NAME    VARCHAR(40) 
    , REGION_ID       INTEGER 
    , PRIMARY KEY (COUNTRY_ID),
	  CONSTRAINT COUNTR_REG_FK FOREIGN KEY (REGION_ID) REFERENCES REGIONS(REGION_ID)
    ) ;
    
CREATE TABLE LOCATIONS
    ( LOCATION_ID    INTEGER not null
    , STREET_ADDRESS VARCHAR(40)
    , POSTAL_CODE    VARCHAR(12)
    , CITY       VARCHAR(30) NOT NULL
    , STATE_PROVINCE VARCHAR(25)
    , COUNTRY_ID     CHAR(2),
    PRIMARY KEY (LOCATION_ID),
    FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID)
    ) ;

INSERT INTO regions VALUES( 1, 'Europe');
INSERT INTO regions VALUES( 2, 'Americas');
INSERT INTO regions VALUES( 3, 'Asia');
INSERT INTO regions VALUES( 4, 'Middle East and Asia');

INSERT INTO countries VALUES( 'IT', 'Italy', 1);
INSERT INTO countries VALUES( 'JP', 'Japan', 3);
INSERT INTO countries VALUES( 'US', 'USA', 2);
INSERT INTO countries VALUES( 'CA', 'Canada', 2);
INSERT INTO countries VALUES( 'CN', 'China', 3);
INSERT INTO countries VALUES( 'IN', 'India', 3);
INSERT INTO countries VALUES( 'AU', 'Australia', 3);
INSERT INTO countries VALUES( 'ZW', 'Zimbabwe',4);



INSERT INTO countries VALUES( 'SG', 'Singapore', 3);
INSERT INTO countries VALUES( 'UK', 'United Kingdom', 1);
INSERT INTO countries VALUES( 'FR', 'France', 1);
INSERT INTO countries VALUES( 'DE', 'Germany', 1);
INSERT INTO countries VALUES( 'ZM', 'Zambia', 4);
INSERT INTO countries VALUES( 'EG', 'Egypt', 4);
INSERT INTO countries VALUES( 'BR', 'Brazil', 2);
INSERT INTO countries VALUES( 'CH', 'Switzerland', 1);


INSERT INTO countries VALUES( 'NL', 'Netherlands', 1);
INSERT INTO countries VALUES( 'MX', 'Mexico', 2);
INSERT INTO countries VALUES( 'KW', 'Kuwait', 4);
INSERT INTO countries VALUES( 'IL', 'Israel', 4);
INSERT INTO countries VALUES( 'DK', 'Denmark', 1);
INSERT INTO countries VALUES( 'HK', 'HongKong', 3);
INSERT INTO countries VALUES( 'NG', 'Nigeria', 4);
INSERT INTO countries VALUES( 'AR', 'Argentina', 2);
INSERT INTO countries VALUES( 'BE', 'Belgium', 1);

INSERT INTO locations VALUES( 1000, '1297 Via Cola di Rie', '00989', 'Roma', NULL, 'IT');
INSERT INTO locations VALUES( 1100, '93091 Calle della Testa', '10934', 'Venice', NULL, 'IT');
INSERT INTO locations VALUES( 1200, '2017 Shinjuku-ku', '1689', 'Tokyo', 'Tokyo Prefecture', 'JP');
INSERT INTO locations VALUES( 1300, '9450 Kamiya-cho', '6823', 'Hiroshima', NULL, 'JP');
INSERT INTO locations VALUES( 1400, '2014 Jabberwocky Rd', '26192', 'Southlake', 'Texas', 'US');
INSERT INTO locations VALUES( 1500, '2011 Interiors Blvd', '99236', 'South San Francisco', 'California', 'US');
INSERT INTO locations VALUES( 1600, '2007 Zagora St', '50090', 'South Brunswick', 'New Jersey', 'US');
INSERT INTO locations VALUES( 1700, '2004 Charade Rd', '98199', 'Seattle', 'Washington', 'US');
INSERT INTO locations VALUES( 1800, '147 Spadina Ave', 'M5V 2L7', 'Toronto', 'Ontario', 'CA');
INSERT INTO locations VALUES( 1900, '6092 Boxwood St', 'YSW 9T2', 'Whitehorse', 'Yukon', 'CA');

-- 0. Displaying all details of employee
select * from emp;

-- 1. Displaying all employees in ascending order by name
select * from emp order by ENAME;

-- 2. Displaying all employees in department 20 and 30
select * from emp where DEPTNO = 20 or DEPTNO = 30;

-- 3. Displaying all employees who are Manager
select * from emp where JOB = "MANAGER";

-- 4. Displaying all employees whose salary is bw 2000 and 5000
select * from emp where SAL between 2000 and 5000;

-- 5. Displaying all employees whose commission is null
select * from emp where COMM is null;

-- 6. Displaying ENAME,SAL,COMM,CTC
select ENAME,SAL,COMM,(coalesce(COMM,0)+SAL)*12 as CTC from emp;

-- 7. Displaying HIREDATE,CURRENT_DATE(),TENURE of the employees
select HIREDATE,current_timestamp() as CURRENTDATE,timestampdiff(year,HIREDATE,current_timestamp()) as TENURE  from emp;

-- 8. Displaying all employee names which start with s
select ENAME from emp where ENAME like "s%";

-- 9. Displaying unique department numbers
select distinct DEPTNO from emp;

-- 10. Displaying ENAME and JOB in lowercase
select lower(ENAME) as ENAME , lower(JOB) as JOB from emp;

-- ------------------------------------------------------------------------------------------

-- 11. Displaying top 3 salary earning employees
select * from emp order by SAL desc limit 3;

-- 12. Displaying clerk and managers in dept 10
select * from emp where (JOB="CLERK" or JOB = "MANAGER") and DEPTNO = 10;

-- 13. Displaying all clerks in ascending order of deptno
select * from emp where JOB = "CLERK" order by DEPTNO;

-- 16. Displaying all employees in the same dept of SCOTT
select * from emp where DEPTNO = (select DEPTNO from emp where ENAME = "SCOTT") and not ENAME = "SCOTT";

select e1.*
from emp e1
join emp e2
on e1.DEPTNO=e2.DEPTNO and e2.ENAME="SCOTT";


-- 17. Displaying all employees having same designation of SMITH
select * from emp where JOB = (select JOB from emp where ENAME = "SMITH") and not ENAME = "SMITH";

select e1.*
from emp e1
join emp e2
on e1.JOB = e2.JOB and e2.ENAME="SMITH";


-- 18. Displying all employees who are reporting under KING
-- select * from emp where DEPTNO = (select DEPTNO from emp where ENAME = "KING") and not ENAME = "KING";
select * from emp where MGR = (select EMPNO from emp where ENAME = "KING");

select e1.* 
from emp e1 join emp e2
on e1.MGR = e2.EMPNO and e2.ENAME = "KING";

-- 19. Displaying employees who have same salary as BLAKE
select * from emp where SAL = (select SAL from emp where ENAME = "BLAKE") and not ENAME = "BLAKE";

update emp set SAL = 3000 where ENAME = "BLAKE";
select e1.*
from emp e1, emp e2 
where e1.EMPNO = e2.EMPNO and 
e1.SAL =(Select SAL from emp where ENAME in ("BLAKE"));

-- 20. Displying number of employees in departmentwise
select DEPTNO,count(*) as NUMBER_OF_EMPLOYEES from emp group by DEPTNO;

-- 21. Displaying number of employees in jobwise
select JOB,count(*) as NUMBER_OF_EMPLOYEES from emp group by JOB;

-- 22. Displaying number of employees in departmentwise,jobwise 
select DEPTNO,JOB,count(*) as NUMBER_OF_EMPLOYEES_DEPTWISE_JOBWISE from emp group by DEPTNO,JOB order by DEPTNO;

-- 23. Displaying employees in deptwise which are greater than 3
select *  from emp where DEPTNO in (select DEPTNO from emp group by DEPTNO having count(DEPTNO)>3) order by DEPTNO;

-- 24. Displaying designationwise employees count greater than 3
select * from emp where JOB in (select JOB from emp group by JOB having count(JOB)>3) order by JOB;

-- 25. Displaying employeename,deptname and location;
select emp.ENAME, dept.DNAME, dept.LOC from emp inner join dept on emp.DEPTNO = dept.DEPTNO;

-- 26. Displaying all deptnames and corresponding employees
select emp.ENAME, dept.DNAME from emp inner join dept on emp.DEPTNO = dept.DEPTNO;

-- 27. Displaying all deptnames where there are no employees
select DNAME from dept inner join emp on dept.DEPTNO = emp.DEPTNO;

-- 28. Displaying deptnamewise employee count greater than 3 and displaying in descending order of deptname
select dept.DNAME,count(*) as NUMBER_OF_EMPLOYEES from dept inner join emp on dept.DEPTNO = emp.DEPTNO group by dept.DNAME order by dept.DNAME desc;

-- 29. Displaying all the empname and their manager names;
select e1.ENAME,e2.ENAME as MANAGER from emp e1 join emp e2 on e1.MGR = e2.EMPNO order by e2.ENAME;

-- 30. Displaying empname,deptname and managername as bossname in order of bossname
-- select dept.DNAME,e1.ENAME,e2.ENAME as BOSSNAME from dept join emp e1 on dept.DEPTNO = e1.DEPTNO join emp e2 on e1.EMPNO = e2.EMPNO and e1.MGR = e2.EMPNO;
select e1.ENAME,e2.ENAME as BOSSNAME, dept.DNAME from emp e1 join emp e2 on e1.EMPNO=e2.EMPNO and e1.MGR = e2.EMPNO right join dept on e2.EMPNO=dept.DEPTNO;

-- 31. 


-- 32. Displaying locationname,cityname,countryname,regionname
select dept.LOC,locations.CITY,countries.COUNTRY_NAME,regions.REGION_NAME from dept left outer join 