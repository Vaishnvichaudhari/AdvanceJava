package day4.dao;

import java.util.Collection;

public interface DaoInterfaceCourse<T, K> {
	Collection<T> getAll();
   T getOne(K key);
    void create(T  t);
	

}