package com.parse;

import com.parse.ParseObject;
import com.parse.boltsinternal.Task;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
class FileObjectStore<T extends ParseObject> implements ParseObjectStore<T> {
    private final String className;
    private final ParseObjectCurrentCoder coder;
    private final File file;

    public FileObjectStore(Class<T> cls, File file, ParseObjectCurrentCoder parseObjectCurrentCoder) {
        this(getSubclassingController().getClassName(cls), file, parseObjectCurrentCoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends ParseObject> T getFromDisk(ParseObjectCurrentCoder parseObjectCurrentCoder, File file, ParseObject.State.Init init) {
        try {
            return (T) ParseObject.from(parseObjectCurrentCoder.decode(init, ParseFileUtils.readFileToJSONObject(file), ParseDecoder.get()).isComplete(true).build());
        } catch (IOException | JSONException unused) {
            return null;
        }
    }

    private static ParseObjectSubclassingController getSubclassingController() {
        return ParseCorePlugins.getInstance().getSubclassingController();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveToDisk(ParseObjectCurrentCoder parseObjectCurrentCoder, ParseObject parseObject, File file) throws Throwable {
        try {
            ParseFileUtils.writeJSONObjectToFile(file, parseObjectCurrentCoder.encode(parseObject.getState(), null, PointerEncoder.get()));
        } catch (IOException unused) {
        }
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> deleteAsync() {
        return Task.call(new Callable<Void>() { // from class: com.parse.FileObjectStore.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                if (!FileObjectStore.this.file.exists() || ParseFileUtils.deleteQuietly(FileObjectStore.this.file)) {
                    return null;
                }
                throw new RuntimeException("Unable to delete");
            }
        }, ParseExecutors.io());
    }

    @Override // com.parse.ParseObjectStore
    public Task<T> getAsync() {
        return Task.call(new Callable<T>() { // from class: com.parse.FileObjectStore.2
            @Override // java.util.concurrent.Callable
            public T call() {
                if (FileObjectStore.this.file.exists()) {
                    return (T) FileObjectStore.getFromDisk(FileObjectStore.this.coder, FileObjectStore.this.file, ParseObject.State.newBuilder(FileObjectStore.this.className));
                }
                return null;
            }
        }, ParseExecutors.io());
    }

    @Override // com.parse.ParseObjectStore
    public Task<Void> setAsync(final T t8) {
        return Task.call(new Callable<Void>() { // from class: com.parse.FileObjectStore.1
            @Override // java.util.concurrent.Callable
            public Void call() throws Throwable {
                FileObjectStore.saveToDisk(FileObjectStore.this.coder, t8, FileObjectStore.this.file);
                return null;
            }
        }, ParseExecutors.io());
    }

    public FileObjectStore(String str, File file, ParseObjectCurrentCoder parseObjectCurrentCoder) {
        this.className = str;
        this.file = file;
        this.coder = parseObjectCurrentCoder;
    }
}
