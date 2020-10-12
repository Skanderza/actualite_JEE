
package com.philou.afpa_cda.resources.dao;

import java.util.List;

/**
 *
 * @author alliese
 */
public interface Dao<T> {

    List<T> liste();
    boolean insert(T obj);
    T find(Long id);
    boolean update(T obj);
    void delete(Long id);
        long count();

}