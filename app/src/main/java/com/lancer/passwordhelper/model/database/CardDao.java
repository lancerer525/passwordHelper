package com.lancer.passwordhelper.model.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.lancer.passwordhelper.bean.Card;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CARD".
*/
public class CardDao extends AbstractDao<Card, Long> {

    public static final String TABLENAME = "CARD";

    /**
     * Properties of entity Card.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Account = new Property(2, String.class, "account", false, "ACCOUNT");
        public final static Property Password = new Property(3, String.class, "password", false, "PASSWORD");
        public final static Property WebUrl = new Property(4, String.class, "webUrl", false, "WEB_URL");
        public final static Property Folder = new Property(5, String.class, "folder", false, "FOLDER");
        public final static Property IsCollect = new Property(6, int.class, "isCollect", false, "IS_COLLECT");
    }


    public CardDao(DaoConfig config) {
        super(config);
    }
    
    public CardDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CARD\" (" + //
                "\"id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"NAME\" TEXT," + // 1: name
                "\"ACCOUNT\" TEXT NOT NULL ," + // 2: account
                "\"PASSWORD\" TEXT NOT NULL ," + // 3: password
                "\"WEB_URL\" TEXT," + // 4: webUrl
                "\"FOLDER\" TEXT," + // 5: folder
                "\"IS_COLLECT\" INTEGER NOT NULL );"); // 6: isCollect
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CARD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Card entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindString(3, entity.getAccount());
        stmt.bindString(4, entity.getPassword());
 
        String webUrl = entity.getWebUrl();
        if (webUrl != null) {
            stmt.bindString(5, webUrl);
        }
 
        String folder = entity.getFolder();
        if (folder != null) {
            stmt.bindString(6, folder);
        }
        stmt.bindLong(7, entity.getIsCollect());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Card entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
        stmt.bindString(3, entity.getAccount());
        stmt.bindString(4, entity.getPassword());
 
        String webUrl = entity.getWebUrl();
        if (webUrl != null) {
            stmt.bindString(5, webUrl);
        }
 
        String folder = entity.getFolder();
        if (folder != null) {
            stmt.bindString(6, folder);
        }
        stmt.bindLong(7, entity.getIsCollect());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Card readEntity(Cursor cursor, int offset) {
        Card entity = new Card( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.getString(offset + 2), // account
            cursor.getString(offset + 3), // password
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // webUrl
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // folder
            cursor.getInt(offset + 6) // isCollect
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Card entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setAccount(cursor.getString(offset + 2));
        entity.setPassword(cursor.getString(offset + 3));
        entity.setWebUrl(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setFolder(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setIsCollect(cursor.getInt(offset + 6));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Card entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Card entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Card entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
