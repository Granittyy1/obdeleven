package com.parse;

import android.content.Context;
import android.content.Intent;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParsePinningEventuallyQueue extends ParseEventuallyQueue {
    private final ParseHttpClient httpClient;
    private ConnectivityNotifier notifier;
    private final Object connectionLock = new Object();
    private final Object taskQueueSyncLock = new Object();
    private HashMap<String, TaskCompletionSource<JSONObject>> pendingOperationSetUUIDTasks = new HashMap<>();
    private TaskQueue taskQueue = new TaskQueue();
    private TaskQueue operationSetTaskQueue = new TaskQueue();
    private ArrayList<String> eventuallyPinUUIDQueue = new ArrayList<>();
    private TaskCompletionSource<Void> connectionTaskCompletionSource = new TaskCompletionSource<>();
    private ConnectivityNotifier.ConnectivityListener listener = new ConnectivityNotifier.ConnectivityListener() { // from class: com.parse.ParsePinningEventuallyQueue.1
        @Override // com.parse.ConnectivityNotifier.ConnectivityListener
        public void networkConnectivityStatusChanged(Context context, Intent intent) {
            if (intent.getBooleanExtra("noConnectivity", false)) {
                ParsePinningEventuallyQueue.this.setConnected(false);
            } else {
                ParsePinningEventuallyQueue.this.setConnected(ConnectivityNotifier.isConnected(context));
            }
        }
    };
    private HashMap<String, TaskCompletionSource<JSONObject>> pendingEventuallyTasks = new HashMap<>();
    private HashMap<String, ParseOperationSet> uuidToOperationSet = new HashMap<>();
    private HashMap<String, EventuallyPin> uuidToEventuallyPin = new HashMap<>();

    /* JADX INFO: renamed from: com.parse.ParsePinningEventuallyQueue$13, reason: invalid class name */
    public class AnonymousClass13 implements Continuation<Void, Task<JSONObject>> {
        final /* synthetic */ EventuallyPin val$eventuallyPin;
        final /* synthetic */ ParseOperationSet val$operationSet;

        public AnonymousClass13(EventuallyPin eventuallyPin, ParseOperationSet parseOperationSet) {
            this.val$eventuallyPin = eventuallyPin;
            this.val$operationSet = parseOperationSet;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<JSONObject> then(Task<Void> task) throws Exception {
            Task taskExecuteAsync;
            final int type = this.val$eventuallyPin.getType();
            final ParseObject object = this.val$eventuallyPin.getObject();
            String sessionToken = this.val$eventuallyPin.getSessionToken();
            if (type == 1) {
                taskExecuteAsync = object.saveAsync(ParsePinningEventuallyQueue.this.httpClient, this.val$operationSet, sessionToken);
            } else if (type == 2) {
                taskExecuteAsync = object.deleteAsync(sessionToken).cast();
            } else {
                ParseRESTCommand command = this.val$eventuallyPin.getCommand();
                if (command == null) {
                    taskExecuteAsync = Task.forResult(null);
                    ParsePinningEventuallyQueue.this.notifyTestHelper(8);
                } else {
                    taskExecuteAsync = command.executeAsync(ParsePinningEventuallyQueue.this.httpClient);
                }
            }
            return taskExecuteAsync.continueWithTask(new Continuation<JSONObject, Task<JSONObject>>() { // from class: com.parse.ParsePinningEventuallyQueue.13.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<JSONObject> then(final Task<JSONObject> task2) {
                    Exception error = task2.getError();
                    if (error == null || !(error instanceof ParseException) || ((ParseException) error).getCode() != 100) {
                        return AnonymousClass13.this.val$eventuallyPin.unpinInBackground("_eventuallyPin").continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.13.1.2
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Void> task3) {
                                JSONObject jSONObject = (JSONObject) task2.getResult();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                int i10 = type;
                                if (i10 == 1) {
                                    return object.handleSaveEventuallyResultAsync(jSONObject, AnonymousClass13.this.val$operationSet);
                                }
                                return (i10 != 2 || task2.isFaulted()) ? task3 : object.handleDeleteEventuallyResultAsync();
                            }
                        }).continueWithTask(new Continuation<Void, Task<JSONObject>>() { // from class: com.parse.ParsePinningEventuallyQueue.13.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<JSONObject> then(Task<Void> task3) {
                                return task2;
                            }
                        });
                    }
                    ParsePinningEventuallyQueue.this.setConnected(false);
                    ParsePinningEventuallyQueue.this.notifyTestHelper(7);
                    AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                    return ParsePinningEventuallyQueue.this.process(anonymousClass13.val$eventuallyPin, anonymousClass13.val$operationSet);
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.parse.ParsePinningEventuallyQueue$5, reason: invalid class name */
    public class AnonymousClass5 implements Continuation<Void, Task<Void>> {
        final /* synthetic */ ParseRESTCommand val$command;
        final /* synthetic */ ParseObject val$object;
        final /* synthetic */ TaskCompletionSource val$tcs;

        public AnonymousClass5(ParseObject parseObject, ParseRESTCommand parseRESTCommand, TaskCompletionSource taskCompletionSource) {
            this.val$object = parseObject;
            this.val$command = parseRESTCommand;
            this.val$tcs = taskCompletionSource;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.parse.boltsinternal.Continuation
        public Task<Void> then(Task<Void> task) {
            return EventuallyPin.pinEventuallyCommand(this.val$object, this.val$command).continueWithTask(new Continuation<EventuallyPin, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.5.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<EventuallyPin> task2) {
                    EventuallyPin result = task2.getResult();
                    Exception error = task2.getError();
                    if (error == null) {
                        ParsePinningEventuallyQueue.this.pendingOperationSetUUIDTasks.put(result.getUUID(), AnonymousClass5.this.val$tcs);
                        ParsePinningEventuallyQueue.this.populateQueueAsync().continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.5.1.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<Void> task3) {
                                ParsePinningEventuallyQueue.this.notifyTestHelper(3);
                                return task3;
                            }
                        });
                        return task2.makeVoid();
                    }
                    if (5 >= Parse.getLogLevel()) {
                        PLog.w("ParsePinningEventuallyQueue", "Unable to save command for later.", error);
                    }
                    ParsePinningEventuallyQueue.this.notifyTestHelper(4);
                    return Task.forResult(null);
                }
            });
        }
    }

    public ParsePinningEventuallyQueue(Context context, ParseHttpClient parseHttpClient) {
        setConnected(ConnectivityNotifier.isConnected(context));
        this.httpClient = parseHttpClient;
        ConnectivityNotifier notifier = ConnectivityNotifier.getNotifier(context);
        this.notifier = notifier;
        notifier.addListener(this.listener);
        resume();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> populateQueueAsync() {
        return this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return ParsePinningEventuallyQueue.this.populateQueueAsync(task);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<JSONObject> process(EventuallyPin eventuallyPin, ParseOperationSet parseOperationSet) {
        return waitForConnectionAsync().onSuccessTask(new AnonymousClass13(eventuallyPin, parseOperationSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> runEventuallyAsync(final EventuallyPin eventuallyPin) {
        final String uuid = eventuallyPin.getUUID();
        if (this.eventuallyPinUUIDQueue.contains(uuid)) {
            return Task.forResult(null);
        }
        this.eventuallyPinUUIDQueue.add(uuid);
        this.operationSetTaskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return ParsePinningEventuallyQueue.this.runEventuallyAsync(eventuallyPin, task).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.9.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<Void> task2) {
                        ParsePinningEventuallyQueue.this.eventuallyPinUUIDQueue.remove(uuid);
                        return task2;
                    }
                });
            }
        });
        return Task.forResult(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> waitForConnectionAsync() {
        Task<Void> task;
        synchronized (this.connectionLock) {
            task = this.connectionTaskCompletionSource.getTask();
        }
        return task;
    }

    @Override // com.parse.ParseEventuallyQueue
    public Task<JSONObject> enqueueEventuallyAsync(final ParseRESTCommand parseRESTCommand, final ParseObject parseObject) {
        Parse.requirePermission("android.permission.ACCESS_NETWORK_STATE");
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                return ParsePinningEventuallyQueue.this.enqueueEventuallyAsync(parseRESTCommand, parseObject, task, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public void resume() {
        if (isConnected()) {
            this.connectionTaskCompletionSource.trySetResult(null);
            TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
            this.connectionTaskCompletionSource = taskCompletionSource;
            taskCompletionSource.trySetResult(null);
        } else {
            this.connectionTaskCompletionSource = new TaskCompletionSource<>();
        }
        populateQueueAsync();
    }

    @Override // com.parse.ParseEventuallyQueue
    public void setConnected(boolean z10) {
        synchronized (this.connectionLock) {
            try {
                if (isConnected() != z10) {
                    super.setConnected(z10);
                    if (z10) {
                        this.connectionTaskCompletionSource.trySetResult(null);
                        TaskCompletionSource<Void> taskCompletionSource = new TaskCompletionSource<>();
                        this.connectionTaskCompletionSource = taskCompletionSource;
                        taskCompletionSource.trySetResult(null);
                    } else {
                        this.connectionTaskCompletionSource = new TaskCompletionSource<>();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.parse.ParseEventuallyQueue
    public Task<JSONObject> waitForOperationSetAndEventuallyPin(ParseOperationSet parseOperationSet, EventuallyPin eventuallyPin) {
        final String uuid;
        TaskCompletionSource<JSONObject> taskCompletionSource;
        if (eventuallyPin != null && eventuallyPin.getType() != 1) {
            return process(eventuallyPin, null);
        }
        synchronized (this.taskQueueSyncLock) {
            try {
                if (parseOperationSet != null && eventuallyPin == null) {
                    uuid = parseOperationSet.getUUID();
                    this.uuidToOperationSet.put(uuid, parseOperationSet);
                } else {
                    if (parseOperationSet != null || eventuallyPin == null) {
                        throw new IllegalStateException("Either operationSet or eventuallyPin must be set.");
                    }
                    String operationSetUUID = eventuallyPin.getOperationSetUUID();
                    this.uuidToEventuallyPin.put(operationSetUUID, eventuallyPin);
                    uuid = operationSetUUID;
                }
                EventuallyPin eventuallyPin2 = this.uuidToEventuallyPin.get(uuid);
                ParseOperationSet parseOperationSet2 = this.uuidToOperationSet.get(uuid);
                if (eventuallyPin2 != null && parseOperationSet2 != null) {
                    final TaskCompletionSource<JSONObject> taskCompletionSource2 = this.pendingEventuallyTasks.get(uuid);
                    return process(eventuallyPin2, parseOperationSet2).continueWithTask(new Continuation<JSONObject, Task<JSONObject>>() { // from class: com.parse.ParsePinningEventuallyQueue.12
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.parse.boltsinternal.Continuation
                        public Task<JSONObject> then(Task<JSONObject> task) {
                            synchronized (ParsePinningEventuallyQueue.this.taskQueueSyncLock) {
                                ParsePinningEventuallyQueue.this.pendingEventuallyTasks.remove(uuid);
                                ParsePinningEventuallyQueue.this.uuidToOperationSet.remove(uuid);
                                ParsePinningEventuallyQueue.this.uuidToEventuallyPin.remove(uuid);
                            }
                            Exception error = task.getError();
                            if (error != null) {
                                taskCompletionSource2.trySetError(error);
                            } else if (task.isCancelled()) {
                                taskCompletionSource2.trySetCancelled();
                            } else {
                                taskCompletionSource2.trySetResult(task.getResult());
                            }
                            return taskCompletionSource2.getTask();
                        }
                    });
                }
                if (this.pendingEventuallyTasks.containsKey(uuid)) {
                    taskCompletionSource = this.pendingEventuallyTasks.get(uuid);
                } else {
                    taskCompletionSource = new TaskCompletionSource<>();
                    this.pendingEventuallyTasks.put(uuid, taskCompletionSource);
                }
                return taskCompletionSource.getTask();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> populateQueueAsync(Task<Void> task) {
        return task.continueWithTask(new Continuation<Void, Task<List<EventuallyPin>>>() { // from class: com.parse.ParsePinningEventuallyQueue.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<List<EventuallyPin>> then(Task<Void> task2) {
                return EventuallyPin.findAllPinned(ParsePinningEventuallyQueue.this.eventuallyPinUUIDQueue);
            }
        }).onSuccessTask(new Continuation<List<EventuallyPin>, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<List<EventuallyPin>> task2) {
                Iterator<EventuallyPin> it = task2.getResult().iterator();
                while (it.hasNext()) {
                    ParsePinningEventuallyQueue.this.runEventuallyAsync(it.next());
                }
                return task2.makeVoid();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> enqueueEventuallyAsync(ParseRESTCommand parseRESTCommand, ParseObject parseObject, Task<Void> task, TaskCompletionSource<JSONObject> taskCompletionSource) {
        return task.continueWithTask(new AnonymousClass5(parseObject, parseRESTCommand, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> runEventuallyAsync(final EventuallyPin eventuallyPin, Task<Void> task) {
        return task.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.11
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                return ParsePinningEventuallyQueue.this.waitForConnectionAsync();
            }
        }).onSuccessTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                return ParsePinningEventuallyQueue.this.waitForOperationSetAndEventuallyPin(null, eventuallyPin).continueWithTask(new Continuation<JSONObject, Task<Void>>() { // from class: com.parse.ParsePinningEventuallyQueue.10.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<Void> then(Task<JSONObject> task3) {
                        Exception error = task3.getError();
                        if (error != null) {
                            if (6 >= Parse.getLogLevel()) {
                                PLog.e("ParsePinningEventuallyQueue", "Failed to run command.", error);
                            }
                            ParsePinningEventuallyQueue.this.notifyTestHelper(2, error);
                        } else {
                            ParsePinningEventuallyQueue.this.notifyTestHelper(1);
                        }
                        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) ParsePinningEventuallyQueue.this.pendingOperationSetUUIDTasks.remove(eventuallyPin.getUUID());
                        if (taskCompletionSource != null) {
                            if (error != null) {
                                taskCompletionSource.setError(error);
                            } else {
                                taskCompletionSource.setResult(task3.getResult());
                            }
                        }
                        return task3.makeVoid();
                    }
                });
            }
        });
    }
}
