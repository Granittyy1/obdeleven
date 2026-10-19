package com.parse;

import Q8.d;
import com.braze.Constants;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import com.parse.http.ParseHttpRequest;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class ParseFileController {
    private final File cachePath;
    private ParseHttpClient fileClient;
    private final Object lock = new Object();
    private final ParseHttpClient restClient;

    public ParseFileController(ParseHttpClient parseHttpClient, File file) {
        this.restClient = parseHttpClient;
        this.cachePath = file;
    }

    public Task<File> fetchAsync(final ParseFile.State state, String str, final ProgressCallback progressCallback, final Task<Void> task) {
        if (task != null && task.isCancelled()) {
            return Task.cancelled();
        }
        final File cacheFile = getCacheFile(state);
        return Task.call(new Callable<Boolean>() { // from class: com.parse.ParseFileController.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                return Boolean.valueOf(cacheFile.exists());
            }
        }, ParseExecutors.io()).continueWithTask(new Continuation<Boolean, Task<File>>() { // from class: com.parse.ParseFileController.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public Task<File> then(Task<Boolean> task2) {
                if (task2.getResult().booleanValue()) {
                    return Task.forResult(cacheFile);
                }
                Task task3 = task;
                if (task3 != null && task3.isCancelled()) {
                    return Task.cancelled();
                }
                final File tempFile = ParseFileController.this.getTempFile(state);
                return new ParseFileRequest(ParseHttpRequest.Method.GET, state.url(), tempFile).executeAsync(ParseFileController.this.fileClient(), (ProgressCallback) null, progressCallback, task).continueWithTask((Continuation<Void, Task<TContinuationResult>>) new Continuation<Void, Task<File>>() { // from class: com.parse.ParseFileController.3.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.parse.boltsinternal.Continuation
                    public Task<File> then(Task<Void> task4) throws Exception {
                        Task task5 = task;
                        if (task5 != null && task5.isCancelled()) {
                            throw new CancellationException();
                        }
                        if (task4.isFaulted()) {
                            ParseFileUtils.deleteQuietly(tempFile);
                            return task4.cast();
                        }
                        ParseFileUtils.deleteQuietly(cacheFile);
                        ParseFileUtils.moveFile(tempFile, cacheFile);
                        return Task.forResult(cacheFile);
                    }
                }, ParseExecutors.io());
            }
        });
    }

    public ParseHttpClient fileClient() {
        ParseHttpClient parseHttpClient;
        synchronized (this.lock) {
            try {
                if (this.fileClient == null) {
                    this.fileClient = ParsePlugins.get().fileClient();
                }
                parseHttpClient = this.fileClient;
            } catch (Throwable th) {
                throw th;
            }
        }
        return parseHttpClient;
    }

    public File getCacheFile(ParseFile.State state) {
        return new File(this.cachePath, state.name());
    }

    public File getTempFile(ParseFile.State state) {
        if (state.url() == null) {
            return null;
        }
        return new File(this.cachePath, d.a(new StringBuilder(), state.url(), ".tmp"));
    }

    public Task<ParseFile.State> saveAsync(final ParseFile.State state, final byte[] bArr, String str, ProgressCallback progressCallback, Task<Void> task) {
        if (state.url() != null) {
            return Task.forResult(state);
        }
        return (task == null || !task.isCancelled()) ? new ParseRESTFileCommand.Builder().fileName(state.name()).data(bArr).contentType(state.mimeType()).sessionToken(str).build().executeAsync(this.restClient, progressCallback, (ProgressCallback) null, task).onSuccess((Continuation<JSONObject, TContinuationResult>) new Continuation<JSONObject, ParseFile.State>() { // from class: com.parse.ParseFileController.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseFile.State then(Task<JSONObject> task2) throws Exception {
                JSONObject result = task2.getResult();
                ParseFile.State stateBuild = new ParseFile.State.Builder(state).name(result.getString("name")).url(result.getString(Constants.BRAZE_WEBVIEW_URL_EXTRA)).build();
                try {
                    ParseFileUtils.writeByteArrayToFile(ParseFileController.this.getCacheFile(stateBuild), bArr);
                } catch (IOException unused) {
                }
                return stateBuild;
            }
        }, ParseExecutors.io()) : Task.cancelled();
    }

    public Task<ParseFile.State> saveAsync(final ParseFile.State state, final File file, String str, ProgressCallback progressCallback, Task<Void> task) {
        if (state.url() != null) {
            return Task.forResult(state);
        }
        if (task != null && task.isCancelled()) {
            return Task.cancelled();
        }
        return new ParseRESTFileCommand.Builder().fileName(state.name()).file(file).contentType(state.mimeType()).sessionToken(str).build().executeAsync(this.restClient, progressCallback, (ProgressCallback) null, task).onSuccess((Continuation<JSONObject, TContinuationResult>) new Continuation<JSONObject, ParseFile.State>() { // from class: com.parse.ParseFileController.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.parse.boltsinternal.Continuation
            public ParseFile.State then(Task<JSONObject> task2) throws Exception {
                JSONObject result = task2.getResult();
                ParseFile.State stateBuild = new ParseFile.State.Builder(state).name(result.getString("name")).url(result.getString(Constants.BRAZE_WEBVIEW_URL_EXTRA)).build();
                try {
                    ParseFileUtils.copyFile(file, ParseFileController.this.getCacheFile(stateBuild));
                } catch (IOException unused) {
                }
                return stateBuild;
            }
        }, ParseExecutors.io());
    }
}
