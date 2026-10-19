package com.parse;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
class ParseSQLiteDatabase {
    private static final ExecutorService dbExecutor = Executors.newSingleThreadExecutor();
    private static final TaskQueue taskQueue = new TaskQueue();

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    private SQLiteDatabase f29559db;
    private int openFlags;
    private final Object currentLock = new Object();
    private final TaskCompletionSource<Void> tcs = new TaskCompletionSource<>();
    private Task<Void> current = null;

    private ParseSQLiteDatabase(int i10) {
        this.openFlags = i10;
        taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                synchronized (ParseSQLiteDatabase.this.currentLock) {
                    ParseSQLiteDatabase.this.current = task;
                }
                return ParseSQLiteDatabase.this.tcs.getTask();
            }
        });
    }

    public static Task<ParseSQLiteDatabase> openDatabaseAsync(SQLiteOpenHelper sQLiteOpenHelper, int i10) {
        ParseSQLiteDatabase parseSQLiteDatabase = new ParseSQLiteDatabase(i10);
        return parseSQLiteDatabase.open(sQLiteOpenHelper).continueWithTask(new Continuation<Void, Task<ParseSQLiteDatabase>>() { // from class: com.parse.ParseSQLiteDatabase.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<ParseSQLiteDatabase> then(Task<Void> task) {
                return Task.forResult(ParseSQLiteDatabase.this);
            }
        });
    }

    public Task<Void> beginTransactionAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskContinueWithTask2 = this.current.continueWithTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    ParseSQLiteDatabase.this.f29559db.beginTransaction();
                    return task;
                }
            }, dbExecutor);
            this.current = taskContinueWithTask2;
            taskContinueWithTask = taskContinueWithTask2.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    return task;
                }
            }, Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> closeAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskContinueWithTask2 = this.current.continueWithTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    try {
                        ParseSQLiteDatabase.this.f29559db.close();
                        return ParseSQLiteDatabase.this.tcs.getTask();
                    } finally {
                        ParseSQLiteDatabase.this.tcs.setResult(null);
                    }
                }
            }, dbExecutor);
            this.current = taskContinueWithTask2;
            taskContinueWithTask = taskContinueWithTask2.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    return task;
                }
            }, Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> deleteAsync(final String str, final String str2, final String[] strArr) {
        Task<Void> taskMakeVoid;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess((Continuation<Void, TContinuationResult>) new Continuation<Void, Integer>() { // from class: com.parse.ParseSQLiteDatabase.24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Integer then(Task<Void> task) {
                    return Integer.valueOf(ParseSQLiteDatabase.this.f29559db.delete(str, str2, strArr));
                }
            }, dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskMakeVoid = taskOnSuccess.continueWithTask((Continuation<TContinuationResult, Task<TContinuationResult>>) new Continuation<Integer, Task<Integer>>() { // from class: com.parse.ParseSQLiteDatabase.25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Integer> then(Task<Integer> task) {
                    return task;
                }
            }, (Executor) Task.BACKGROUND_EXECUTOR).makeVoid();
        }
        return taskMakeVoid;
    }

    public Task<Void> endTransactionAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskContinueWith = this.current.continueWith((Continuation<Void, TContinuationResult>) new Continuation<Void, Void>() { // from class: com.parse.ParseSQLiteDatabase.11
                @Override // com.parse.boltsinternal.Continuation
                public Void then(Task<Void> task) {
                    ParseSQLiteDatabase.this.f29559db.endTransaction();
                    return null;
                }
            }, dbExecutor);
            this.current = taskContinueWith;
            taskContinueWithTask = taskContinueWith.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    return task;
                }
            }, Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> insertOrThrowAsync(final String str, final ContentValues contentValues) {
        Task<Void> taskMakeVoid;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess((Continuation<Void, TContinuationResult>) new Continuation<Void, Long>() { // from class: com.parse.ParseSQLiteDatabase.20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Long then(Task<Void> task) {
                    return Long.valueOf(ParseSQLiteDatabase.this.f29559db.insertOrThrow(str, null, contentValues));
                }
            }, dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskMakeVoid = taskOnSuccess.continueWithTask((Continuation<TContinuationResult, Task<TContinuationResult>>) new Continuation<Long, Task<Long>>() { // from class: com.parse.ParseSQLiteDatabase.21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Long> then(Task<Long> task) {
                    return task;
                }
            }, (Executor) Task.BACKGROUND_EXECUTOR).makeVoid();
        }
        return taskMakeVoid;
    }

    public Task<Void> insertWithOnConflict(final String str, final ContentValues contentValues, final int i10) {
        Task<Void> taskMakeVoid;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess((Continuation<Void, TContinuationResult>) new Continuation<Void, Long>() { // from class: com.parse.ParseSQLiteDatabase.18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Long then(Task<Void> task) {
                    return Long.valueOf(ParseSQLiteDatabase.this.f29559db.insertWithOnConflict(str, null, contentValues, i10));
                }
            }, dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskMakeVoid = taskOnSuccess.continueWithTask((Continuation<TContinuationResult, Task<TContinuationResult>>) new Continuation<Long, Task<Long>>() { // from class: com.parse.ParseSQLiteDatabase.19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Long> then(Task<Long> task) {
                    return task;
                }
            }, (Executor) Task.BACKGROUND_EXECUTOR).makeVoid();
        }
        return taskMakeVoid;
    }

    public Task<Void> open(final SQLiteOpenHelper sQLiteOpenHelper) {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            taskContinueWithTask = this.current.continueWith((Continuation<Void, TContinuationResult>) new Continuation<Void, SQLiteDatabase>() { // from class: com.parse.ParseSQLiteDatabase.6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public SQLiteDatabase then(Task<Void> task) {
                    return (ParseSQLiteDatabase.this.openFlags & 1) == 1 ? sQLiteOpenHelper.getReadableDatabase() : sQLiteOpenHelper.getWritableDatabase();
                }
            }, dbExecutor).continueWithTask((Continuation<TContinuationResult, Task<TContinuationResult>>) new Continuation<SQLiteDatabase, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<SQLiteDatabase> task) {
                    ParseSQLiteDatabase.this.f29559db = task.getResult();
                    return task.makeVoid();
                }
            }, (Executor) Task.BACKGROUND_EXECUTOR);
            this.current = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    public Task<Cursor> queryAsync(final String str, final String[] strArr, final String str2, final String[] strArr2) {
        Task<Cursor> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task<Void> task = this.current;
            Continuation continuation = new Continuation<Void, Cursor>() { // from class: com.parse.ParseSQLiteDatabase.16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Cursor then(Task<Void> task2) {
                    return ParseSQLiteDatabase.this.f29559db.query(str, strArr, str2, strArr2, null, null, null);
                }
            };
            ExecutorService executorService = dbExecutor;
            Task taskOnSuccess = task.onSuccess((Continuation<Void, TContinuationResult>) continuation, executorService).onSuccess((Continuation<TContinuationResult, TContinuationResult>) new Continuation<Cursor, Cursor>() { // from class: com.parse.ParseSQLiteDatabase.15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Cursor then(Task<Cursor> task2) {
                    Cursor cursorCreate = ParseSQLiteCursor.create(task2.getResult(), ParseSQLiteDatabase.dbExecutor);
                    cursorCreate.getCount();
                    return cursorCreate;
                }
            }, (Executor) executorService);
            this.current = taskOnSuccess.makeVoid();
            taskContinueWithTask = taskOnSuccess.continueWithTask(new Continuation<Cursor, Task<Cursor>>() { // from class: com.parse.ParseSQLiteDatabase.17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Cursor> then(Task<Cursor> task2) {
                    return task2;
                }
            }, Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Cursor> rawQueryAsync(final String str, final String[] strArr) {
        Task<Cursor> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task<Void> task = this.current;
            Continuation continuation = new Continuation<Void, Cursor>() { // from class: com.parse.ParseSQLiteDatabase.27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Cursor then(Task<Void> task2) {
                    return ParseSQLiteDatabase.this.f29559db.rawQuery(str, strArr);
                }
            };
            ExecutorService executorService = dbExecutor;
            Task taskOnSuccess = task.onSuccess((Continuation<Void, TContinuationResult>) continuation, executorService).onSuccess((Continuation<TContinuationResult, TContinuationResult>) new Continuation<Cursor, Cursor>() { // from class: com.parse.ParseSQLiteDatabase.26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Cursor then(Task<Cursor> task2) {
                    Cursor cursorCreate = ParseSQLiteCursor.create(task2.getResult(), ParseSQLiteDatabase.dbExecutor);
                    cursorCreate.getCount();
                    return cursorCreate;
                }
            }, (Executor) executorService);
            this.current = taskOnSuccess.makeVoid();
            taskContinueWithTask = taskOnSuccess.continueWithTask(new Continuation<Cursor, Task<Cursor>>() { // from class: com.parse.ParseSQLiteDatabase.28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Cursor> then(Task<Cursor> task2) {
                    return task2;
                }
            }, Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Void> setTransactionSuccessfulAsync() {
        Task<Void> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task taskOnSuccessTask = this.current.onSuccessTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    ParseSQLiteDatabase.this.f29559db.setTransactionSuccessful();
                    return task;
                }
            }, dbExecutor);
            this.current = taskOnSuccessTask;
            taskContinueWithTask = taskOnSuccessTask.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseSQLiteDatabase.10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    return task;
                }
            }, Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }

    public Task<Integer> updateAsync(final String str, final ContentValues contentValues, final String str2, final String[] strArr) {
        Task<Integer> taskContinueWithTask;
        synchronized (this.currentLock) {
            Task<TContinuationResult> taskOnSuccess = this.current.onSuccess((Continuation<Void, TContinuationResult>) new Continuation<Void, Integer>() { // from class: com.parse.ParseSQLiteDatabase.22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Integer then(Task<Void> task) {
                    return Integer.valueOf(ParseSQLiteDatabase.this.f29559db.update(str, contentValues, str2, strArr));
                }
            }, dbExecutor);
            this.current = taskOnSuccess.makeVoid();
            taskContinueWithTask = taskOnSuccess.continueWithTask((Continuation<TContinuationResult, Task<TContinuationResult>>) new Continuation<Integer, Task<Integer>>() { // from class: com.parse.ParseSQLiteDatabase.23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Integer> then(Task<Integer> task) {
                    return task;
                }
            }, (Executor) Task.BACKGROUND_EXECUTOR);
        }
        return taskContinueWithTask;
    }
}
