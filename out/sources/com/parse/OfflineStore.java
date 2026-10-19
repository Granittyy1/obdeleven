package com.parse;

import Q8.d;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.braze.models.inappmessage.InAppMessageBase;
import com.parse.boltsinternal.Capture;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import me.zhanghai.android.materialprogressbar.R;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class OfflineStore {
    private final WeakValueHashMap<Pair<String, String>, ParseObject> classNameAndObjectIdToObjectMap;
    private final WeakHashMap<ParseObject, Task<ParseObject>> fetchedObjects;
    private final OfflineSQLiteOpenHelper helper;
    private final Object lock;
    private final WeakHashMap<ParseObject, Task<String>> objectToUuidMap;
    private final WeakValueHashMap<String, ParseObject> uuidToObjectMap;

    /* JADX INFO: renamed from: com.parse.OfflineStore$26, reason: invalid class name */
    public class AnonymousClass26 implements Continuation<ParseObject, Task<Void>> {
        final /* synthetic */ ParseObject val$object;

        public AnonymousClass26(ParseObject parseObject) {
            this.val$object = parseObject;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<Void> then(Task<ParseObject> task) {
            if (task.isFaulted()) {
                return ((task.getError() instanceof ParseException) && ((ParseException) task.getError()).getCode() == 120) ? Task.forResult(null) : task.makeVoid();
            }
            return OfflineStore.this.helper.getWritableDatabaseAsync().continueWithTask(new Continuation<ParseSQLiteDatabase, Task<Void>>() { // from class: com.parse.OfflineStore.26.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<ParseSQLiteDatabase> task2) {
                    final ParseSQLiteDatabase result = task2.getResult();
                    return result.beginTransactionAsync().onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.26.1.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Void> task3) {
                            AnonymousClass26 anonymousClass26 = AnonymousClass26.this;
                            return OfflineStore.this.updateDataForObjectAsync(anonymousClass26.val$object, result).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.26.1.1.2
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // com.parse.boltsinternal.Continuation
                                public Task<Void> then(Task<Void> task4) {
                                    return result.setTransactionSuccessfulAsync();
                                }
                            }).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.26.1.1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // com.parse.boltsinternal.Continuation
                                public Task<Void> then(Task<Void> task4) {
                                    result.endTransactionAsync();
                                    result.closeAsync();
                                    return task4;
                                }
                            });
                        }
                    });
                }
            });
        }
    }

    public class OfflineDecoder extends ParseDecoder {
        private Map<String, Task<ParseObject>> offlineObjects;

        @Override // com.parse.ParseDecoder
        public Object decode(Object obj) {
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.optString("__type").equals("OfflineObject")) {
                    return this.offlineObjects.get(jSONObject.optString("uuid")).getResult();
                }
            }
            return super.decode(obj);
        }

        private OfflineDecoder(Map<String, Task<ParseObject>> map) {
            this.offlineObjects = map;
        }
    }

    public class OfflineEncoder extends ParseEncoder {

        /* JADX INFO: renamed from: db, reason: collision with root package name */
        private ParseSQLiteDatabase f29558db;
        private final Object tasksLock = new Object();
        private ArrayList<Task<Void>> tasks = new ArrayList<>();

        public OfflineEncoder(ParseSQLiteDatabase parseSQLiteDatabase) {
            this.f29558db = parseSQLiteDatabase;
        }

        @Override // com.parse.ParseEncoder
        public JSONObject encodeRelatedObject(ParseObject parseObject) {
            try {
                if (parseObject.getObjectId() != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("__type", "Pointer");
                    jSONObject.put("objectId", parseObject.getObjectId());
                    jSONObject.put("className", parseObject.getClassName());
                    return jSONObject;
                }
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("__type", "OfflineObject");
                synchronized (this.tasksLock) {
                    this.tasks.add(OfflineStore.this.getOrCreateUUIDAsync(parseObject, this.f29558db).onSuccess(new Continuation<String, Void>() { // from class: com.parse.OfflineStore.OfflineEncoder.2
                        @Override // com.parse.boltsinternal.Continuation
                        public Void then(Task<String> task) throws Exception {
                            jSONObject2.put("uuid", task.getResult());
                            return null;
                        }
                    }));
                }
                return jSONObject2;
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }

        public Task<Void> whenFinished() {
            return Task.whenAll(this.tasks).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.OfflineEncoder.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    synchronized (OfflineEncoder.this.tasksLock) {
                        try {
                            for (Task<Void> task2 : OfflineEncoder.this.tasks) {
                                if (!task2.isFaulted() && !task2.isCancelled()) {
                                }
                                return task2;
                            }
                            OfflineEncoder.this.tasks.clear();
                            return Task.forResult(null);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public interface SQLiteDatabaseCallable<T> {
        T call(ParseSQLiteDatabase parseSQLiteDatabase);
    }

    public OfflineStore(Context context) {
        this(new OfflineSQLiteOpenHelper(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> deleteObjects(final List<String> list, final ParseSQLiteDatabase parseSQLiteDatabase) {
        if (list.size() <= 0) {
            return Task.forResult(null);
        }
        if (list.size() > 999) {
            return deleteObjects(list.subList(0, InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS), parseSQLiteDatabase).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task) {
                    OfflineStore offlineStore = OfflineStore.this;
                    List list2 = list;
                    return offlineStore.deleteObjects(list2.subList(InAppMessageBase.INAPP_MESSAGE_DURATION_MIN_MILLIS, list2.size()), parseSQLiteDatabase);
                }
            });
        }
        int size = list.size();
        String[] strArr = new String[size];
        for (int i10 = 0; i10 < size; i10++) {
            strArr[i10] = "?";
        }
        return parseSQLiteDatabase.deleteAsync("ParseObjects", d.a(new StringBuilder("uuid IN ("), TextUtils.join(",", strArr), ")"), (String[]) list.toArray(new String[list.size()]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<String> getOrCreateUUIDAsync(final ParseObject parseObject, ParseSQLiteDatabase parseSQLiteDatabase) {
        final String string = UUID.randomUUID().toString();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                Task<String> task = this.objectToUuidMap.get(parseObject);
                if (task != null) {
                    return task;
                }
                this.objectToUuidMap.put(parseObject, taskCompletionSource.getTask());
                this.uuidToObjectMap.put(string, parseObject);
                this.fetchedObjects.put(parseObject, taskCompletionSource.getTask().onSuccess(new Continuation<String, ParseObject>() { // from class: com.parse.OfflineStore.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public ParseObject then(Task<String> task2) {
                        return parseObject;
                    }
                }));
                ContentValues contentValues = new ContentValues();
                contentValues.put("uuid", string);
                contentValues.put("className", parseObject.getClassName());
                parseSQLiteDatabase.insertOrThrowAsync("ParseObjects", contentValues).continueWith(new Continuation<Void, Void>() { // from class: com.parse.OfflineStore.2
                    @Override // com.parse.boltsinternal.Continuation
                    public Void then(Task<Void> task2) {
                        taskCompletionSource.setResult(string);
                        return null;
                    }
                });
                return taskCompletionSource.getTask();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Task<ParsePin> getParsePin(final String str, ParseSQLiteDatabase parseSQLiteDatabase) {
        return findAsync(new ParseQuery.State.Builder(ParsePin.class).whereEqualTo("_name", str).build(), null, null, parseSQLiteDatabase).onSuccess(new Continuation<List<ParsePin>, ParsePin>() { // from class: com.parse.OfflineStore.36
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParsePin then(Task<List<ParsePin>> task) {
                ParsePin parsePin = (task.getResult() == null || task.getResult().size() <= 0) ? null : task.getResult().get(0);
                if (parsePin != null) {
                    return parsePin;
                }
                ParsePin parsePin2 = (ParsePin) ParseObject.create(ParsePin.class);
                parsePin2.setName(str);
                return parsePin2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ParseObject> Task<T> getPointerAsync(final String str, ParseSQLiteDatabase parseSQLiteDatabase) {
        synchronized (this.lock) {
            try {
                ParseObject parseObject = this.uuidToObjectMap.get(str);
                if (parseObject == null) {
                    return (Task<T>) parseSQLiteDatabase.queryAsync("ParseObjects", new String[]{"className", "objectId"}, "uuid = ?", new String[]{str}).onSuccess(new Continuation<Cursor, T>() { // from class: com.parse.OfflineStore.3
                        /* JADX WARN: Incorrect return type in method signature: (Lcom/parse/boltsinternal/Task<Landroid/database/Cursor;>;)TT; */
                        @Override // com.parse.boltsinternal.Continuation
                        public ParseObject then(Task<Cursor> task) {
                            Cursor result = task.getResult();
                            result.moveToFirst();
                            if (result.isAfterLast()) {
                                result.close();
                                throw new IllegalStateException("Attempted to find non-existent uuid " + str);
                            }
                            synchronized (OfflineStore.this.lock) {
                                try {
                                    ParseObject parseObject2 = (ParseObject) OfflineStore.this.uuidToObjectMap.get(str);
                                    if (parseObject2 != null) {
                                        return parseObject2;
                                    }
                                    String string = result.getString(0);
                                    String string2 = result.getString(1);
                                    result.close();
                                    ParseObject parseObjectCreateWithoutData = ParseObject.createWithoutData(string, string2);
                                    if (string2 == null) {
                                        OfflineStore.this.uuidToObjectMap.put(str, parseObjectCreateWithoutData);
                                        OfflineStore.this.objectToUuidMap.put(parseObjectCreateWithoutData, Task.forResult(str));
                                    }
                                    return parseObjectCreateWithoutData;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                }
                return Task.forResult(parseObject);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private <T> Task<T> runWithManagedConnection(final SQLiteDatabaseCallable<Task<T>> sQLiteDatabaseCallable) {
        return (Task<T>) this.helper.getWritableDatabaseAsync().onSuccessTask(new Continuation<ParseSQLiteDatabase, Task<T>>() { // from class: com.parse.OfflineStore.47
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<T> then(Task<ParseSQLiteDatabase> task) {
                final ParseSQLiteDatabase result = task.getResult();
                return ((Task) sQLiteDatabaseCallable.call(result)).continueWithTask(new Continuation<T, Task<T>>() { // from class: com.parse.OfflineStore.47.1
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<T> then(Task<T> task2) {
                        result.closeAsync();
                        return task2;
                    }
                });
            }
        });
    }

    private Task<Void> runWithManagedTransaction(final SQLiteDatabaseCallable<Task<Void>> sQLiteDatabaseCallable) {
        return this.helper.getWritableDatabaseAsync().onSuccessTask(new Continuation<ParseSQLiteDatabase, Task<Void>>() { // from class: com.parse.OfflineStore.48
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<ParseSQLiteDatabase> task) {
                final ParseSQLiteDatabase result = task.getResult();
                return result.beginTransactionAsync().onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.48.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        return ((Task) sQLiteDatabaseCallable.call(result)).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.48.1.2
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Void> task3) {
                                return result.setTransactionSuccessfulAsync();
                            }
                        }).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.48.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Void> task3) {
                                result.endTransactionAsync();
                                result.closeAsync();
                                return task3;
                            }
                        });
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> saveLocallyAsync(final String str, final ParseObject parseObject, final ParseSQLiteDatabase parseSQLiteDatabase) {
        if (parseObject.getObjectId() != null && !parseObject.isDataAvailable() && !parseObject.hasChanges() && !parseObject.hasOutstandingOperations()) {
            return Task.forResult(null);
        }
        final Capture capture = new Capture();
        return getOrCreateUUIDAsync(parseObject, parseSQLiteDatabase).onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.OfflineStore.14
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                String result = task.getResult();
                capture.set(result);
                return OfflineStore.this.updateDataForObjectAsync(result, parseObject, parseSQLiteDatabase);
            }
        }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", str);
                contentValues.put("uuid", (String) capture.get());
                return parseSQLiteDatabase.insertWithOnConflict("Dependencies", contentValues, 4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> unpinAsync(ParseObject parseObject, final ParseSQLiteDatabase parseSQLiteDatabase) {
        Task<String> task = this.objectToUuidMap.get(parseObject);
        return task == null ? Task.forResult(null) : task.continueWithTask(new Continuation<String, Task<Void>>() { // from class: com.parse.OfflineStore.20
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task2) {
                String result = task2.getResult();
                return result == null ? Task.forResult(null) : OfflineStore.this.unpinAsync(result, parseSQLiteDatabase);
            }
        });
    }

    public Task<Void> deleteDataForObjectAsync(final ParseObject parseObject) {
        return this.helper.getWritableDatabaseAsync().continueWithTask(new Continuation<ParseSQLiteDatabase, Task<Void>>() { // from class: com.parse.OfflineStore.29
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<ParseSQLiteDatabase> task) {
                final ParseSQLiteDatabase result = task.getResult();
                return result.beginTransactionAsync().onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.29.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        AnonymousClass29 anonymousClass29 = AnonymousClass29.this;
                        return OfflineStore.this.deleteDataForObjectAsync(parseObject, result).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.29.1.2
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Void> task3) {
                                return result.setTransactionSuccessfulAsync();
                            }
                        }).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.29.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Void> task3) {
                                result.endTransactionAsync();
                                result.closeAsync();
                                return task3;
                            }
                        });
                    }
                });
            }
        });
    }

    public <T extends ParseObject> Task<T> fetchLocallyAsync(final T t8, final ParseSQLiteDatabase parseSQLiteDatabase) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.lock) {
            try {
                if (this.fetchedObjects.containsKey(t8)) {
                    return (Task) this.fetchedObjects.get(t8);
                }
                this.fetchedObjects.put(t8, taskCompletionSource.getTask());
                Task<String> task = this.objectToUuidMap.get(t8);
                String className = t8.getClassName();
                String objectId = t8.getObjectId();
                Task taskForResult = Task.forResult(null);
                if (objectId == null) {
                    if (task != null) {
                        final String[] strArr = {"json"};
                        final Capture capture = new Capture();
                        taskForResult = task.onSuccessTask(new Continuation<String, Task<Cursor>>() { // from class: com.parse.OfflineStore.8
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Cursor> then(Task<String> task2) {
                                capture.set(task2.getResult());
                                return parseSQLiteDatabase.queryAsync("ParseObjects", strArr, "uuid = ?", new String[]{(String) capture.get()});
                            }
                        }).onSuccess(new Continuation<Cursor, String>() { // from class: com.parse.OfflineStore.7
                            @Override // com.parse.boltsinternal.Continuation
                            public String then(Task<Cursor> task2) {
                                Cursor result = task2.getResult();
                                result.moveToFirst();
                                if (!result.isAfterLast()) {
                                    String string = result.getString(0);
                                    result.close();
                                    return string;
                                }
                                result.close();
                                throw new IllegalStateException("Attempted to find non-existent uuid " + ((String) capture.get()));
                            }
                        });
                    }
                } else {
                    if (task != null) {
                        taskCompletionSource.setError(new IllegalStateException("This object must have already been fetched from the local datastore, but isn't marked as fetched."));
                        synchronized (this.lock) {
                            this.fetchedObjects.remove(t8);
                        }
                        return taskCompletionSource.getTask();
                    }
                    taskForResult = parseSQLiteDatabase.queryAsync("ParseObjects", new String[]{"json", "uuid"}, "className = ? AND objectId = ?", new String[]{className, objectId}).onSuccess(new Continuation<Cursor, String>() { // from class: com.parse.OfflineStore.9
                        @Override // com.parse.boltsinternal.Continuation
                        public String then(Task<Cursor> task2) throws Exception {
                            Cursor result = task2.getResult();
                            result.moveToFirst();
                            if (result.isAfterLast()) {
                                result.close();
                                throw new ParseException(R.styleable.AppCompatTheme_windowFixedHeightMajor, "This object is not available in the offline cache.");
                            }
                            String string = result.getString(0);
                            String string2 = result.getString(1);
                            result.close();
                            synchronized (OfflineStore.this.lock) {
                                OfflineStore.this.objectToUuidMap.put(t8, Task.forResult(string2));
                                OfflineStore.this.uuidToObjectMap.put(string2, t8);
                            }
                            return string;
                        }
                    });
                }
                return taskForResult.onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.OfflineStore.11
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<String> task2) {
                        String result = task2.getResult();
                        if (result == null) {
                            return Task.forError(new ParseException(R.styleable.AppCompatTheme_windowFixedHeightMajor, "Attempted to fetch an object offline which was never saved to the offline cache."));
                        }
                        try {
                            final JSONObject jSONObject = new JSONObject(result);
                            final HashMap map = new HashMap();
                            new ParseTraverser() { // from class: com.parse.OfflineStore.11.1
                                @Override // com.parse.ParseTraverser
                                public boolean visit(Object obj) {
                                    if (!(obj instanceof JSONObject)) {
                                        return true;
                                    }
                                    JSONObject jSONObject2 = (JSONObject) obj;
                                    if (!jSONObject2.optString("__type").equals("OfflineObject")) {
                                        return true;
                                    }
                                    String strOptString = jSONObject2.optString("uuid");
                                    Map map2 = map;
                                    AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                                    map2.put(strOptString, OfflineStore.this.getPointerAsync(strOptString, parseSQLiteDatabase));
                                    return true;
                                }
                            }.setTraverseParseObjects(false).setYieldRoot(false).traverse(jSONObject);
                            return Task.whenAll(map.values()).onSuccess(new Continuation<Void, Void>() { // from class: com.parse.OfflineStore.11.2
                                @Override // com.parse.boltsinternal.Continuation
                                public Void then(Task<Void> task3) {
                                    ParseObject parseObject = t8;
                                    parseObject.mergeREST(parseObject.getState(), jSONObject, new OfflineDecoder(map));
                                    return null;
                                }
                            });
                        } catch (JSONException e10) {
                            return Task.forError(e10);
                        }
                    }
                }).continueWithTask(new Continuation<Void, Task<T>>() { // from class: com.parse.OfflineStore.10
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<T> then(Task<Void> task2) {
                        if (task2.isCancelled()) {
                            taskCompletionSource.setCancelled();
                        } else if (task2.isFaulted()) {
                            taskCompletionSource.setError(task2.getError());
                        } else {
                            taskCompletionSource.setResult(t8);
                        }
                        return taskCompletionSource.getTask();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T extends ParseObject> Task<List<T>> findAsync(ParseQuery.State<T> state, ParseUser parseUser, ParsePin parsePin, ParseSQLiteDatabase parseSQLiteDatabase) {
        return findAsync(state, parseUser, parsePin, false, parseSQLiteDatabase);
    }

    public <T extends ParseObject> Task<List<T>> findFromPinAsync(final String str, final ParseQuery.State<T> state, final ParseUser parseUser) {
        return runWithManagedConnection(new SQLiteDatabaseCallable<Task<List<T>>>() { // from class: com.parse.OfflineStore.43
            @Override // com.parse.OfflineStore.SQLiteDatabaseCallable
            public Task<List<T>> call(ParseSQLiteDatabase parseSQLiteDatabase) {
                return OfflineStore.this.findFromPinAsync(str, state, parseUser, parseSQLiteDatabase);
            }
        });
    }

    public ParseObject getObject(String str, String str2) {
        ParseObject parseObject;
        if (str2 == null) {
            throw new IllegalStateException("objectId cannot be null.");
        }
        Pair<String, String> pairCreate = Pair.create(str, str2);
        synchronized (this.lock) {
            parseObject = this.classNameAndObjectIdToObjectMap.get(pairCreate);
        }
        return parseObject;
    }

    public <T extends ParseObject> Task<Void> pinAllObjectsAsync(final String str, final List<T> list, final boolean z10) {
        return runWithManagedTransaction(new SQLiteDatabaseCallable<Task<Void>>() { // from class: com.parse.OfflineStore.37
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.OfflineStore.SQLiteDatabaseCallable
            public Task<Void> call(ParseSQLiteDatabase parseSQLiteDatabase) {
                return OfflineStore.this.pinAllObjectsAsync(str, list, z10, parseSQLiteDatabase);
            }
        });
    }

    public void registerNewObject(ParseObject parseObject) {
        synchronized (this.lock) {
            try {
                String objectId = parseObject.getObjectId();
                if (objectId != null) {
                    this.classNameAndObjectIdToObjectMap.put(Pair.create(parseObject.getClassName(), objectId), parseObject);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public <T extends ParseObject> Task<Void> unpinAllObjectsAsync(final String str, final List<T> list) {
        return runWithManagedTransaction(new SQLiteDatabaseCallable<Task<Void>>() { // from class: com.parse.OfflineStore.39
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.OfflineStore.SQLiteDatabaseCallable
            public Task<Void> call(ParseSQLiteDatabase parseSQLiteDatabase) {
                return OfflineStore.this.unpinAllObjectsAsync(str, list, parseSQLiteDatabase);
            }
        });
    }

    public void unregisterObject(ParseObject parseObject) {
        synchronized (this.lock) {
            try {
                String objectId = parseObject.getObjectId();
                if (objectId != null) {
                    this.classNameAndObjectIdToObjectMap.remove(Pair.create(parseObject.getClassName(), objectId));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Task<Void> updateDataForObjectAsync(ParseObject parseObject) {
        synchronized (this.lock) {
            try {
                Task<ParseObject> task = this.fetchedObjects.get(parseObject);
                if (task != null) {
                    return task.continueWithTask(new AnonymousClass26(parseObject));
                }
                return Task.forError(new IllegalStateException("An object cannot be updated if it wasn't fetched."));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void updateObjectId(ParseObject parseObject, String str, String str2) {
        if (str != null) {
            if (str.equals(str2)) {
                return;
            }
            if (!(parseObject instanceof ParseInstallation) || str2 != null) {
                throw new RuntimeException("objectIds cannot be changed in offline mode.");
            }
            synchronized (this.lock) {
                this.classNameAndObjectIdToObjectMap.remove(Pair.create(parseObject.getClassName(), str));
            }
            return;
        }
        Pair<String, String> pairCreate = Pair.create(parseObject.getClassName(), str2);
        synchronized (this.lock) {
            try {
                ParseObject parseObject2 = this.classNameAndObjectIdToObjectMap.get(pairCreate);
                if (parseObject2 != null && parseObject2 != parseObject) {
                    throw new RuntimeException("Attempted to change an objectId to one that's already known to the Offline Store.");
                }
                this.classNameAndObjectIdToObjectMap.put(pairCreate, parseObject);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public OfflineStore(OfflineSQLiteOpenHelper offlineSQLiteOpenHelper) {
        this.lock = new Object();
        this.uuidToObjectMap = new WeakValueHashMap<>();
        this.objectToUuidMap = new WeakHashMap<>();
        this.fetchedObjects = new WeakHashMap<>();
        this.classNameAndObjectIdToObjectMap = new WeakValueHashMap<>();
        this.helper = offlineSQLiteOpenHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> deleteDataForObjectAsync(final ParseObject parseObject, final ParseSQLiteDatabase parseSQLiteDatabase) {
        final Capture capture = new Capture();
        synchronized (this.lock) {
            try {
                Task<String> task = this.objectToUuidMap.get(parseObject);
                if (task != null) {
                    return task.onSuccessTask(new Continuation<String, Task<String>>() { // from class: com.parse.OfflineStore.30
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<String> then(Task<String> task2) {
                            capture.set(task2.getResult());
                            return task2;
                        }
                    }).onSuccessTask(new Continuation<String, Task<Cursor>>() { // from class: com.parse.OfflineStore.32
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Cursor> then(Task<String> task2) {
                            String[] strArr = {(String) capture.get()};
                            return parseSQLiteDatabase.queryAsync("Dependencies", new String[]{"key"}, "uuid=?", strArr);
                        }
                    }).onSuccessTask(new Continuation<Cursor, Task<Void>>() { // from class: com.parse.OfflineStore.31
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Cursor> task2) {
                            Cursor result = task2.getResult();
                            ArrayList<String> arrayList = new ArrayList();
                            result.moveToFirst();
                            while (!result.isAfterLast()) {
                                arrayList.add(result.getString(0));
                                result.moveToNext();
                            }
                            result.close();
                            ArrayList arrayList2 = new ArrayList();
                            for (final String str : arrayList) {
                                arrayList2.add(OfflineStore.this.getPointerAsync(str, parseSQLiteDatabase).onSuccessTask(new Continuation<ParseObject, Task<ParsePin>>() { // from class: com.parse.OfflineStore.31.2
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // com.parse.boltsinternal.Continuation
                                    public Task<ParsePin> then(Task<ParseObject> task3) {
                                        ParsePin parsePin = (ParsePin) task3.getResult();
                                        AnonymousClass31 anonymousClass31 = AnonymousClass31.this;
                                        return OfflineStore.this.fetchLocallyAsync(parsePin, parseSQLiteDatabase);
                                    }
                                }).continueWithTask(new Continuation<ParsePin, Task<Void>>() { // from class: com.parse.OfflineStore.31.1
                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // com.parse.boltsinternal.Continuation
                                    public Task<Void> then(Task<ParsePin> task3) {
                                        ParsePin result2 = task3.getResult();
                                        List<ParseObject> objects = result2.getObjects();
                                        if (objects == null || !objects.contains(parseObject)) {
                                            return task3.makeVoid();
                                        }
                                        objects.remove(parseObject);
                                        if (objects.size() == 0) {
                                            AnonymousClass31 anonymousClass31 = AnonymousClass31.this;
                                            return OfflineStore.this.unpinAsync(str, parseSQLiteDatabase);
                                        }
                                        result2.setObjects(objects);
                                        AnonymousClass31 anonymousClass32 = AnonymousClass31.this;
                                        return OfflineStore.this.saveLocallyAsync((ParseObject) result2, true, parseSQLiteDatabase);
                                    }
                                }));
                            }
                            return Task.whenAll(arrayList2);
                        }
                    }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.35
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Void> task2) {
                            return parseSQLiteDatabase.deleteAsync("Dependencies", "uuid=?", new String[]{(String) capture.get()});
                        }
                    }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.34
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Void> task2) {
                            return parseSQLiteDatabase.deleteAsync("ParseObjects", "uuid=?", new String[]{(String) capture.get()});
                        }
                    }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.33
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Void> task2) {
                            synchronized (OfflineStore.this.lock) {
                                OfflineStore.this.fetchedObjects.remove(parseObject);
                            }
                            return task2;
                        }
                    });
                }
                return Task.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ParseObject> Task<List<T>> findAsync(final ParseQuery.State<T> state, final ParseUser parseUser, ParsePin parsePin, final boolean z10, final ParseSQLiteDatabase parseSQLiteDatabase) {
        Task<Cursor> taskOnSuccessTask;
        final OfflineQueryLogic offlineQueryLogic = new OfflineQueryLogic(this);
        final ArrayList arrayList = new ArrayList();
        if (parsePin == null) {
            taskOnSuccessTask = parseSQLiteDatabase.queryAsync("ParseObjects", new String[]{"uuid"}, "className=? AND isDeletingEventually=0", new String[]{state.className()});
        } else {
            Task<String> task = this.objectToUuidMap.get(parsePin);
            if (task == null) {
                return Task.forResult(arrayList);
            }
            taskOnSuccessTask = task.onSuccessTask(new Continuation<String, Task<Cursor>>() { // from class: com.parse.OfflineStore.4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Cursor> then(Task<String> task2) {
                    String[] strArr = {state.className(), task2.getResult()};
                    return parseSQLiteDatabase.queryAsync("ParseObjects A  INNER JOIN Dependencies B  ON A.uuid=B.uuid", new String[]{"A.uuid"}, "className=? AND key=? AND isDeletingEventually=0", strArr);
                }
            });
        }
        return taskOnSuccessTask.onSuccessTask(new Continuation<Cursor, Task<Void>>() { // from class: com.parse.OfflineStore.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Cursor> task2) {
                Cursor result = task2.getResult();
                ArrayList<String> arrayList2 = new ArrayList();
                result.moveToFirst();
                while (!result.isAfterLast()) {
                    arrayList2.add(result.getString(0));
                    result.moveToNext();
                }
                result.close();
                final OfflineQueryLogic.ConstraintMatcher constraintMatcherCreateMatcher = offlineQueryLogic.createMatcher(state, parseUser);
                Task<Void> taskForResult = Task.forResult(null);
                for (final String str : arrayList2) {
                    final Capture capture = new Capture();
                    taskForResult = taskForResult.onSuccessTask(new Continuation<Void, Task<T>>() { // from class: com.parse.OfflineStore.6.4
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<T> then(Task<Void> task3) {
                            AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                            return OfflineStore.this.getPointerAsync(str, parseSQLiteDatabase);
                        }
                    }).onSuccessTask(new Continuation<T, Task<T>>() { // from class: com.parse.OfflineStore.6.3
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<T> then(Task<T> task3) {
                            capture.set(task3.getResult());
                            return OfflineStore.this.fetchLocallyAsync((ParseObject) capture.get(), parseSQLiteDatabase);
                        }
                    }).onSuccessTask(new Continuation<T, Task<Boolean>>() { // from class: com.parse.OfflineStore.6.2
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Boolean> then(Task<T> task3) {
                            return !((ParseObject) capture.get()).isDataAvailable() ? Task.forResult(Boolean.FALSE) : constraintMatcherCreateMatcher.matchesAsync((ParseObject) capture.get(), parseSQLiteDatabase);
                        }
                    }).onSuccess(new Continuation<Boolean, Void>() { // from class: com.parse.OfflineStore.6.1
                        @Override // com.parse.boltsinternal.Continuation
                        public Void then(Task<Boolean> task3) {
                            if (!task3.getResult().booleanValue()) {
                                return null;
                            }
                            arrayList.add(capture.get());
                            return null;
                        }
                    });
                }
                return taskForResult;
            }
        }).onSuccessTask(new Continuation<Void, Task<List<T>>>() { // from class: com.parse.OfflineStore.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<List<T>> then(Task<Void> task2) throws Exception {
                OfflineQueryLogic.sort(arrayList, state);
                final List<ParseObject> listSubList = arrayList;
                int iSkip = state.skip();
                if (!z10 && iSkip >= 0) {
                    listSubList = listSubList.subList(Math.min(state.skip(), listSubList.size()), listSubList.size());
                }
                int iLimit = state.limit();
                if (!z10 && iLimit >= 0 && listSubList.size() > iLimit) {
                    listSubList = listSubList.subList(0, iLimit);
                }
                Task taskForResult = Task.forResult(null);
                for (final ParseObject parseObject : listSubList) {
                    taskForResult = taskForResult.onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.5.1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<Void> then(Task<Void> task3) {
                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                            return OfflineQueryLogic.fetchIncludesAsync(OfflineStore.this, parseObject, state, parseSQLiteDatabase);
                        }
                    });
                }
                return taskForResult.onSuccess(new Continuation<Void, List<T>>() { // from class: com.parse.OfflineStore.5.2
                    @Override // com.parse.boltsinternal.Continuation
                    public List<T> then(Task<Void> task3) {
                        return listSubList;
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ParseObject> Task<List<T>> findFromPinAsync(String str, final ParseQuery.State<T> state, final ParseUser parseUser, final ParseSQLiteDatabase parseSQLiteDatabase) {
        return (Task<List<T>>) (str != null ? getParsePin(str, parseSQLiteDatabase) : Task.forResult(null)).onSuccessTask(new Continuation<ParsePin, Task<List<T>>>() { // from class: com.parse.OfflineStore.44
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<List<T>> then(Task<ParsePin> task) {
                return OfflineStore.this.findAsync(state, parseUser, task.getResult(), false, parseSQLiteDatabase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ParseObject> Task<Void> pinAllObjectsAsync(String str, final List<T> list, final boolean z10, final ParseSQLiteDatabase parseSQLiteDatabase) {
        return (list == null || list.size() == 0) ? Task.forResult(null) : getParsePin(str, parseSQLiteDatabase).onSuccessTask(new Continuation<ParsePin, Task<Void>>() { // from class: com.parse.OfflineStore.38
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<ParsePin> task) {
                ParsePin result = task.getResult();
                List<ParseObject> objects = result.getObjects();
                if (objects == null) {
                    objects = new ArrayList<>(list);
                } else {
                    for (ParseObject parseObject : list) {
                        if (!objects.contains(parseObject)) {
                            objects.add(parseObject);
                        }
                    }
                }
                result.setObjects(objects);
                return z10 ? OfflineStore.this.saveLocallyAsync((ParseObject) result, true, parseSQLiteDatabase) : OfflineStore.this.saveLocallyAsync(result, result.getObjects(), parseSQLiteDatabase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T extends ParseObject> Task<Void> unpinAllObjectsAsync(String str, final List<T> list, final ParseSQLiteDatabase parseSQLiteDatabase) {
        return (list == null || list.size() == 0) ? Task.forResult(null) : getParsePin(str, parseSQLiteDatabase).onSuccessTask(new Continuation<ParsePin, Task<Void>>() { // from class: com.parse.OfflineStore.40
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<ParsePin> task) {
                ParsePin result = task.getResult();
                List<ParseObject> objects = result.getObjects();
                if (objects == null) {
                    return Task.forResult(null);
                }
                objects.removeAll(list);
                if (objects.size() == 0) {
                    return OfflineStore.this.unpinAsync(result, parseSQLiteDatabase);
                }
                result.setObjects(objects);
                return OfflineStore.this.saveLocallyAsync((ParseObject) result, true, parseSQLiteDatabase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> unpinAsync(final String str, final ParseSQLiteDatabase parseSQLiteDatabase) {
        final LinkedList linkedList = new LinkedList();
        return Task.forResult(null).continueWithTask(new Continuation<Void, Task<Cursor>>() { // from class: com.parse.OfflineStore.24
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Cursor> then(Task<Void> task) {
                return parseSQLiteDatabase.rawQueryAsync("SELECT uuid FROM Dependencies WHERE key=? AND uuid IN ( SELECT uuid FROM Dependencies GROUP BY uuid HAVING COUNT(uuid)=1)", new String[]{str});
            }
        }).onSuccessTask(new Continuation<Cursor, Task<Void>>() { // from class: com.parse.OfflineStore.23
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Cursor> task) {
                Cursor result = task.getResult();
                while (result.moveToNext()) {
                    linkedList.add(result.getString(0));
                }
                result.close();
                return OfflineStore.this.deleteObjects(linkedList, parseSQLiteDatabase);
            }
        }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.22
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return parseSQLiteDatabase.deleteAsync("Dependencies", "key=?", new String[]{str});
            }
        }).onSuccess(new Continuation<Void, Void>() { // from class: com.parse.OfflineStore.21
            @Override // com.parse.boltsinternal.Continuation
            public Void then(Task<Void> task) {
                synchronized (OfflineStore.this.lock) {
                    try {
                        for (String str2 : linkedList) {
                            ParseObject parseObject = (ParseObject) OfflineStore.this.uuidToObjectMap.get(str2);
                            if (parseObject != null) {
                                OfflineStore.this.objectToUuidMap.remove(parseObject);
                                OfflineStore.this.uuidToObjectMap.remove(str2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        });
    }

    public Task<Void> unpinAllObjectsAsync(final String str) {
        return runWithManagedTransaction(new SQLiteDatabaseCallable<Task<Void>>() { // from class: com.parse.OfflineStore.41
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.OfflineStore.SQLiteDatabaseCallable
            public Task<Void> call(ParseSQLiteDatabase parseSQLiteDatabase) {
                return OfflineStore.this.unpinAllObjectsAsync(str, parseSQLiteDatabase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> unpinAllObjectsAsync(String str, final ParseSQLiteDatabase parseSQLiteDatabase) {
        return getParsePin(str, parseSQLiteDatabase).continueWithTask(new Continuation<ParsePin, Task<Void>>() { // from class: com.parse.OfflineStore.42
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<ParsePin> task) {
                if (task.isFaulted()) {
                    return task.makeVoid();
                }
                return OfflineStore.this.unpinAsync(task.getResult(), parseSQLiteDatabase);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> saveLocallyAsync(ParseObject parseObject, boolean z10, ParseSQLiteDatabase parseSQLiteDatabase) {
        final ArrayList arrayList = new ArrayList();
        if (!z10) {
            arrayList.add(parseObject);
        } else {
            new ParseTraverser() { // from class: com.parse.OfflineStore.15
                @Override // com.parse.ParseTraverser
                public boolean visit(Object obj) {
                    if (!(obj instanceof ParseObject)) {
                        return true;
                    }
                    arrayList.add((ParseObject) obj);
                    return true;
                }
            }.setYieldRoot(true).setTraverseParseObjects(true).traverse(parseObject);
        }
        return saveLocallyAsync(parseObject, arrayList, parseSQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> updateDataForObjectAsync(final ParseObject parseObject, final ParseSQLiteDatabase parseSQLiteDatabase) {
        synchronized (this.lock) {
            try {
                Task<String> task = this.objectToUuidMap.get(parseObject);
                if (task == null) {
                    return Task.forResult(null);
                }
                return task.onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.OfflineStore.27
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<String> task2) {
                        return OfflineStore.this.updateDataForObjectAsync(task2.getResult(), parseObject, parseSQLiteDatabase);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> saveLocallyAsync(final ParseObject parseObject, List<ParseObject> list, final ParseSQLiteDatabase parseSQLiteDatabase) {
        final ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
        if (!arrayList.contains(parseObject)) {
            arrayList.add(parseObject);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(fetchLocallyAsync((ParseObject) it.next(), parseSQLiteDatabase).makeVoid());
        }
        return Task.whenAll(arrayList2).continueWithTask(new Continuation<Void, Task<String>>() { // from class: com.parse.OfflineStore.19
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<String> then(Task<Void> task) {
                return (Task) OfflineStore.this.objectToUuidMap.get(parseObject);
            }
        }).onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.OfflineStore.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                String result = task.getResult();
                if (result == null) {
                    return null;
                }
                return OfflineStore.this.unpinAsync(result, parseSQLiteDatabase);
            }
        }).onSuccessTask(new Continuation<Void, Task<String>>() { // from class: com.parse.OfflineStore.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<String> then(Task<Void> task) {
                return OfflineStore.this.getOrCreateUUIDAsync(parseObject, parseSQLiteDatabase);
            }
        }).onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.OfflineStore.16
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                String result = task.getResult();
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(OfflineStore.this.saveLocallyAsync(result, (ParseObject) it2.next(), parseSQLiteDatabase));
                }
                return Task.whenAll(arrayList3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> updateDataForObjectAsync(final String str, final ParseObject parseObject, final ParseSQLiteDatabase parseSQLiteDatabase) {
        OfflineEncoder offlineEncoder = new OfflineEncoder(parseSQLiteDatabase);
        final JSONObject rest = parseObject.toRest(offlineEncoder);
        return offlineEncoder.whenFinished().onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.OfflineStore.28
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) throws Exception {
                String className = parseObject.getClassName();
                String objectId = parseObject.getObjectId();
                int i10 = rest.getInt("__isDeletingEventually");
                ContentValues contentValues = new ContentValues();
                contentValues.put("className", className);
                contentValues.put("json", rest.toString());
                if (objectId != null) {
                    contentValues.put("objectId", objectId);
                }
                contentValues.put("isDeletingEventually", Integer.valueOf(i10));
                return parseSQLiteDatabase.updateAsync("ParseObjects", contentValues, "uuid = ?", new String[]{str}).makeVoid();
            }
        });
    }

    public <T extends ParseObject> Task<T> fetchLocallyAsync(final T t8) {
        return runWithManagedConnection(new SQLiteDatabaseCallable<Task<T>>() { // from class: com.parse.OfflineStore.12
            @Override // com.parse.OfflineStore.SQLiteDatabaseCallable
            public Task<T> call(ParseSQLiteDatabase parseSQLiteDatabase) {
                return OfflineStore.this.fetchLocallyAsync(t8, parseSQLiteDatabase);
            }
        });
    }
}
