select actor_id, first_name, last_name from actor;
select mov.FILM_ID, mov.TITLE,actor_id,link.FILM_ID from film mov, film_actor link
where link.FILM_ID = mov.FILM_ID
group by mov.FILM_ID, mov.TITLE,actor_id,link.FILM_ID;

select first_name, last_name, mov.title
from actor a, film_actor link, film mov
where  mov.FILM_ID = link.FILM_ID
and a.ACTOR_ID = link.ACTOR_ID
group by first_name, last_name, mov.title;
  
select first_name, last_name, mov.title
from actor a, film_actor link, film mov
inner join on a.ACTOR_ID = link.ACTOR_ID
and mov.FILM_ID = link.FILM_ID
group by first_name, last_name, mov.title;

select count(film_id) from film;
select distinct count (film_id) from film_actor;
select * from film_actor;  --5462
