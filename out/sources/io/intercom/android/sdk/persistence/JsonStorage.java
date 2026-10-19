package io.intercom.android.sdk.persistence;

import L7.a;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.h;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class JsonStorage {
    private static final Twig TWIG = LumberMill.getLogger();
    private final Gson gson;

    public interface LoadFailureHandler {
        public static final LoadFailureHandler NONE = new LoadFailureHandler() { // from class: io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler.1
            @Override // io.intercom.android.sdk.persistence.JsonStorage.LoadFailureHandler
            public void onLoadFailed(File file, Exception exc) {
            }
        };

        void onLoadFailed(File file, Exception exc);
    }

    public interface LoadHandler<T> {
        void onLoad(T t8);
    }

    public JsonStorage(Gson gson) {
        this.gson = gson;
    }

    public int getDirectoryFileCount(File file) {
        String[] list = file.list();
        if (list == null) {
            return 0;
        }
        return list.length;
    }

    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler) throws Throwable {
        loadFilesInDirectory(file, cls, loadHandler, LoadFailureHandler.NONE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void loadThenDelete(File file, Class<T> cls, LoadHandler<T> loadHandler) {
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                Gson gson = this.gson;
                gson.getClass();
                loadHandler.onLoad(gson.c(fileReader2, a.get((Class) cls)));
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader2);
            } catch (Exception unused) {
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
            } catch (Throwable th) {
                th = th;
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void saveToFileAsJson(Object obj, File file) {
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists() && !file.delete()) {
                    throw new RuntimeException("Couldn't delete existing file at " + file.getAbsolutePath());
                }
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    throw new RuntimeException("Couldn't create missing parent dir at " + parentFile.getAbsolutePath());
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    Gson gson = this.gson;
                    gson.getClass();
                    if (obj != null) {
                        try {
                            gson.j(obj, obj.getClass(), gson.g(fileWriter2));
                        } catch (IOException e10) {
                            throw new JsonIOException(e10);
                        }
                    } else {
                        try {
                            gson.i(h.f28825b, gson.g(fileWriter2));
                        } catch (IOException e11) {
                            throw new JsonIOException(e11);
                        }
                    }
                    IoUtils.closeQuietly(fileWriter2);
                } catch (Exception e12) {
                    e = e12;
                    fileWriter = fileWriter2;
                    TWIG.internal("Couldn't save file to disk: " + e);
                    IoUtils.closeQuietly(fileWriter);
                } catch (Throwable th) {
                    th = th;
                    fileWriter = fileWriter2;
                    IoUtils.closeQuietly(fileWriter);
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler, LoadFailureHandler loadFailureHandler) throws Throwable {
        FileReader fileReader;
        Exception e10;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        FileReader fileReader2 = null;
        for (File file2 : fileArrListFiles) {
            try {
                fileReader = new FileReader(file2);
                try {
                    try {
                        Gson gson = this.gson;
                        gson.getClass();
                        arrayList.add(gson.c(fileReader, a.get((Class) cls)));
                    } catch (Throwable th) {
                        th = th;
                        fileReader2 = fileReader;
                        IoUtils.closeQuietly(fileReader2);
                        throw th;
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    loadFailureHandler.onLoadFailed(file2, e10);
                }
            } catch (Exception e12) {
                fileReader = fileReader2;
                e10 = e12;
            } catch (Throwable th2) {
                th = th2;
            }
            IoUtils.closeQuietly(fileReader);
            fileReader2 = fileReader;
        }
        loadHandler.onLoad(arrayList);
    }
}
