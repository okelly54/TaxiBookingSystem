package com.qa.tbs.services;

import java.util.List;

public interface CrudController<T> {
    List<T> readAll();
    T create();
    T update();
    int delete();
}