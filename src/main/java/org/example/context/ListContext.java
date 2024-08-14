package org.example.context;

import org.example.interfaces.SortStrategyInterface;

import java.util.ArrayList;
import java.util.List;

public class ListContext<T> {
    List<T> list;

    SortStrategyInterface sortStrategy;

    public ListContext(){
        this.list = new ArrayList<>();
    }

    public void add(T item){
        this.list.add(item);
    }

    public List<T> getList(){
        return this.list;
    }

    public void setSortStrategy(SortStrategyInterface sortStrategyInterface){
        this.sortStrategy = sortStrategyInterface;
    }


    public SortStrategyInterface getSortStrategy(){
        return this.sortStrategy;
    }


}
