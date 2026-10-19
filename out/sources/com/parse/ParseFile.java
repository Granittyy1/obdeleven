package com.parse;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.Constants;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.boltsinternal.TaskCompletionSource;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ParseFile implements Parcelable {
    public static final Parcelable.Creator<ParseFile> CREATOR = new Parcelable.Creator<ParseFile>() { // from class: com.parse.ParseFile.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseFile createFromParcel(Parcel parcel) {
            return new ParseFile(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParseFile[] newArray(int i10) {
            return new ParseFile[i10];
        }
    };
    private Set<TaskCompletionSource<?>> currentTasks;
    byte[] data;
    File file;
    private State state;
    final TaskQueue taskQueue;

    public static class State {
        private final String contentType;
        private final String name;
        private final String url;

        public static class Builder {
            private String mimeType;
            private String name;
            private String url;

            public Builder() {
            }

            public State build() {
                return new State(this);
            }

            public Builder mimeType(String str) {
                this.mimeType = str;
                return this;
            }

            public Builder name(String str) {
                this.name = str;
                return this;
            }

            public Builder url(String str) {
                this.url = str;
                return this;
            }

            public Builder(State state) {
                this.name = state.name();
                this.mimeType = state.mimeType();
                this.url = state.url();
            }
        }

        public String mimeType() {
            return this.contentType;
        }

        public String name() {
            return this.name;
        }

        public String url() {
            return this.url;
        }

        private State(Builder builder) {
            this.name = builder.name != null ? builder.name : "file";
            this.contentType = builder.mimeType;
            this.url = builder.url;
        }
    }

    public ParseFile(File file) {
        this(file, (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<File> fetchInBackground(final ProgressCallback progressCallback, Task<Void> task, final Task<Void> task2) {
        return (task2 == null || !task2.isCancelled()) ? task.continueWithTask(new Continuation<Void, Task<File>>() { // from class: com.parse.ParseFile.13
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<File> then(Task<Void> task3) {
                Task task4 = task2;
                return (task4 == null || !task4.isCancelled()) ? ParseFile.getFileController().fetchAsync(ParseFile.this.state, null, ParseFile.progressCallbackOnMainThread(progressCallback), task2) : Task.cancelled();
            }
        }) : Task.cancelled();
    }

    public static ParseFileController getFileController() {
        return ParseCorePlugins.getInstance().getFileController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ProgressCallback progressCallbackOnMainThread(final ProgressCallback progressCallback) {
        if (progressCallback == null) {
            return null;
        }
        return new ProgressCallback() { // from class: com.parse.ParseFile.2
            @Override // com.parse.ProgressCallback
            public void done(final Integer num) {
                Task.call(new Callable<Void>() { // from class: com.parse.ParseFile.2.1
                    @Override // java.util.concurrent.Callable
                    public Void call() {
                        progressCallback.done(num);
                        return null;
                    }
                }, ParseExecutors.main());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Task<Void> saveAsync(final String str, final ProgressCallback progressCallback, Task<Void> task, final Task<Void> task2) {
        if (isDirty()) {
            return (task2 == null || !task2.isCancelled()) ? task.continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseFile.3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.parse.boltsinternal.Continuation
                public Task<Void> then(Task<Void> task3) {
                    if (!ParseFile.this.isDirty()) {
                        return Task.forResult(null);
                    }
                    Task task4 = task2;
                    if (task4 == null || !task4.isCancelled()) {
                        return (ParseFile.this.data != null ? ParseFile.getFileController().saveAsync(ParseFile.this.state, ParseFile.this.data, str, ParseFile.progressCallbackOnMainThread(progressCallback), task2) : ParseFile.getFileController().saveAsync(ParseFile.this.state, ParseFile.this.file, str, ParseFile.progressCallbackOnMainThread(progressCallback), task2)).onSuccessTask(new Continuation<State, Task<Void>>() { // from class: com.parse.ParseFile.3.1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.parse.boltsinternal.Continuation
                            public Task<Void> then(Task<State> task5) {
                                ParseFile.this.state = task5.getResult();
                                ParseFile parseFile = ParseFile.this;
                                parseFile.data = null;
                                parseFile.file = null;
                                return task5.makeVoid();
                            }
                        });
                    }
                    return Task.cancelled();
                }
            }) : Task.cancelled();
        }
        return Task.forResult(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public JSONObject encode() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("__type", "File");
        jSONObject.put("name", getName());
        if (getUrl() == null) {
            throw new IllegalStateException("Unable to encode an unsaved ParseFile.");
        }
        jSONObject.put(Constants.BRAZE_WEBVIEW_URL_EXTRA, getUrl());
        return jSONObject;
    }

    public byte[] getData() throws ParseException {
        return (byte[]) ParseTaskUtils.wait(getDataInBackground());
    }

    public Task<byte[]> getDataInBackground(final ProgressCallback progressCallback) {
        final TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        this.currentTasks.add(taskCompletionSource);
        return this.taskQueue.enqueue(new Continuation<Void, Task<byte[]>>() { // from class: com.parse.ParseFile.8
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<byte[]> then(Task<Void> task) {
                return ParseFile.this.fetchInBackground(progressCallback, task, taskCompletionSource.getTask()).onSuccess(new Continuation<File, byte[]>() { // from class: com.parse.ParseFile.8.1
                    @Override // com.parse.boltsinternal.Continuation
                    public byte[] then(Task<File> task2) {
                        try {
                            return ParseFileUtils.readFileToByteArray(task2.getResult());
                        } catch (IOException unused) {
                            return null;
                        }
                    }
                });
            }
        }).continueWithTask(new Continuation<byte[], Task<byte[]>>() { // from class: com.parse.ParseFile.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<byte[]> then(Task<byte[]> task) {
                taskCompletionSource.trySetResult(null);
                ParseFile.this.currentTasks.remove(taskCompletionSource);
                return task;
            }
        });
    }

    public Task<File> getFileInBackground(final ProgressCallback progressCallback) {
        final TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        this.currentTasks.add(taskCompletionSource);
        return this.taskQueue.enqueue(new Continuation<Void, Task<File>>() { // from class: com.parse.ParseFile.10
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<File> then(Task<Void> task) {
                return ParseFile.this.fetchInBackground(progressCallback, task, taskCompletionSource.getTask());
            }
        }).continueWithTask(new Continuation<File, Task<File>>() { // from class: com.parse.ParseFile.9
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<File> then(Task<File> task) {
                taskCompletionSource.trySetResult(null);
                ParseFile.this.currentTasks.remove(taskCompletionSource);
                return task;
            }
        });
    }

    public String getName() {
        return this.state.name();
    }

    public String getUrl() {
        return this.state.url();
    }

    public boolean isDirty() {
        return this.state.url() == null;
    }

    public void save() throws ParseException {
        ParseTaskUtils.wait(saveInBackground());
    }

    public Task<Void> saveInBackground(final ProgressCallback progressCallback) {
        final TaskCompletionSource<?> taskCompletionSource = new TaskCompletionSource<>();
        this.currentTasks.add(taskCompletionSource);
        return ParseUser.getCurrentSessionTokenAsync().onSuccessTask(new Continuation<String, Task<Void>>() { // from class: com.parse.ParseFile.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<String> task) {
                return ParseFile.this.saveAsync(task.getResult(), progressCallback, taskCompletionSource.getTask());
            }
        }).continueWithTask(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseFile.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task) {
                taskCompletionSource.trySetResult(null);
                ParseFile.this.currentTasks.remove(taskCompletionSource);
                return task;
            }
        });
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        writeToParcel(parcel, ParseParcelEncoder.get());
    }

    public ParseFile(File file, String str) {
        this(new State.Builder().name(file.getName()).mimeType(str).build());
        this.file = file;
    }

    public void writeToParcel(Parcel parcel, ParseParcelEncoder parseParcelEncoder) {
        if (isDirty()) {
            throw new RuntimeException("Unable to parcel an unsaved ParseFile.");
        }
        parcel.writeString(getUrl());
        parcel.writeString(getName());
        String strMimeType = this.state.mimeType();
        parcel.writeByte(strMimeType != null ? (byte) 1 : (byte) 0);
        if (strMimeType != null) {
            parcel.writeString(strMimeType);
        }
    }

    public ParseFile(String str, byte[] bArr, String str2) {
        this(new State.Builder().name(str).mimeType(str2).build());
        this.data = bArr;
    }

    public Task<byte[]> getDataInBackground() {
        return getDataInBackground(null);
    }

    public Task<File> getFileInBackground() {
        return getFileInBackground(null);
    }

    public Task<Void> saveInBackground() {
        return saveInBackground((ProgressCallback) null);
    }

    public ParseFile(String str, byte[] bArr) {
        this(str, bArr, null);
    }

    public Task<Void> saveAsync(final String str, final ProgressCallback progressCallback, final Task<Void> task) {
        return this.taskQueue.enqueue(new Continuation<Void, Task<Void>>() { // from class: com.parse.ParseFile.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<Void> then(Task<Void> task2) {
                return ParseFile.this.saveAsync(str, progressCallback, task2, task);
            }
        });
    }

    public void saveInBackground(SaveCallback saveCallback) {
        ParseTaskUtils.callbackOnMainThreadAsync(saveInBackground(), saveCallback);
    }

    public ParseFile(Parcel parcel) {
        this(parcel, ParseParcelDecoder.get());
    }

    public ParseFile(Parcel parcel, ParseParcelDecoder parseParcelDecoder) {
        this(new State.Builder().url(parcel.readString()).name(parcel.readString()).mimeType(parcel.readByte() == 1 ? parcel.readString() : null).build());
    }

    public ParseFile(State state) {
        this.taskQueue = new TaskQueue();
        this.currentTasks = Collections.synchronizedSet(new HashSet());
        this.state = state;
    }

    public ParseFile(JSONObject jSONObject, ParseDecoder parseDecoder) {
        this(new State.Builder().name(jSONObject.optString("name")).url(jSONObject.optString(Constants.BRAZE_WEBVIEW_URL_EXTRA)).build());
    }
}
