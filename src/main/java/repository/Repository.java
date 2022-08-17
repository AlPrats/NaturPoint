/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;

/**
 *
 * @author alber
 * @param <T>
 */
public interface Repository<T> {
        void create(T t);
        List<T> readAll();
        void updateById(int id, T t);
        void update(T t);
        void deleteById(int id);
        T findOneById(int id);
}
