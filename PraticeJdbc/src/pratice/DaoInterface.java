package pratice;

import java.util.Collection;

public interface DaoInterface<T,K> {
	Collection<T> getAll();
	T GetOne(K key);
	void create(T t );

}
