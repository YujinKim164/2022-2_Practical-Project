package com.mycom.word;

public interface ICRUD {
    public Object add();
    public int update(Object obj);
    public int delete(Object obj);
    public void selectOne(int id);

    void searchLevel();

    void searchWord();

    void updateItem();

    void deleteItem();

    void saveFile();

    void loadFile();
}
