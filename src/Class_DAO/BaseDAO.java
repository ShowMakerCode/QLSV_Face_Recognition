/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_DAO;

import java.util.List;

/**
 *
 * @author 98tae
 * @param <E>
 * @param <K>
 */
public abstract class BaseDAO<E, K> {

    abstract public boolean Insert(E entity) throws Exception;

    abstract public boolean Update(E entity) throws Exception;

    abstract public boolean Delete(K key) throws Exception;

    abstract public List<E> SelectAll() throws Exception;

    abstract public E SelectByID(K key) throws Exception;

    abstract protected List<E> SelectBySQL(String sql, Object... arg)  throws Exception;

}
